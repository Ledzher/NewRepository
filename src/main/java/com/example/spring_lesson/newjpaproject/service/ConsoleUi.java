package com.example.spring_lesson.newjpaproject.service;

import com.example.spring_lesson.newjpaproject.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUi implements CommandLineRunner {
    private final StudentsService studentsService;
    @Autowired
    public ConsoleUi(StudentsService studentsService){
     this.studentsService = studentsService;
    }
    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit =  false;

        while (!exit){
            System.out.println("Выберите действие");
            System.out.println("1.Добавить студента");
            System.out.println("2.Удалить студента");
            System.out.println("3.Изменить  студента");
            System.out.println("4.Вывести всех студентов");
            System.out.println("5.Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1 :
                    addStudent(scanner);
                    break;
                case 2 :
                    deleteStudent(scanner);
                    break;
                case 3 :
                    updateStudent(scanner);
                    break;
                case 4 :
                    getAllStudents();
                    break;
                case 5 :
                    exit = true;
                    break;
                default:
                    System.out.println("Некоректные данные");
                    break;
            }
        }
    }
    private void addStudent(Scanner scanner){
        System.out.println("Введите имя студента :");
        String name = scanner.nextLine();
        System.out.println("Введите курс студента :");
        String course = scanner.nextLine();
        studentsService.addStudent(name,course);
        System.out.println("Студент успешно добавлен ");
        System.out.println();
    }

    private void deleteStudent(Scanner scanner){
        System.out.println("Введите имя студента для удаления :");
        String name = scanner.nextLine();
        studentsService.deleteStudent(name);
        System.out.println("Студент успешно удален");
        System.out.println();
    }

    private void updateStudent(Scanner scanner){
        System.out.println("Введите Id студента");
        long studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя студента для изменения :");
        String name = scanner.nextLine();
        System.out.println("Введите курс студента :");
        String course = scanner.nextLine();
        Students students = new Students();
        students.setId(studentId);
        students.setName(name);
        students.setCourses(course);
        studentsService.updateStudent(name, course);

        System.out.println("Изменения внесены");
        System.out.println();
    }

    private void getAllStudents(){
     studentsService.getAllStudents();
        System.out.println();
    }

}
