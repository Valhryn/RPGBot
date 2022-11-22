package com.github.valhryn.rpgbot.extensions

import com.github.valhryn.rpgbot.Config
import com.github.valhryn.rpgbot.domain.TodoList
import com.kotlindiscord.kord.extensions.commands.Arguments
import com.kotlindiscord.kord.extensions.commands.application.slash.converters.ChoiceEnum
import com.kotlindiscord.kord.extensions.commands.application.slash.converters.impl.enumChoice
import com.kotlindiscord.kord.extensions.commands.application.slash.group
import com.kotlindiscord.kord.extensions.commands.converters.impl.defaultingString
import com.kotlindiscord.kord.extensions.commands.converters.impl.string
import com.kotlindiscord.kord.extensions.commands.converters.impl.user
import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import com.kotlindiscord.kord.extensions.types.respond
import dev.kord.common.annotation.KordPreview
import dev.kord.common.entity.Snowflake
import dev.kord.rest.builder.message.create.embed
import org.koin.core.component.inject

@OptIn(KordPreview::class)
class TodoExtension : Extension() {
    private val config: Config by inject()

    override val name = "Hello"

    override suspend fun setup() {
        publicSlashCommand {
            name = "todo"
            description = "Manage todo list"

            guild(Snowflake(config.discord.guildId))

            group("type") {
                description = "Operation on to-do list"

                publicSlashCommand(::CreateTodoArgs) {
                    name = "create"
                    description = "Create a to-do item"

                    action {
                        val todo = TodoList(arguments.item, member?.id?.value.toString())
                        todo.save()

                        respond {
                            embed {
                                title = "TodoList item created."
                                description = todo.item
                            }
                        }
                    }
                }

                publicSlashCommand {
                    name = "list"
                    description = "List all slash commands"

                    action {
                         respond {
                             content = "TODO"
                         }
                    }
                }
            }
//
//            action {
//                // Because of the DslMarker annotation KordEx uses, we need to grab Kord explicitly
//                // TODO: Why? (Josh)
//                val kord = this@TodoExtension.kord
//
//                // Don't slap ourselves on request, slap the requester!
//                val realTarget = if (arguments.target.id == kord.selfId) {
//                    member
//                } else {
//                    arguments.target
//                }
//
//                respond {
//                    content = "*slaps ${realTarget?.mention} with their ${arguments.weapon}*"
//                }
//            }
        }
    }

    enum class TodoOperation : ChoiceEnum {
        Create {
            override val readableName = "create"
        },
        List {
            override val readableName = "list"
        }
    }

    inner class CreateTodoArgs : Arguments() {
        val item by string {
            name = "item"
            description = "Todo list item."
        }
    }
}