package com.example.spring_lesson.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet13 pet13 = context.getBean("myPet13", Pet13.class);
       // Pet13 pet13 = new Dog13();
        Person person13 = context.getBean("myPerson13", Person.class);

        person13.callTYourPet();

        context.close();
    }

}
