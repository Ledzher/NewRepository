package com.example.spring_lesson.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.spring_lesson.configuration")
public class MyConfig {
    @Bean
    public Pet catsBean(){
        return (Pet) new Cat();
    }

    @Bean
    public Person personsBean(){
        return new Person((com.example.spring_lesson.Pet) catsBean());
    }

}
