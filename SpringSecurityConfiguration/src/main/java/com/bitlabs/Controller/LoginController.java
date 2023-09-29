package com.bitlabs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
      
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome.html";
          
    }
      
    @GetMapping("/login")
    public String login() {
        return "Login.html";
          
    }
}