package edu.miu.cs472.lab12.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ContactFormHandlerServlet", urlPatterns = {"/ContactFormHandlerServlet", "/contactformhandler"})
public class ContactFormHandlerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //handler for form-data submitted
        String fullName = request.getParameter("nameTextArea");
        String female = request.getParameter("gender");
        String category = request.getParameter("category");
        String msgArea = request.getParameter("txtArea");

        if(fullName == "" || fullName == null){
            //go back to the form
            String errMsg = "<span style='color:red;'>Your Name is required!</span><br />";
            request.setAttribute("errMsg", errMsg);
            //forward back to the form servlet
            request.getRequestDispatcher("/contactform").forward(request, response);
        }else {
            //go thank you page
            HttpSession session = request.getSession(true);
            session.setAttribute("Name", ": " + fullName);

            String url = "thankyou?fullName=" + fullName;
            response.sendRedirect(url); // HTTP response code 302
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
