//package com.trinojdbc;
//
//import java.sql.*;
//import java.util.Map;
//import java.util.Properties;
//
//import static java.lang.String.format;
//
//public class TrinoJDBCG {
//
//
////     try (Connection connection = createBasicConnection(ImmutableMap.of("SSL", "true", "SSLVerification", "NONE"));
////    Statement statement = connection.createStatement()) {
////        assertThatThrownBy(() -> statement.execute("SELECT 123"))
////                .isInstanceOf(SQLException.class)
////                .hasMessage("Authentication failed: Unauthorized");
////    }
//
//    public static void main(String[] args) {
//
////        try (Connection connection = createBasicConnection(ImmutableMap.of("SSL", "true", "SSLVerification", "NONE"));
////             Statement statement = connection.createStatement()) {
////
////        }
//        String jdbcUrl = "jdbc:trino://localhost:8080";
//        String user = "your-username";
//        String password = "your-password";
//
//        try {
//            Properties properties = new Properties();
//            properties.setProperty("user", "admin");
//           // properties.setProperty("password", "secret");
//            Connection connection = DriverManager.getConnection(jdbcUrl, properties);
//
//            // Now you have a connection to your Trino server.
//
//            // Retrieve catalogs:
//           // java.sql.ResultSet catalogs = connection.getMetaData().getSchemas("blackhole");
//            ResultSet rs = connection.getStatement().executeQuery("SELECT * FROM (VALUES (1), (2), (3))"))
//            while (catalogs.next()) {
//                String catalogName = catalogs.getString("TABLE_CAT");
//                System.out.println("Catalog: " + catalogName);
//            }
//
//            // Close the connection when you're done.
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private Connection createBasicConnection(Map<String, String> additionalProperties)
//            throws SQLException
//    {
//        String url = format("jdbc:trino://localhost:%s", 8080);
//        Properties properties = new Properties();
//        additionalProperties.forEach(properties::setProperty);
//        return DriverManager.getConnection(url, properties);
//    }
//}
//
