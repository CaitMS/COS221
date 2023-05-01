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
//            stmt = conn.createStatement();
//            String SQL = "SELECT * FROM u22608495_sakila.actor";
//            rs = stmt.executeQuery(SQL);
//            while (rs.next()) {
//                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
//            }
        }
        catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
            return null;
        }
    }
//    public static void main(String[] args) {
//        Connection conn;
//        Statement stmt;
//        ResultSet rs;
//        String url = "jdbc:mysql://localhost:3306/u22608495_sakila";
//        String username = "root";
//        String password = "MDB4COS221";
//        try{
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(url, username, password);
//
//            stmt = conn.createStatement();
//            String SQL = "SELECT * FROM u22608495_sakila.actor";
//            rs = stmt.executeQuery(SQL);
//            while (rs.next()) {
//                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
//            }
//        }
//        catch (SQLException ex){
//            ex.printStackTrace();
//        }
//        catch (ClassNotFoundException ex){
//            ex.printStackTrace();
//        }
//    }
}
