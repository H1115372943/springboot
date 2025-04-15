package com.example.demo.controller;

import com.example.demo.service.AgentUpdateManagement;
import com.example.demo.service.StarterService;
import com.example.demo.service.VulUpdateManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Desc
 * @Author qingteng
 * @Date 2022/11/17下午6:36
 */
@RestController
public class DemoController {

    private final AgentUpdateManagement agentUpdateManagement;
    private final VulUpdateManagement vulUpdateManagement;
    private final StarterService starterService;

    @Autowired
    public DemoController(AgentUpdateManagement agentUpdateManagement,
                          VulUpdateManagement vulUpdateManagement,
                          StarterService starterService,
                          @Value("${data_sender_coll:}") String collStr) {
        this.agentUpdateManagement = agentUpdateManagement;
        this.vulUpdateManagement = vulUpdateManagement;
        this.starterService = starterService;
    }


    @Value("${name:default}")
    private String name;

    @Value("${action:none}")
    private String action;



    @GetMapping("/greet")
    public String greet() {
        return name + "#play#" +action;
    }

    @GetMapping("/greet/{user}")
    public String greetWithUser(@PathVariable("user") String user) {
        return "greet with " + user;
    }

    @GetMapping("/greet/update")
    public void doUpdate() {
        agentUpdateManagement.doUpdate();
    }

    @GetMapping("/greet/update1")
    public void doUpdate1() {
        vulUpdateManagement.doUpdate();
    }


    @GetMapping("login")
    public String login() {
        return "login.html";
    }

    @GetMapping("echo")
    public void echo() {
        starterService.echo();
    }
}