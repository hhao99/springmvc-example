package com.acn.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class BlogApplication

data class User(var name: String = "")
@Controller
class Home {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("user",User("Spring boot"))
        return "index"

    }
    @PostMapping("/sayHello")
    fun sayHello(@ModelAttribute("user") user: User,model: Model): String {
        model.addAttribute("user",user)

        return "index"

    }
}
fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}
