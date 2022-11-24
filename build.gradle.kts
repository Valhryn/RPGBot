import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("io.ebean") version "13.6.5"
    kotlin("kapt") version "1.7.21"
    application
}

group = "com.github.valhryn.rpgbot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://maven.kotlindiscord.com/repository/maven-public/")
}

dependencies {
    implementation("dev.kord:kord-core:0.8.x-SNAPSHOT")
    implementation("com.sksamuel.hoplite:hoplite-core:2.6.5")
    implementation("com.sksamuel.hoplite:hoplite-yaml:2.6.5")
    implementation("org.slf4j:slf4j-simple:2.0.3")
    implementation("com.kotlindiscord.kord.extensions:kord-extensions:1.5.5-SNAPSHOT")

    implementation("io.ebean:ebean:13.6.5")
    // query bean generation
    kapt("io.ebean:kotlin-querybean-generator:13.6.5")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

ebean {
    debugLevel = 1
}

application {
    mainClass.set("com.github.valhryn.rpgbot.MainKt")
}