package com.acn.app

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class TimeRecordApplication {
    private val log = LoggerFactory.getLogger("TimeRecord Applicaiton")

    @Bean
    fun init(repo: EmployeeRepository) = CommandLineRunner {
        log.info(" start the commandline")
        log.info("add some employee record")

        repo.save(Employee("Eric","Hao"))
        repo.save(Employee("John","Lee"))
    }
}

fun main(args: Array<String>) {
    runApplication<TimeRecordApplication>(*args)
}
