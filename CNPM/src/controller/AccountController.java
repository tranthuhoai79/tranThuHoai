/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ihado
 */
public class AccountController {
    public static Connection getJDBCConnection() {
        String url = "jdbc:mysql://localhost:3306/CNPM";
        String user = "root";
        String password = "123456";
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return null;
    }
    public boolean login(String username, String password) {
        Connection conn = getJDBCConnection();
        String sql = "SELECT * FROM accounts WHERE usename = ? and password =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2,password);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return false;
    }
//    public static void main(String[] args) {
//        Connection conn = getJDBCConnection();
//        if (conn != null) {
//            System.out.println("thanh cong");
//        }
//        else {
//            System.out.println("that bai");
//        }
//    }
}
