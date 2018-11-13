/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.DoctorBean;
import java.util.List;

/**
 *
 * @author sunny
 */
public interface DoctorDao {
     void add(DoctorBean db);
     void update(DoctorBean db);
     void delete(String email);
     void updateDoctor(String name , String phone , String specialist ,String url , String email);
     void addSchedule(String email, String day,String password);
     DoctorBean getUser(String email,String password);
      List<DoctorBean> getdoctors(String specialist);
     String getEmail(String name);
     List<DoctorBean> getDoctors();
     
}
