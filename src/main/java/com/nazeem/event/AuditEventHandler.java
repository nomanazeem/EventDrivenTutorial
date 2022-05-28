package com.nazeem.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;

@Component
@EventListener(AuditEvent)
public class MyEventHandler {

    public void handleEvent(ActionEvent actionEvent){
        System.out.println("handle Event..."+actionEvent);
    }
}
