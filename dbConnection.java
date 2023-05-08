/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author caity
 */
public class dbConnection {

    public static Connection connect()
    {
        String url = "jdbc:mysql://localhost:3306/u22608495_sakila";
        String username = "root";
        String password = "MDB4COS221";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
            return null;
        }
    }
}
