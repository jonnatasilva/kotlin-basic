package br.com.jonnatas.kotlinbasic.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Customer {
    /*
     * Created by root on 16/05/17.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    var firstName: String = ""
    var lastName: String = ""

    constructor() {

    }

    constructor(fn: String, ln: String) {
        this.firstName = fn
        this.lastName = ln
    }
}
