package com.github.valhryn.rpgbot.models

import io.ebean.Model
import io.ebean.annotation.WhenCreated
import io.ebean.annotation.WhenModified
import java.time.Instant
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class Base : Model() {

    @Id
    var id: Long = 0

    @WhenModified
    lateinit var whenModified: Instant

    @WhenCreated
    lateinit var whenCreated: Instant
}