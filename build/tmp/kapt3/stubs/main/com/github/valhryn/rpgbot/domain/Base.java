package com.github.valhryn.rpgbot.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/github/valhryn/rpgbot/domain/Base;", "Lio/ebean/Model;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "whenCreated", "Ljava/time/Instant;", "getWhenCreated", "()Ljava/time/Instant;", "setWhenCreated", "(Ljava/time/Instant;)V", "whenModified", "getWhenModified", "setWhenModified", "RPGBot"})
@javax.persistence.MappedSuperclass
public class Base extends io.ebean.Model {
    @javax.persistence.Id
    private long id = 0L;
    @io.ebean.annotation.WhenModified
    public java.time.Instant whenModified;
    @io.ebean.annotation.WhenCreated
    public java.time.Instant whenCreated;
    
    public Base() {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.Instant getWhenModified() {
        return null;
    }
    
    public final void setWhenModified(@org.jetbrains.annotations.NotNull
    java.time.Instant p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.Instant getWhenCreated() {
        return null;
    }
    
    public final void setWhenCreated(@org.jetbrains.annotations.NotNull
    java.time.Instant p0) {
    }
}