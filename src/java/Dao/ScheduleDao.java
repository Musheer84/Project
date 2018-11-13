/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.ScheduleBean;
import java.util.List;

/**
 *
 * @author sunny
 */
public interface ScheduleDao {
    
    void add(ScheduleBean sb);
    List<ScheduleBean> getSchedule();
    List<ScheduleBean> getSchedule(String email);
    
}
