package com.github.valhryn.rpgbot.models.character.systems

import com.github.valhryn.rpgbot.models.Base
import com.github.valhryn.rpgbot.models.character.Character
import io.ebean.annotation.DbEnumType
import io.ebean.annotation.DbEnumValue
import javax.persistence.Column
import javax.persistence.OneToOne
import javax.persistence.Table
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

/**
 * All system types.
 */
enum class SystemTypes(val system: KClass<out CharacterSystem>) {
    DND5(DND5System::class)
}

/**
 * All character systems should inherit this.
 */
open class CharacterSystem(character: Character) : Base() {
    @OneToOne
    @Column(unique = true)
    val character: Character = character
}