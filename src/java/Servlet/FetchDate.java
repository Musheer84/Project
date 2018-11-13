/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author akansha
 */

class Mains {

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
        //System.out.println(ld);

        return ld.toString().replaceAll("-", "/");

    }
}
class mains1{

    public String getNextDate(String day) {
          String[] dates = day.split("/"); 
  
        for (String a : dates) 
        {
          //  System.out.println(a);
        }
        
        int d = Integer.parseInt(dates[2]);
        d = d+7;
        
       String e = String.valueOf(d);
        //System.out.println(e);
        
        dates[2] = e;
       // System.out.println(dates[2]);
        String daysss=dates[0]+"/"+dates[1]+"/"+dates[2];
        
        //System.out.println(daysss);

   return daysss;



    }
}
@WebServlet(name = "FetchDate", urlPatterns = {"/FetchDate"})
public class FetchDate extends HttpServlet {

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
        String day = request.getParameter("days");
        String time = request.getParameter("times");
        String specialist = request.getParameter("specialist");
        String doctorname = request.getParameter("doctorname");
                
        System.out.println(day);
         
         Mains oob = new Mains();
         String day1 = oob.getNextDate(day);
         
         mains1 oob1 = new mains1();
         String day2 ="";
         day2 = oob1.getNextDate(day1);
         String day3 ="";
         day3 = oob1.getNextDate(day2);
         
         String[] DAY = new String[3];
            DAY[0] = day1;
            DAY[1] = day2;
            DAY[2] = day3;
         System.out.println(day1+" "+day2+" "+day3);
         request.setAttribute("DAYS",DAY);
         request.setAttribute("specialist", specialist);
         request.setAttribute("doctorname", doctorname);
         request.setAttribute("day", day);
         request.setAttribute("time", time);
         request.getRequestDispatcher("BookAppointment.jsp").forward(request, response);
        //request.setAttribute("date", oob.getNextDate(day));
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
