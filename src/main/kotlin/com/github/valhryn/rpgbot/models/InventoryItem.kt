package com.github.valhryn.rpgbot.models.equipment

import com.github.valhryn.rpgbot.models.Base
import javax.persistence.Entity
import javax.persistence.Table

/**
 * An item in a characters inventory
 */
@Entity
@Table(name = "inventory_item")
class InventoryItem(name : String) : Base() {
    var itemName: String = name
}