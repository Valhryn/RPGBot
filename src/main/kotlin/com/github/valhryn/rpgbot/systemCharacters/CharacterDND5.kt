package com.github.valhryn.rpgbot.systemCharacters

import com.github.valhryn.rpgbot.Campaign
import com.github.valhryn.rpgbot.domain.Base
import dev.kord.common.entity.optional.optional
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class CharacterDND5(name : String) : Base() {

    var name: String = name

    @ManyToOne(optional = false)
    lateinit var campaign : Campaign
}