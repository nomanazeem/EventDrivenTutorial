package com.nazeem.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class MyEvent<T> extends ApplicationEvent {
    private T data;

    public MyEvent(T t) {
        super(t);
        this.data=t;
    }
}
