repositories {
    maven("http://nexus.okkero.com/repository/maven-releases/")
    maven("https://repo.codemc.org/repository/maven-public")
}

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    api("com.okkero.skedule:skedule:1.2.6") {
        exclude(group = "org.jetbrains.kotlin")
    }
    implementation("org.bstats:bstats-bukkit:1.7")
}