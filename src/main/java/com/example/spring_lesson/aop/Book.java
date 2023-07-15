package com.example.spring_lesson.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Шилдт")
  private   String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
