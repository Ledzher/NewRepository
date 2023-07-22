package com.example.spring_lesson.newjpaproject;

import com.example.spring_lesson.newjpaproject.service.StudentsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        SwingUtilities.invokeLater(() -> {
            StudentsService studentService = context.getBean(StudentsService.class);
//            StudentForm studentForm = new StudentForm(studentService);
//            studentForm.setVisible(true);
        });
    }
}
