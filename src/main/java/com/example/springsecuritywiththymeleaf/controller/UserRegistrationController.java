package com.example.springsecuritywiththymeleaf.controller;

import com.example.springsecuritywiththymeleaf.dto.UserRegistrationDto;
import com.example.springsecuritywiththymeleaf.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class UserRegistrationController  {

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    private UserService userService;

    @ModelAttribute("user")
    public  UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();

    }
    @GetMapping
    public String showRegistrationForm(){
        return "registration";

    }
    @PostMapping

    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:/registration?success";

    }
}
