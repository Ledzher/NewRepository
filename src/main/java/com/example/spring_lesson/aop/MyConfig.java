package com.example.spring_lesson.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.spring_lesson.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
