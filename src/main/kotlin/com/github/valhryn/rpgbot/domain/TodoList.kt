package com.github.valhryn.rpgbot.domain

import com.github.valhryn.rpgbot.domain.query.QTodoList
import io.ebean.Finder
import io.ebean.annotation.Length
import kotlinx.coroutines.selects.select
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="todo_list")
class TodoList(item: String, userId: String) : Base() {
    @Length(100)
    var item: String = item
    val userId: String = userId
//
//    companion object Find : Finder<Long, TodoList>(TodoList::class.java) {
//        suspend fun getAllById(userId: String): List<TodoList> {
////            QTodoList._a/lias
//            select<TodoList> {
//
//            }
////            return QTodoList()
////                .select(c.id, c.name)
////                .name.istartsWith(name)
////                .findOne()
//        }
//    }
}