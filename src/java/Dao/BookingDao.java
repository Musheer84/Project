/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.BookingBean;
import java.util.List;

/**
 *
 * @author sunny
 */
public interface BookingDao {
    void add(BookingBean bb);
    void delete(int id);
    List<BookingBean> getBooking();
   List<BookingBean> getSchedule(String email);
    
}
