package com.acn.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employee")
class EmployeeController(val repo: EmployeeRepository) {
    @GetMapping("/")
    fun findAllEmployee() = repo.findAll()
    @GetMapping("/id/{id}")
    fun findEmployeeById(@PathVariable id: Long) = repo.findById(id)
}