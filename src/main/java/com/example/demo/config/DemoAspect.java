package com.example.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author qingteng
 * @Date 2025/3/26下午6:09
 */
@Aspect
@Component
public class DemoAspect {
    @Pointcut("execution(* com.example.demo.controller.*.*(..))")
    public void controllerMethod(){}


    @Before("controllerMethod()")
    public void logBefore() {
        System.out.println("controller method invoke before");
    }
}
