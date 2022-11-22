package com.github.valhryn.rpgbot.extensions

import com.github.valhryn.rpgbot.Config
import com.kotlindiscord.kord.extensions.commands.Arguments
import com.kotlindiscord.kord.extensions.commands.converters.impl.defaultingString
import com.kotlindiscord.kord.extensions.commands.converters.impl.user
import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import com.kotlindiscord.kord.extensions.types.respond
import dev.kord.common.annotation.KordPreview
import dev.kord.common.entity.Snowflake
import org.koin.core.component.inject

@OptIn(KordPreview::class)
class CampaignExtension : Extension() {
    private val config: Config by inject()

    override val name = "Hello"

    override suspend fun setup() {
        publicSlashCommand(::SlapArgs) {
            name = "campaignsetup"
            description = "Sets up a campaign"

            guild(Snowflake(config.discord.guildId))

            action {
                // Because of the DslMarker annotation KordEx uses, we need to grab Kord explicitly
                // TODO: Why? (Josh)
                val kord = this@CampaignExtension.kord

                // Don't slap ourselves on request, slap the requester!
                val realTarget = if (arguments.target.id == kord.selfId) {
                    member
                } else {
                    arguments.target
                }

                respond {
                    content = "*slaps ${realTarget?.mention} with their ${arguments.weapon}*"
                }
            }
        }
    }

    inner class SlapArgs : Arguments() {
        val target by user {
            name = "target"
            description = "Person you want to slap"
        }

        val weapon by defaultingString {
            name = "weapon"

            defaultValue = "large, smelly trout"
            description = "What you want to slap with"
        }
    }
}