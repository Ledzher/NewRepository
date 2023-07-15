package com.example.spring_lesson.aop;

import org.springframework.stereotype.Component;

@Component
public class Library  {
    //@Override
    public void getBook(Book book){
        System.out.println("берем книгу" +" " +book.getName());
    }
    public  void returnBok(){
        System.out.println("возвращам книгу");
    }

    public void getMagazine(){
        System.out.println("берем журнал");
    }
}
