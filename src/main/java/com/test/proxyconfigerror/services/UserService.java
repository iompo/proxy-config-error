package com.test.proxyconfigerror.services;

import com.test.proxyconfigerror.database.controllers.UserJpaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserJpaController userJpaController;

    public String getUsernameFrom(long userId) {
        return userJpaController.findEntity(userId).getUsername();
    }
}
