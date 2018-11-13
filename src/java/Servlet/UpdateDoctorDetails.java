/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.DoctorDao;
import Implementation.DoctorDaoImplementation;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author sunny
 */
@WebServlet(name = "UpdateDoctorDetails", urlPatterns = {"/UpdateDoctorDetails"})

@MultipartConfig( maxRequestSize = 1024 * 1024 * 5)
public class UpdateDoctorDetails extends HttpServlet {

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
          Part p = request.getPart("file");
        String filename = p.getSubmittedFileName();
        try {
            File f = new File("./"+ filename);
            if (!f.exists()) {
                f.createNewFile();                
            }
            byte[] b = new byte[(int)p.getSize()];
            p.getInputStream().read(b);
            FileOutputStream fos =new FileOutputStream(f);
            fos.write(b);
            fos.close();
            
            Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                    "cloud_name","hushye1",
                    "api_key","932582698643549",
                    "api_secret","BkfltrFRp4a6Kv_vZcxKTTZAFQg"
            ));
            
            Map uploadResult = cloudinary.uploader().upload(f,ObjectUtils.emptyMap());
            System.out.println(uploadResult.get("secure_url"));
            String url = uploadResult.get("secure_url").toString();
            
            String name = request.getParameter("name");
            String phone = request.getParameter("phone");
            String specialist = request.getParameter("specialist");
            String email  = request.getParameter("email");
            
            DoctorDao dd = new DoctorDaoImplementation();
            dd.updateDoctor(name, phone, specialist, url, email);
            
             request.setAttribute("email", email);
             request.getRequestDispatcher("doctorhome.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("Error In Uploading Image");
           e.printStackTrace();
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
