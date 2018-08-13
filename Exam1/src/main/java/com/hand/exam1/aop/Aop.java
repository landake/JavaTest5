package com.hand.exam1.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Before("execution(* com.hand.exam1.mapper.impl.FilmMapperImpl.insert(..))")
    public void before(){
        System.out.println("Before Insert Film Data");
    }
    @After("execution(* com.hand.exam1.mapper.impl.FilmMapperImpl.insert(..))")
    public void after(){
        System.out.println("After Insert Film Data");
    }
}
