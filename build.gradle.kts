plugins {
    java
}

group = "com.iosoftworks.st"
version = "0.1.0-alpha+build.000"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.googlecode.lanterna", "lanterna", "3.0.3")
    testImplementation("junit", "junit", "4.12")
}