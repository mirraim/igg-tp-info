plugins {
	java
	id("org.springframework.boot") version "3.5.8"
	id("io.spring.dependency-management") version "1.1.7"
	id("org.openapi.generator") version "7.18.0"
}

group = "ru.mirraim"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.liquibase:liquibase-core")
	implementation("org.postgresql:postgresql:42.6.0")
	implementation("io.swagger.core.v3:swagger-annotations:2.1.12")

	compileOnly("org.projectlombok:lombok")

	annotationProcessor("org.projectlombok:lombok")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("org.testcontainers:junit-jupiter")

	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

//sourceSets {
//	main {
//		java {
//			srcDirs += "$buildDir/generated"
//		}
//	}
//}

openApiGenerate {
	generatorName.set("spring")
	inputSpec.set("$projectDir/src/main/resources/spec/api-swagger.yaml")
	outputDir = "${buildDir.path}/openapi"
	apiPackage.set("ru.mirraim.igg.tp.analytics.api")
	modelPackage.set("ru.mirraim.igg.tp.analytics.model")
	ignoreFileOverride.set("${projectDir.path}/src/main/resources/spec/openapi-generator-ignore")
	configOptions.set(
		mapOf(
			"library" to "spring-boot",
			"generateApis" to "true",
			"generateApiTests" to "false",
			"generateModels" to "true",
			"generateModelTests" to "false",
			"generateModelDocumentation" to "false",
			"generateSupportingFiles" to "false",
			"hideGenerationTimestamp" to "true",
			"interfaceOnly" to "true",
			"serializableModel" to "true",
			"useBeanValidation" to "true",
			"useTags" to "true",
			"implicitHeaders" to "true",
			"openApiNullable" to "false",
			"oas3" to "false",
		)
	)
}


tasks.withType<JavaCompile> {
	dependsOn(tasks.openApiGenerate)
}
