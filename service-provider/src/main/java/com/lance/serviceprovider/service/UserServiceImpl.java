package com.lance.serviceprovider.service;

import com.lance.servicefacade.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

@DubboService
public class UserServiceImpl implements UserService {
    public String hi(String name) {
        return "hi " + name;
    }
}
