package com.github.valhryn.rpgbot.systemCharacters

import com.github.valhryn.rpgbot.Campaign
import com.github.valhryn.rpgbot.equipment.DnDEquipment
import com.github.valhryn.rpgbot.domain.Base
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
class CharacterDND5(name : String, race : String, job : String, abilityScores : IntArray) : Base() {

    var name: String = name

    @ManyToOne(optional = false)
    lateinit var campaign : Campaign

    @OneToMany(mappedBy = "CharacterDND5")
    lateinit var items : DnDEquipment
}