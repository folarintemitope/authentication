package com.example.springsecuritywiththymeleaf.services;

import com.example.springsecuritywiththymeleaf.dto.UserRegistrationDto;
import com.example.springsecuritywiththymeleaf.entity.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
