package com.example.spring_lesson.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
    @Before("execution(public * get*(..))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice : попытка получить ккккнигу");
    }


    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice : попытка вернуть книгу");
    }
}
