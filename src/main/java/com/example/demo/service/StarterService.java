package com.example.demo.service;

import com.example.starter.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author qingteng
 * @Date 2025/4/15下午4:55
 */
@Component
public class StarterService {

    @Autowired
    private CountService countService;

    public void echo() {
        countService.count();
    }
}
