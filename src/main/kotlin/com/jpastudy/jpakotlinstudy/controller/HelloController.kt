package com.jpastudy.jpakotlinstudy.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("hello")
    fun hello(model: Model): String {
        model["data"] = "서버 받은 값"

        return "hello"
    }
}