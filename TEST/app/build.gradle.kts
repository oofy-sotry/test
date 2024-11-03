plugins {
    application
    id("org.springframework.boot") version "2.6.2"
    kotlin("jvm") version "1.8.0" // Kotlin 버전을 업데이트
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("org.springframework.boot:spring-boot-starter-web")

    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    compileOnly("javax.servlet.jsp:javax.servlet.jsp-api:2.3.3")
    compileOnly("javax.servlet.jsp.jstl:javax.servlet.jsp.jstl-api:1.2.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("your.package.name.YourApplicationKt") // 메인 클래스 경로로 수정
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
