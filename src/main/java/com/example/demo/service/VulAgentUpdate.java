package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author qingteng
 * @Date 2024/6/12上午11:45
 */
@Component
@Qualifier("vulAgentUpdate")
public class VulAgentUpdate implements AgentUpdate {
    @Override
    public void update() {
        System.out.println("print vul");
    }
}
