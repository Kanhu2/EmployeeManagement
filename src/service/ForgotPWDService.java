/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author HP
 */
import java.sql.*;
public class ForgotPWDService {
    public static  boolean forgotPWDUser(String name, String password) {
        try {
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select name from user_table where name='"+name+"'");
            while(rs.next()) {
                st.executeUpdate("UPDATE user_table SET password='"+password+"' WHERE name='"+name+"'");
                return true;
            }
        }catch(Exception ee) {
            ee.printStackTrace();
        }
        return false;
    }
}
