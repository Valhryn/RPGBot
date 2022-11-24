package com.github.valhryn.rpgbot.extensions;

import java.lang.System;

@kotlin.OptIn(markerClass = {dev.kord.common.annotation.KordPreview.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/CampaignExtension;", "Lcom/kotlindiscord/kord/extensions/extensions/Extension;", "()V", "config", "Lcom/github/valhryn/rpgbot/Config;", "getConfig", "()Lcom/github/valhryn/rpgbot/Config;", "config$delegate", "Lkotlin/Lazy;", "name", "", "getName", "()Ljava/lang/String;", "setup", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SlapArgs", "RPGBot"})
public final class CampaignExtension extends com.kotlindiscord.kord.extensions.extensions.Extension {
    private final kotlin.Lazy config$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = "Hello";
    
    public CampaignExtension() {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/github/valhryn/rpgbot/extensions/CampaignExtension$SlapArgs;", "Lcom/kotlindiscord/kord/extensions/commands/Arguments;", "(Lcom/github/valhryn/rpgbot/extensions/CampaignExtension;)V", "target", "Ldev/kord/core/entity/User;", "getTarget", "()Ldev/kord/core/entity/User;", "target$delegate", "Lcom/kotlindiscord/kord/extensions/commands/converters/SingleConverter;", "weapon", "", "getWeapon", "()Ljava/lang/String;", "weapon$delegate", "Lcom/kotlindiscord/kord/extensions/commands/converters/DefaultingConverter;", "RPGBot"})
    public final class SlapArgs extends com.kotlindiscord.kord.extensions.commands.Arguments {
        @org.jetbrains.annotations.NotNull
        private final com.kotlindiscord.kord.extensions.commands.converters.SingleConverter target$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final com.kotlindiscord.kord.extensions.commands.converters.DefaultingConverter weapon$delegate = null;
        
        public SlapArgs() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.kord.core.entity.User getTarget() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getWeapon() {
            return null;
        }
    }
}