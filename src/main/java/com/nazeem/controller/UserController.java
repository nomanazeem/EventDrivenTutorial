package com.nazeem.controller;

import com.nazeem.entity.User;
import com.nazeem.event.AuditEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MyController {

    @Autowired
    private AuditEventPublisher auditEventPublisher;

    @PostMapping("/send")
    public void sendEvent(@RequestBody User user){
        String message= String.format("User '%s' information saved successfully.",user.getUsername());

        //sending custom message
        auditEventPublisher.publishEvent(message);
        //sending string message
        auditEventPublisher.publishEvent2(message);
    }
}
