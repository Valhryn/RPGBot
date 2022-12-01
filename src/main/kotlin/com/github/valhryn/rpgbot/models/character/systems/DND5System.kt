package com.github.valhryn.rpgbot.models.character.systems

import com.github.valhryn.rpgbot.models.Base
import com.github.valhryn.rpgbot.models.character.Character
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "character_system_dnd5")
class DND5System(character: Character) : CharacterSystem(character) {

}