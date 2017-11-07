import org.gradle.kotlin.dsl.repositories

plugins {
    id("org.jetbrains.intellij") version "0.2.17"
}

group = "cn.javaer"
version = "1.0-SNAPSHOT"

intellij {
    version = "2017.2.5"
    updateSinceUntilBuild = false
    setPlugins("net.seesharpsoft.intellij.plugins.csv:1.3",
            "com.vladsch.idea.multimarkdown:2.3.8")
}