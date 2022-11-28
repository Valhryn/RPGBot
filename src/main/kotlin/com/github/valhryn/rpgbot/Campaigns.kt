package com.github.valhryn.rpgbot

import com.github.valhryn.rpgbot.systemCharacters.characterDND5
import javax.persistence.Entity

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
class Campaign(name : String, chosenSystem : String) : BaseModel() {

    var gameMaster: String = name
    var system: String = chosenSystem
    var playerList = mutableListOf<characterDND5>()

    fun addPlayer(newPlayer : characterDND5){
        playerList.add(newPlayer)
    }

    //How to add system-based methods. Maybe more tables? Player-based methods? 1 class "System" (If yes, find file format)
}