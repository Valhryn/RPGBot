package com.github.valhryn.rpgbot.models.character

import com.github.valhryn.rpgbot.Campaign
import com.github.valhryn.rpgbot.models.Base
import com.github.valhryn.rpgbot.models.character.systems.SystemTypes
import javax.persistence.*

// name : String, race : String, job : String, abilityScores : IntArray

@Entity
@Table(name = "character")
class Character(name: String, ) : Base() {
    @Column(unique=true)
    var name: String = name

    @ManyToOne(optional = false)
    lateinit var campaign : Campaign

    val systemType: SystemTypes

//    @OneToMany(mappedBy = "CharacterDND5")
//    lateinit var items : DnDEquipment
}