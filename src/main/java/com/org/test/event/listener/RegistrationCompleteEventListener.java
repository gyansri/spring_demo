package com.org.test.event.listener;

import com.org.test.entity.User;
import com.org.test.event.RegistrationCompleteEvent;
import com.org.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
      // Create the Verifcation Token for User with link

        User user = event.getUser();
        String token = UUID.randomUUID().toString();


    }
}
