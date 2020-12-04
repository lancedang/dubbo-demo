package com.lance.serviceconsumer.service;

import com.lance.servicefacade.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class UserServiceConsumer implements CommandLineRunner {

    @DubboReference(url = "dubbo://127.0.0.1:12345")
    private UserService userService;


    public void run(String... args) throws Exception {
        System.out.println(userService.hi("王大哥"));
    }
}
