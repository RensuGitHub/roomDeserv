/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author velas
 */
public class database {
    
    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
