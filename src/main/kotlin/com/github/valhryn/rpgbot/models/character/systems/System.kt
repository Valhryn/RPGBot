package com.github.valhryn.rpgbot.models.character.systems

import com.github.valhryn.rpgbot.models.Base
import com.github.valhryn.rpgbot.models.character.Character
import io.ebean.annotation.DbEnumType
import io.ebean.annotation.DbEnumValue
import javax.persistence.Column
import javax.persistence.OneToOne
import kotlin.reflect.KClass

/**
 * All system types.
 */
enum class SystemTypes(val system: KClass<out CharacterSystem>) {
    DND5(DND5System::class);

    @DbEnumValue(storage = DbEnumType.VARCHAR)
    open fun getValue(): String? {
        return
    }
}

/**
 * All character systems should inherit this.
 */
open class CharacterSystem(character: Character) : Base() {
    @OneToOne
    @Column(unique = true)
    val character: Character = character
}