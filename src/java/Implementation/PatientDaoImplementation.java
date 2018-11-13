/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Bean.PatientBean;
import Dao.PatientDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author sunny
 */
public class PatientDaoImplementation implements PatientDao{

    @Override
    public void add(PatientBean pb) {
         //To change body of generated methods, choose Tools | Templates.
         String query="insert into patient(name,email,phone,day,time,doctorname,password,specialist) values(?,?,?,?,?,?,?,?)";
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps= conn.prepareCall(query);
            ps.setString(1, pb.getName());
            ps.setString(2, pb.getEmail());
            ps.setString(3, pb.getPhone());
            ps.setString(4, pb.getDay());
            ps.setString(5, pb.getTime());
            ps.setString(6, pb.getDoctorname());
            ps.setString(7, pb.getPassword());
            ps.setString(8, pb.getSpecialist());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public PatientBean getUser(String email, String password) {
        //To change body of generated methods, choose Tools | Templates.
                 String query = "select * from patient where email = ? and password = ?";
         try {
             Connection conn = Database.connection.conn;
             PreparedStatement ps = conn.prepareCall(query);
             ps.setString(1, email);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 PatientBean pb = new PatientBean();
                 pb.setEmail(rs.getString("email"));
                 return pb;
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }

    @Override
    public List<PatientBean> getPatients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String email) {
         //To change body of generated methods, choose Tools | Templates.
       String query="delete  from patient where email =?";
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, email);
            ps.executeUpdate();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    
}
