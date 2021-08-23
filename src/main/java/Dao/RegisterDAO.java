package Dao;

import com.example.gulyashpolyash.User;

import java.sql.*;

public class RegisterDAO {
    private static final String URL = "jdbc:hsqldb:hsql://localhost/";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "";
    private static Connection connection;
    static {
        try {
            Class.forName("org.HSQLDB.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static boolean isUserExist(User obj){
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String SQL = "SELECT FROM USER WHERE()";
        try {
            ResultSet resultSet = statement.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
