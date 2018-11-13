/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Bean.MessageBean;
import Dao.MessageDao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author sunny
 */
public class MessageImplementation implements MessageDao{

    @Override
    public void add(MessageBean mb) {
         //To change body of generated methods, choose Tools | Templates.
        String query = "insert into message (name,email,phone,message) values(?,?,?,?)";
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, mb.getName());
            ps.setString(2, mb.getEmail());
            ps.setString(3, mb.getPhone());
            ps.setString(4, mb.getMessage());
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
