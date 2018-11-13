/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class connection implements ServletContextListener{
     public static Connection conn;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
         try {
             //To change body of generated methods, choose Tools | Templates.
             conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mercy", "mercy", "mercy");
             System.out.println("Database Connected");
         } catch (SQLException ex) {
             System.out.println("Database Not Connected");
             ex.printStackTrace();
         }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //To change body of generated methods, choose Tools | Templates.
        try {
            conn.close();
            System.out.println("Database Connection is Closed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
