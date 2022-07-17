package pl.coderslab;

import java.sql.*;

public class DBUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/user_operations?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
