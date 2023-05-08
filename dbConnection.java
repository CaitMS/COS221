/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package GUI;

import com.mysql.cj.protocol.Protocol;
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
        String protocol = System.getenv("dvdrental_DB_PROTO");
        String host = System.getenv("dvdrental_DB_HOST");
        String port = System.getenv("dvdrental_DB_PORT");
        String name = System.getenv("dvdrental_DB_NAME");
        String username = System.getenv("dvdrental_DB_USERNAME");
        String password = System.getenv("dvdrental_DB_PASSWORD");
        
        String url = protocol+host+":"+port+"/"+name;
        //String username = "root";
        //String password = "MDB4COS221";
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
