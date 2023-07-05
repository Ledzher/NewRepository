package com.example.spring_lesson.scoupe;

import com.example.spring_lesson.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        Dog myDog = context.getBean("myPet", Dog.class);

        System.out.println(dog == myDog);
        System.out.println(dog);
        System.out.println(myDog);




        context.close();
    }
}
