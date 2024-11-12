package com.chatBotApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@SpringBootApplication
public class DddddddApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddddddApplication.class, args);
		
		
		// Database connection parameters
        String jdbcURL = "jdbc:mysql://172.16.2.232:3306/m_junction";
        String userName = "user1";
        String password = "Password1";

        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Attempt to establish the connection
            Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connection successful!");

            // 3. Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
		
		
		
	

}
