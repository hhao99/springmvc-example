package com.acn.app


import com.acn.app.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository: CrudRepository<Employee, Long> {

}