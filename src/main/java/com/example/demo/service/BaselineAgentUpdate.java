package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author qingteng
 * @Date 2024/6/12上午11:45
 */
@Component
public class BaselineAgentUpdate implements AgentUpdate {
    @Override
    public void update() {
        System.out.println("print baseline");
    }
}
