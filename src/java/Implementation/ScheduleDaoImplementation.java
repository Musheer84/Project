/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Bean.ScheduleBean;
import Dao.ScheduleDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sunny
 */
public class ScheduleDaoImplementation implements ScheduleDao {

    @Override
    public void add(ScheduleBean sb) {
        //To change body of generated methods, choose Tools | Templates.
        String query = "insert into schedule (email,day,time) values(?,?,?)";
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, sb.getEmail());
            ps.setString(2, sb.getDay());
            ps.setString(3, sb.getTime());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ScheduleBean> getSchedule() {
        //To change body of generated methods, choose Tools | Templates.
        String query = "select * from schedule";
        List<ScheduleBean> list = new ArrayList<>();
        try {
            Connection conn = Database.connection.conn;
            PreparedStatement ps = conn.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ScheduleBean sd = new ScheduleBean();
                sd.setId(rs.getInt("id"));
                sd.setEmail(rs.getString("email"));
                sd.setDay(rs.getString("day"));
                sd.setTime(rs.getString("time"));
                list.add(sd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public List<ScheduleBean> getSchedule(String email) {
        //To change body of generated methods, choose Tools | Templates.
        String query = "select * from schedule where email = ?";
        List<ScheduleBean> list = new ArrayList<>();
        try {
//            Connection conn =  Database.connection.conn;
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mercy", "mercy", "mercy");
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ScheduleBean sb = new ScheduleBean();
                sb.setDay(rs.getString("day"));
                sb.setTime(rs.getString("time"));
                sb.setEmail(rs.getString("email"));
                sb.setId(rs.getInt("id"));
                list.add(sb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {

        ScheduleDaoImplementation sdao = new ScheduleDaoImplementation();
        System.out.println(sdao.getSchedule("lakherainfotech@gmail.com"));

        List<ScheduleBean> list = sdao.getSchedule("lakherainfotech@gmail.com");

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (ScheduleBean sb : list) {

            if (map.get(sb.getDay()) == null) {
                List<String> times = new ArrayList<>();
                times.add(sb.getTime());
                map.put(sb.getDay(), times);
            } else {

                List<String> times = map.get(sb.getDay());
                times.add(sb.getTime());
                map.put(sb.getDay(), times);

            }

        }
        
        System.out.println( map );

    }

}
