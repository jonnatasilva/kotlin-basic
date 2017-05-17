package br.com.jonnatas.kotlinbasic.controller

import br.com.jonnatas.kotlinbasic.dao.CustomerDAO
import org.springframework.web.bind.annotation.*

/**
 * Created by root on 16/05/17.
 */

@RestController
@RequestMapping("/customers")
class CustomerController(val repository:CustomerDAO) {


    @RequestMapping("/")
    fun findAll() = repository.findAll()

    @RequestMapping("/{lastName}")
    fun findByLastName(@PathVariable("lastName") lastName: String) = repository.findByLastName(lastName)
}