package com.example.spring_lesson.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet13;

//    public Person13(Pet13 pet13){
//        System.out.println("person bean is created");
//        this.pet13 = pet13;
//    }


    public Person() {
        System.out.println("person bean is created");
    }
    @Autowired
    public void setPet13(Pet pet13) {
        System.out.println("class person : set pet");
        this.pet13 = pet13;
    }

    public Pet getPet13() {
        return pet13;
    }

    public void callTYourPet(){
        System.out.println("hello pet");
        pet13.say();
    }
}
