package com.example.springBootJwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String helloWorld()
    {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/admin")
    public String helloAdmin()
    {
        return "<h1>Hello Admin</h1>";
    }

    @GetMapping("/user")
    public String helloUser()
    {
        return "<h1>Hello User</h1>";
    }



}
