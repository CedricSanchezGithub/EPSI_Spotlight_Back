plugins {
	kotlin("jvm") version "2.0.20"
	kotlin("plugin.spring") version "2.0.20"
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
	kotlin("plugin.jpa") version "2.0.20"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

kotlin {
	jvmToolchain(17)
}

repositories {
	mavenCentral()
}

dependencies {
	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
		implementation("org.springframework.boot:spring-boot-starter-web-services")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		developmentOnly("org.springframework.boot:spring-boot-devtools")

		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
		testRuntimeOnly("org.junit.platform:junit-platform-launcher")
		implementation("mysql:mysql-connector-java:8.0.33")
	}
}

//kotlin {
//	compilerOptions {
//		freeCompilerArgs.addAll("-Xjsr305=strict")
//	}
//}

tasks.withType<Test> {
	useJUnitPlatform()
}
