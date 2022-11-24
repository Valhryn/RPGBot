package com.github.valhryn.rpgbot.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/github/valhryn/rpgbot/domain/TodoList;", "Lcom/github/valhryn/rpgbot/domain/Base;", "item", "", "userId", "(Ljava/lang/String;Ljava/lang/String;)V", "getItem", "()Ljava/lang/String;", "setItem", "(Ljava/lang/String;)V", "getUserId", "RPGBot"})
@javax.persistence.Table(name = "todo_list")
@javax.persistence.Entity
public final class TodoList extends com.github.valhryn.rpgbot.domain.Base {
    @org.jetbrains.annotations.NotNull
    @io.ebean.annotation.Length(value = 100)
    private java.lang.String item;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    
    public TodoList(@org.jetbrains.annotations.NotNull
    java.lang.String item, @org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
}