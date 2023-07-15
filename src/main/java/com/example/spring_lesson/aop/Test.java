package com.example.spring_lesson.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("library", Library.class);
        Book book = context.getBean("book", Book.class);

        library.getBook(book);
        library.returnBok();
        library.getMagazine();

       SchoolLybrary schoolLybrary = (SchoolLybrary) context.getBean("schoolLybrary");
       schoolLybrary.getBook();

        context.close();
    }
}
