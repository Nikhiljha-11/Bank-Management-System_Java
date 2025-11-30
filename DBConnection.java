package banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {
        if (con != null) {
            return con;
        }
        try {
            String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/BANK"; 
            String user = "root";                   
            String pass = "Nikhil@88";    

            Class.forName(mysqlJDBCDriver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfully.");
        } catch (Exception e) {
            System.out.println("Connection Failed! " + e.getMessage());
        }
        return con;
    }
}
