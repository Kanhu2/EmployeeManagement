/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author HP
 */
import java.sql.*;
public class ConnectionDB {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/empdb";
    private static String username = "root";
    private static String password = "system";
    
    public static Connection getConnectiondb() {
        Connection cn = null;
        try{
            Class.forName(driver);
            cn = DriverManager.getConnection(url,username,password);
        }catch(Exception ee){
            ee.printStackTrace();
        }
        finally{
            return cn ;
        }
    }
}
