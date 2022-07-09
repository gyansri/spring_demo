package com.org.test.controller;

import com.org.test.entity.User;
import com.org.test.event.RegistrationCompleteEvent;
import com.org.test.model.UserModel;
import com.org.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegistrationController {

    @Autowired
    private UserService userService;

    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){

        User user = userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
                user,"url"
        ));
        return "success";
    }
}
