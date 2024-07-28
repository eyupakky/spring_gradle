package org.smart.springboot.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ServiceAspect {
    Logger logger = Logger.getLogger(ServiceAspect.class.getName());

    @Before("execution(* org.smart.springboot.controller.*.*(..))")
    public void metodBefore(JoinPoint joinPoint) {
        logger.info("metodBefore: " + joinPoint.getArgs());
    }

    @After("execution(* org.smart.springboot.service.*.*(..))")
    public void metodAfter(JoinPoint joinPoint) {
        logger.info("metodAfter  : " + joinPoint.getArgs()[0]);
    }
}
