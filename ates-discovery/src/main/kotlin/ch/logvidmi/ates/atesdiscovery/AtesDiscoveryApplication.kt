package ch.logvidmi.ates.atesdiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class AtesDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<AtesDiscoveryApplication>(*args)
}
