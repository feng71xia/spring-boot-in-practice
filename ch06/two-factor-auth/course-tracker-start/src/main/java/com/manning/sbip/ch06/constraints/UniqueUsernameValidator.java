package com.manning.sbip.ch06.constraints;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.manning.sbip.ch06.service.UserService;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

	@Autowired
    private UserService userService;
    
    public boolean isValid(String userName, ConstraintValidatorContext context) {
        return userName != null && !userService.isUsernameExists(userName);
    }
}
