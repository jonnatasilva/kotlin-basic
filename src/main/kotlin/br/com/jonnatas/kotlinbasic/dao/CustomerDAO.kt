package br.com.jonnatas.kotlinbasic.dao

import br.com.jonnatas.kotlinbasic.model.Customer
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by root on 16/05/17.
 */
interface CustomerDAO : JpaRepository<Customer, Long> {

    fun findByLastName(lastName : String): List<Customer>
}
