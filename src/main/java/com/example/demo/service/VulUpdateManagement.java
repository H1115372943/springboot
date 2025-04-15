package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author qingteng
 * @Date 2024/6/12上午11:51
 */
@Component
public class VulUpdateManagement {

    @Autowired
    @Qualifier("vulAgentUpdate")
    private AgentUpdate vulAgentUpdate;

    public void doUpdate() {
        vulAgentUpdate.update();
    }
}
