/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Bean.BookingBean;
import Dao.BookingDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunny
 */
public class BookingDaoImplementation implements BookingDao{

    @Override
    public void add(BookingBean bb) {
        //To change body of generated methods, choose Tools | Templates.
       String query = "insert into booking (doctorname,patientemail,day,time,date,specialist) values(?,?,?,?,?,?) ";
        try {
            Connection conn  = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, bb.getDoctorname());
            ps.setString(2, bb.getPatientemail());
            ps.setString(3, bb.getDay());
            ps.setString(4, bb.getTime());
            ps.setString(5, bb.getDate());
            ps.setString(6, bb.getSpecialist());
            
            ps.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
        }
    
    }

    @Override
    public List<BookingBean> getBooking() {
       //To change body of generated methods, choose Tools | Templates.
       String query  = "select * from booking";
       List<BookingBean> list = new ArrayList<>();
        try {
            Connection conn  = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                BookingBean bb = new BookingBean();
                bb.setId(rs.getInt("id"));
                bb.setPatientemail(rs.getString("patientemail"));
                bb.setDoctorname(rs.getString("doctorname"));
                bb.setSpecialist(rs.getString("specialist"));
                bb.setDay(rs.getString("day"));
                bb.setTime(rs.getString("time"));
                bb.setDate(rs.getString("date"));
                list.add(bb);
            }
            
        } catch (Exception e) {
           e.printStackTrace();
        }
       return list;
    }

    @Override
    public List<BookingBean> getSchedule(String email) {
         //To change body of generated methods, choose Tools | Templates.
      String query ="select day from schedule where email = ?";
      List <BookingBean> list = new ArrayList<>();
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                BookingBean bb = new BookingBean();
                bb.setDay(rs.getString("day"));
               
                
                list.add(bb);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
      
      
      return list;
     
    }

    @Override
    public void delete(int id) {
       //To change body of generated methods, choose Tools | Templates.
      String query ="delete  from booking where id = ?" ;
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
         e.printStackTrace();
        }
    }
    
}
