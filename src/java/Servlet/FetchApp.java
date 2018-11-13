/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.BookingBean;
import Bean.ScheduleBean;
import Dao.BookingDao;
import Dao.DoctorDao;
import Dao.ScheduleDao;
import Implementation.BookingDaoImplementation;
import Implementation.DoctorDaoImplementation;
import Implementation.ScheduleDaoImplementation;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sunny
 *
 */
class Main {

    public String getNextDate(String day) {

        HashMap<String, DayOfWeek> map = new HashMap();

        map.put("MONDAY", DayOfWeek.MONDAY);
        map.put("TUESDAY", DayOfWeek.TUESDAY);
        map.put("WEDNESDAY", DayOfWeek.WEDNESDAY);
        map.put("THURSDAY",
                DayOfWeek.THURSDAY);
        map.put("FRIDAY", DayOfWeek.FRIDAY);
        map.put("SATURDAY",
                DayOfWeek.SATURDAY);
         map.put("SUNDAY",
                DayOfWeek.SUNDAY);
        LocalDateTime now = LocalDateTime.now();

        LocalDate ld = LocalDate.of(now.getYear(), now.getMonthValue(),
                now.getDayOfMonth());
        System.out.println(ld);
        ld
                = ld.with(TemporalAdjusters.next(map.get(day.toUpperCase())));
        System.out.println(ld);

        return ld.toString().replaceAll("-", "/");

    }
}

@WebServlet(name = "FetchApp", urlPatterns = {"/FetchApp"})
public class FetchApp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String email = request.getParameter("email");
            String doctorname = request.getParameter("doctornames");
            String specialist = request.getParameter("specialist");
            System.out.println(specialist);

            DoctorDao dd = new DoctorDaoImplementation();
            String doctoremail = dd.getEmail(doctorname);
            System.out.println(doctoremail);

            ScheduleDao sd = new ScheduleDaoImplementation();
            List<ScheduleBean> list = sd.getSchedule(doctoremail);
            System.out.println(list);

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

                                
                            
            request.setAttribute("doctorScheduleMap", map);
            request.setAttribute("specialist", specialist);

            //    String days = request.getParameter("day");
            //   System.out.println(days);
            // Main oob = new Main();          
            //request.setAttribute("date", oob.getNextDate(days));
            request.setAttribute("email", email);
            request.setAttribute("doctorname", doctorname);
            request.getRequestDispatcher("BookAppointment.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
