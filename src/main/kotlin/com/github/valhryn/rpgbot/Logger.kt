package com.github.valhryn.rpgbot

import org.slf4j.LoggerFactory
import java.lang.System.Logger.Level
import java.util.logging.Logger.getLogger

private object Logger {
    val logger: org.slf4j.Logger = LoggerFactory.getLogger(Logger::class.java)
}

fun log() = Logger.logger