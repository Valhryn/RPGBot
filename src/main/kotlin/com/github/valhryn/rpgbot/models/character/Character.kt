package com.github.valhryn.rpgbot.models.character

import com.github.valhryn.rpgbot.Campaign
import com.github.valhryn.rpgbot.models.Base
import com.github.valhryn.rpgbot.models.character.systems.CharacterSystem
import com.github.valhryn.rpgbot.models.character.systems.SystemTypes
import io.ebean.DB
import javax.persistence.*

// name : String, race : String, job : String, abilityScores : IntArray

@Entity
@Table(name = "character")
class Character(name: String, systemTypes: SystemTypes, systemId: Int) : Base() {
    @Column(unique=true)
    var name: String = name

    @ManyToOne(optional = false)
    lateinit var campaign : Campaign

    val systemType: SystemTypes = systemTypes
    val systemId: Int = systemId

    /**
     * Get the system related to this character.
     */
    fun getSystem(): CharacterSystem? =
        DB.find(systemType.system.java)
            .where().eq("id", systemId)
            .findOne()
}