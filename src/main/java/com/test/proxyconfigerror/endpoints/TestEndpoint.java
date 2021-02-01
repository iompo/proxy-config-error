package com.test.proxyconfigerror.endpoints;

import com.test.proxyconfigerror.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestEndpoint {
    @Autowired
    private UserService userService;

    @GetMapping(path = "ping")
    public String ping() {
        return "ok";
    }

    @GetMapping(path = "users/{userId}")
    public String getUsernameFromId(@PathVariable("userId") Long userId) {
        return userService.getUsernameFrom(userId);
    }
}
