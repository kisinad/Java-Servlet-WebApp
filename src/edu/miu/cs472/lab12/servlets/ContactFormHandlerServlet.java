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
        String gender = request.getParameter("gender");
        String category = request.getParameter("category");
        String msgArea = request.getParameter("txtArea");

        if((fullName == "" || fullName == null) && (msgArea == "" || msgArea == null) && (category == null) && (gender == null)){
            String errMsgName = "<span style='color:red;'>Your Name is required!</span><br />";
            request.setAttribute("errMsgName", errMsgName);
            String errMsgTextArea = "<span style='color:red;'>Message is missing.</span><br />";
            request.setAttribute("errMsgTextArea", errMsgTextArea);
            request.getRequestDispatcher("/contactform").forward(request, response);
        }
        else if(fullName == "" || fullName == null){
            //go back to the form
            String errMsgName = "<span style='color:red;'>Your Name is required!</span><br />";
            request.setAttribute("errMsgName", errMsgName);
            //forward back to the form servlet
            request.getRequestDispatcher("/contactform").forward(request, response);
        }
        else if(msgArea == "" || msgArea == null){
            String errMsgTextArea = "<span style='color:red;'>Message is missing.</span><br />";
            request.setAttribute("errMsgTextArea", errMsgTextArea);
            request.getRequestDispatcher("/contactform").forward(request, response);
        }else if(category == null){
            String errMsgCategory = "<span style='color:red;'>Category is missing.</span><br />";
            request.setAttribute("errMsgCategory", errMsgCategory);
            request.getRequestDispatcher("/contactform").forward(request, response);
        }
        else if(gender == null){
            String errMsgGender = "<span style='color:red;'>Gender is missing.</span><br />";
            request.setAttribute("errMsgGender", errMsgGender);
            request.getRequestDispatcher("/contactform").forward(request, response);
        }
        else {
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
