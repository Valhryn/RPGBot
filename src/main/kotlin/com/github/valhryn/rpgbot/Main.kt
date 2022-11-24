package com.github.valhryn.rpgbot

import com.github.valhryn.rpgbot.extensions.TodoExtension
import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kord.extensions.koin.KordExContext
import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addFileSource
import io.ebean.Database
import io.ebean.DatabaseFactory
import io.ebean.config.DatabaseConfig
import io.ebean.datasource.DataSourceConfig
import org.koin.dsl.bind
import org.koin.dsl.module
import java.io.File
import java.security.Security

suspend fun main(args: Array<String>) {
    // For windows
    System.setProperty("io.ktor.random.secure.random.provider", "DRBG")
    Security.setProperty("securerandom.drbg.config", "HMAC_DRBG,SHA-512,256,pr_and_reseed")

    val config = ConfigLoaderBuilder.default()
        .addFileSource(File("config.yaml"))
        .build()
        .loadConfigOrThrow<Config>()

    val bot = ExtensibleBot(config.discord.token) {
        hooks {
            beforeKoinSetup {
                KordExContext.get().loadModules(listOf(module {
                    single { config } bind Config::class
                    single { createDatabase(config.database) } bind Database::class
                }))
            }
        }

        extensions {
            add(::TodoExtension)
        }
    }

    bot.start()
}

fun createDatabase(databaseConfig: com.github.valhryn.rpgbot.DatabaseConfig): Database {
    val dataSourceConfig = DataSourceConfig()
    dataSourceConfig.username = databaseConfig.username
    dataSourceConfig.password = databaseConfig.password
    dataSourceConfig.url = databaseConfig.url

    val config = DatabaseConfig()
    config.dataSourceConfig = dataSourceConfig

    return DatabaseFactory.create(config)
}
