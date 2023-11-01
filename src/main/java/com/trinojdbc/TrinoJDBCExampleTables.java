package com.trinojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TrinoJDBCExampleTables {

    public static void main(String[] args) {
        // JDBC URL to connect to Trino
        String jdbcUrl = "jdbc:trino://localhost:8080";
        String user = "your-username";
        String password = "your-password";

        try {
            Properties properties = new Properties();
            properties.setProperty("user", "admin");
           // properties.setProperty("password", "secret");
            Connection connection = DriverManager.getConnection(jdbcUrl, properties);

            // Create a statement
            Statement statement = connection.createStatement();

            // Query to retrieve catalogs
//            String catalogsQuery = "SHOW CATALOGS";
//            ResultSet catalogsResult = statement.executeQuery(catalogsQuery);
//
//            System.out.println("Catalogs:");
//            while (catalogsResult.next()) {
//                String catalogName = catalogsResult.getString(1);
//                System.out.println(catalogName);
//            }

            // Query to retrieve tables in a specific catalog
            String catalogName = "information_schema";
            String tablesQuery = "SHOW TABLES FROM " + catalogName;
         //   String tablesQuery = "SHOW SCHEMAS FROM " + catalogName;
            ResultSet tablesResult = statement.executeQuery(tablesQuery);

            System.out.println("Tables in " + catalogName + ":");
            while (tablesResult.next()) {
                String tableName = tablesResult.getString(1);
                System.out.println(tableName);
            }

            // Close resources
            tablesResult.close();
           // catalogsResult.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

