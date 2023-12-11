package com.security.infy.springbootsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {

    // Request handlers method
    @GetMapping("/")
    @ResponseBody
    public String indexPage() {
        return "welcome to spring security ...";
    }

}
