package br.com.jonnatas.kotlinbasic

import br.com.jonnatas.kotlinbasic.dao.CustomerDAO
import br.com.jonnatas.kotlinbasic.model.Customer
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
open class KotlinBasicApplication {

    @Bean
    open fun int(repository: CustomerDAO) = CommandLineRunner {
        repository.save(Customer("Winston", "Churchill"))
        repository.save(Customer("Albert", "Einstein"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinBasicApplication::class.java, *args)
}