package com.acn.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class BlogApplication

data class User(val name: String)
@Controller
class Home {
    @RequestMapping("/")
    fun index(model: Model): String {
        val user1 = User("Eric")
       model["user"] = user1
        return "index"

    }
}
fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}
