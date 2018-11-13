/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.PatientBean;
import java.util.List;

/**
 *
 * @author sunny
 */
public interface PatientDao {
    void add(PatientBean pb);
     PatientBean getUser(String email,String password);
     List<PatientBean> getPatients();
     void delete(String email);
}
