package com.github.valhryn.rpgbot.domain.query;

import com.github.valhryn.rpgbot.domain.TodoList;
import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.Generated;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for TodoList.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean("v1")
class QTodoList : TQRootBean<TodoList, QTodoList> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QTodoList(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QTodoList {
      return QTodoList(FetchGroup.queryFor(TodoList::class.java));
    }
  }

  lateinit var id: PLong<QTodoList>
  lateinit var whenModified: PInstant<QTodoList>
  lateinit var whenCreated: PInstant<QTodoList>
  lateinit var item: PString<QTodoList>
  lateinit var userId: PString<QTodoList>

  /**
   * Construct using the default Database.
   */
  constructor() : super(TodoList::class.java)

  /**
   * Construct with a given Transaction.
   */
  constructor(transaction: Transaction) : super(TodoList::class.java, transaction)


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(TodoList::class.java, database)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<TodoList>) : super(fetchGroupQuery)
}
