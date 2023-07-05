package com.example.spring_lesson.практика;

import org.springframework.beans.factory.SmartInitializingSingleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String, User> users;
    private User user;

    public Main() {
     users = new HashMap<>();
     user = null;
    }

    private void createUser(String name, String email, String password){
        User user = new User(name, email, password);
        users.put(email,user);
        System.out.println("успешно создан юзверь");
    }

    private void loginUser(String email, String password){
      User user1 = users.get(email);
      if(user1 != null && user1.checkPassword(password)){
          user = user1;
          System.out.println("вход выполнен");
      }else {
          System.out.println("неправильный пароль или емайл");
      }
    }

    public void logOut(){
        user = null;
        System.out.println("вы вышли из системы");
    }

    public void viewUser(){
        if(user != null){
            System.out.print("\n email" + user.getEmail() );
            System.out.println("\n name" +user.getName());
        }else {
            System.out.println("пусто");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("==menu==");
            System.out.println("выберите действие");
            System.out.println("1.создать пользователя");
            System.out.println("2.вход в систему");
            System.out.println("3.выход из системы");
            System.out.println("4.вывести инфо о пользователя");
            System.out.println("5.изменить пароль");
            System.out.println("6.выход из меню");

            int choice = scanner.nextInt();
          scanner.nextLine();
          switch (choice){
              case 1:
                  System.out.println("введите имя пользователя");
                  String userName = scanner.nextLine();
                  System.out.println("введите емайл");
                  String userEmail = scanner.nextLine();
                  String usePassword = scanner.nextLine();
                  main.createUser(userName,userEmail,usePassword);
          }

        }
    }

}

 class User{
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public boolean checkPassword(String password){
        return  this.password.equals(password);
     }

     public void changePassword(String password){
        this.password = password;
         System.out.println("пароль успешно изменен");

     }
 }
