package com.github.valhryn.rpgbot.systemCharacters

import io.ebean.Model
import javax.persistence.Entity

@Entity
class characterDND5(name : String) : Model() {

    var name: String = name  // Kotlin non-nullable type

}