package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Desc
 * @Author qingteng
 * @Date 2024/6/12上午11:47
 */
@Component
public class AgentUpdateManagement {

    private final List<AgentUpdate> updates;

    @Autowired
    public AgentUpdateManagement(List<AgentUpdate> updates) {
        this.updates = updates;
    }

    public void doUpdate() {
        updates.forEach(AgentUpdate::update);
    }
}
