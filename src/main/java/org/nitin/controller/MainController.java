package org.nitin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String message(Principal principal)
    {
        return "you have been validated" + principal.getName();
    }
}
