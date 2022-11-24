package com.github.valhryn.rpgbot

/**
 * Application config, loaded by hoplite.
 */
data class Config(val discord: Discord, val database: DatabaseConfig)
data class Discord(val token: String, val guildId: String)
data class DatabaseConfig(val username: String, val password: String, val url: String)