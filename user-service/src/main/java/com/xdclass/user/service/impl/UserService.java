package com.xdclass.user.service.impl;

import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class UserService implements com.xdclass.user.service.UserService {
    public String sayHello() {
        return "Hello";
    }
}
