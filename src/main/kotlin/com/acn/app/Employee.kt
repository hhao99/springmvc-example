package com.acn.app

import javax.persistence.*


@Entity
class Employee(
        var firstName: String = "",
        var lastName: String ="",
        @Id
        @GeneratedValue
        val id: Long = 0
)