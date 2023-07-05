package com.example.spring_lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;
    @Autowired
    @Qualifier("dog")
    private Pet pet;
//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("a");
//        this.pet = pet;
//    }


//    public Person(Pet pet){
//        this.pet = pet;
//        System.out.println("as");
//
//    }
//    @Autowired
//    public void setPet(Pet pet) {
//        System.out.println("class person : set pet ");
//        this.pet = pet;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet(){
        System.out.println("Hello pet");
        pet.say();
    }


}
