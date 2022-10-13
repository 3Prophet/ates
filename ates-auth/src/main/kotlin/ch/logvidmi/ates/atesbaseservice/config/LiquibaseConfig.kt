package ch.logvidmi.ates.atesbaseservice.config

import liquibase.integration.spring.SpringLiquibase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource


@Configuration
class LiquibaseConfig {
    @Bean
    fun liquibase(dataSource: DataSource?): SpringLiquibase {
        val liquibase = SpringLiquibase()
        liquibase.setShouldRun(true)
        liquibase.changeLog = "classpath:db/changelog/db.changelog-master.xml"
        liquibase.dataSource = dataSource
        liquibase.defaultSchema = "test"
        return liquibase
    }
}