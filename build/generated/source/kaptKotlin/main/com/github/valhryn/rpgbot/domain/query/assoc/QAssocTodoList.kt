package com.github.valhryn.rpgbot.domain.query.assoc;

import com.github.valhryn.rpgbot.domain.TodoList;
import com.github.valhryn.rpgbot.domain.query.QTodoList;
import io.ebean.Transaction;
import io.ebean.typequery.Generated;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocTodoList.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean("v1")
class QAssocTodoList<R> : TQAssocBean<TodoList,R> {

  lateinit var id: PLong<R>
  lateinit var whenModified: PInstant<R>
  lateinit var whenCreated: PInstant<R>
  lateinit var item: PString<R>
  lateinit var userId: PString<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QTodoList>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QTodoList>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  fun fetchCache(vararg properties: TQProperty<QTodoList>) : R {
    return fetchCacheProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QTodoList>) : R {
    return fetchLazyProperties(*properties)
  }

  constructor(name: String, root: R) : super(name, root)

  constructor(name: String, root: R, prefix: String) : super(name, root, prefix)
}
