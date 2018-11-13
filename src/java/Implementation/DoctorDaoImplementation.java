/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Bean.DoctorBean;
import Dao.DoctorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DoctorDaoImplementation implements DoctorDao{

    @Override
    public void add(DoctorBean db) {
        String query="insert into doctor(name,email,phone,day,time,specialist,password,url) values(?,?,?,?,?,?,?,?)";
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps= conn.prepareCall(query);
            ps.setString(1, db.getName());
            ps.setString(2, db.getEmail());
            ps.setString(3, db.getPhone());
            ps.setString(4, db.getDay());
            ps.setString(5, db.getTime());
            ps.setString(6, db.getSpecialist());
            ps.setString(7, db.getPassword());
            ps.setString(8, db.getUrl());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(DoctorBean db) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DoctorBean getUser(String email, String password) {
       //To change body of generated methods, choose Tools | Templates.
         String query = "select * from doctor where email = ? and password = ?";
         try {
             Connection conn = Database.connection.conn;
             PreparedStatement ps = conn.prepareCall(query);
             ps.setString(1, email);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 DoctorBean db = new DoctorBean();
                 db.setEmail(rs.getString("email"));
                 return db;
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }

    @Override
    public void addSchedule(String email, String day, String password) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDoctor(String name , String phone , String specialist , String url ,String email) {
         //To change body of generated methods, choose Tools | Templates.
        String query = "update doctor set name =?, phone =?,specialist =?,url=? where email = ?";
        
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, specialist);
            ps.setString(4, url);
            ps.setString(5, email);
            ps.executeUpdate();
            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    @Override
    public void delete(String email) {
        //To change body of generated methods, choose Tools | Templates.
       String query = "delete from doctor where email =?";
        try {
            Connection conn= Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, email);
            ps.executeUpdate();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }

    @Override
    public List<DoctorBean> getdoctors(String specialist) {
         //To change body of generated methods, choose Tools | Templates.
       String query = "select name from doctor where specialist = ?";
       List<DoctorBean> list = new ArrayList<>();
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, specialist);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                DoctorBean db = new DoctorBean();
                db.setName(rs.getString("name"));
                list.add(db);
            }
                    
        } catch (Exception e) {
           e.printStackTrace();
        }
       return list;
    }

    @Override
    public String getEmail(String name) {
         //To change body of generated methods, choose Tools | Templates.
      String query="select email from doctor where name =?";
      String email ="";
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
             email = rs.getString("email");
            }
                    
             
        } catch (Exception e) {
           e.printStackTrace();
        }
      return email;
    }

    @Override
    public List<DoctorBean> getDoctors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
