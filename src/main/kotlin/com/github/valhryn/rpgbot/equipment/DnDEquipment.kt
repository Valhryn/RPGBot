package com.github.valhryn.rpgbot.equipment

import com.github.valhryn.rpgbot.domain.Base
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class CharacterDND5(name : String) : Base() {

    var name: String = name

    @ManyToOne(optional = false)
    lateinit var characterHolding : CharacterDND5
}