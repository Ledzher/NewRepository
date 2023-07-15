package com.example.spring_lesson.практика2;

import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskConnection {
  static   String url = "jdbc:postgresql://localhost:5342/books";
  static String userName = "postgres";
  static   String password = "postgres";

  public static void addUser(User user) throws SQLException {

      try (Connection connection = DriverManager.getConnection(url,userName,password)){
          String sql = "insert into users10(userName, email, password)"+
                  "values (" +
                  "(?,?,?)";

          PreparedStatement statement = connection.prepareStatement(sql);
          statement.setString(1, user.getUsername());
          statement.setString(2, user.getEmail());
          statement.setString(3, user.getPassword());

          int rowsInserted = statement.executeUpdate();
          if (rowsInserted > 0) {
              System.out.println("Запись успешно добавлена");
          }
          statement.close();
          connection.close();
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }

}



