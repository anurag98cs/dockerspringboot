package com.demo.dockerspringboot.dockerspringboot.com.demo.dockerspringboot.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloUser {

    @GetMapping
    public String hello(){
        return "Hello Docker!!";
    }
}
