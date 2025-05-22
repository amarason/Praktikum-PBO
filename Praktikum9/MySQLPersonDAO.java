/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
//        Create connection
//         using the new driven class
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
         
         String query = "INSERT INTO person(name) VALUES ('" + name + "')";
         System.out.println(query);
         java.sql.Statement s = con.createStatement();
         s.executeUpdate(query);
         
         con.close();
    }
}

