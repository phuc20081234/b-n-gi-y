/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class DatabaseHelper {
        public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=SportShoeDB;encrypt=false";
        String user = "sa";         // hoặc tài khoản SQL Server của bạn
        String password = "123"; // sửa theo mật khẩu của bạn

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, user, password);
    }
}
