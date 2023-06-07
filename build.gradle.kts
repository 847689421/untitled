plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
//    mavenCentral()
    maven(url="https://1maven.aliyun.com/nexus/content/groups/public")
    maven {
        setUrl("https://1maven.aliyun.com/nexus/content/groups/public")
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}