package com.github.valhryn.rpgbot

import com.github.valhryn.rpgbot.models.Base
import com.github.valhryn.rpgbot.models.character.CharacterDND5
import javax.persistence.Entity
import javax.persistence.OneToMany

//class Campaigns {
//    private int dmID;
//    //How to store players of the campaign
//    private String campaignName;
//    public String system;
//
//    init{
//        dmID = //Getting dm who creates campaign?
//    }
//}

@Entity
class Campaign(name : String, chosenSystem : String) : Base() {

    var gameMaster: String = name
    var system: String = chosenSystem

    @OneToMany(mappedBy="Campaign")
    var players: MutableList<CharacterDND5> = mutableListOf()

    //How to add system-based methods. Maybe more tables? Player-based methods? 1 class "System" (If yes, find file format)
}