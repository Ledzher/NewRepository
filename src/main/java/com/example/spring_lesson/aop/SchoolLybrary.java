package com.example.spring_lesson.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLybrary extends AbstractLybrary {
    @Override
    public void getBook(){
        System.out.println("берем книгу из школьной библиотеки");
    }
}
