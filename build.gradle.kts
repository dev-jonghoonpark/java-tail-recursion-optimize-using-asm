plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

sourceSets {
    main {
        java {
            srcDir("$projectDir/asm")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly(files("$projectDir/asm"))

    implementation("org.ow2.asm:asm:9.6")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
