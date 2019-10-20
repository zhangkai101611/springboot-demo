package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SController {

    @RequestMapping("/k8s")
    public String k8s(){
        return "hello k8s update aa1a1";
    }
}
