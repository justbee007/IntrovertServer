package com.introvert.server.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping("/")
    public String welcome()
    {
        return "Welcome to google";
    }
    @GetMapping("/details")
    public Principal user(Principal principal)
    {
        return principal;
    }

}
