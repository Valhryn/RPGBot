package com.github.valhryn.rpgbot.extensions;

import java.lang.System;

@kotlin.OptIn(markerClass = {dev.kord.common.annotation.KordPreview.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/TodoExtension;", "Lcom/kotlindiscord/kord/extensions/extensions/Extension;", "()V", "config", "Lcom/github/valhryn/rpgbot/Config;", "getConfig", "()Lcom/github/valhryn/rpgbot/Config;", "config$delegate", "Lkotlin/Lazy;", "name", "", "getName", "()Ljava/lang/String;", "setup", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateTodoArgs", "TodoOperation", "RPGBot"})
public final class TodoExtension extends com.kotlindiscord.kord.extensions.extensions.Extension {
    private final kotlin.Lazy config$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = "Hello";
    
    public TodoExtension() {
        super();
    }
    
    private final com.github.valhryn.rpgbot.Config getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object setup(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/TodoExtension$TodoOperation;", "", "Lcom/kotlindiscord/kord/extensions/commands/application/slash/converters/ChoiceEnum;", "(Ljava/lang/String;I)V", "Create", "List", "RPGBot"})
    public static enum TodoOperation implements com.kotlindiscord.kord.extensions.commands.application.slash.converters.ChoiceEnum {
        /*public static final*/ Create /* = new @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/TodoExtension$TodoOperation$Create;", "Lcom/github/valhryn/rpgbot/extensions/TodoExtension$TodoOperation;", "readableName", "", "getReadableName", "()Ljava/lang/String;", "RPGBot"}) Create(){
    @org.jetbrains.annotations.NotNull
    private final java.lang.String readableName = "create";
    
    Create() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getReadableName() {
        return null;
    }
} */,
        /*public static final*/ List /* = new @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/TodoExtension$TodoOperation$List;", "Lcom/github/valhryn/rpgbot/extensions/TodoExtension$TodoOperation;", "readableName", "", "getReadableName", "()Ljava/lang/String;", "RPGBot"}) List(){
    @org.jetbrains.annotations.NotNull
    private final java.lang.String readableName = "list";
    
    List() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getReadableName() {
        return null;
    }
} */;
        
        TodoOperation() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/TodoExtension$CreateTodoArgs;", "Lcom/kotlindiscord/kord/extensions/commands/Arguments;", "(Lcom/github/valhryn/rpgbot/extensions/TodoExtension;)V", "item", "", "getItem", "()Ljava/lang/String;", "item$delegate", "Lcom/kotlindiscord/kord/extensions/commands/converters/SingleConverter;", "RPGBot"})
    public final class CreateTodoArgs extends com.kotlindiscord.kord.extensions.commands.Arguments {
        @org.jetbrains.annotations.NotNull
        private final com.kotlindiscord.kord.extensions.commands.converters.SingleConverter item$delegate = null;
        
        public CreateTodoArgs() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getItem() {
            return null;
        }
    }
}