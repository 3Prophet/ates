
rootProject.name = "ates"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val springVersion: String by settings
        val springDependencyManagementVersion: String by settings
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion
        id("org.springframework.boot") version springVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
    }
}

//include("ates-base-service")
//include("ates-frontend")
include("ates-discovery")
include("ates-gateway")
