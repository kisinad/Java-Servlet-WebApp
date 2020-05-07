package edu.miu.cs472.lab12.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ContactFormHandlerServlet", urlPatterns = {"/ContactFormHandlerServlet", "/contactformhandler"})
public class ContactFormHandlerServlet extends HttpServlet {
    public ContactFormHandlerServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //handler for form-data submitted
        String missingFieldsMsg = "";
        String fullName = request.getParameter("nameTextArea");
        String gender = request.getParameter("gender");
        String category = request.getParameter("category");
        String msgArea = request.getParameter("txtArea");
        System.out.println("name=" + fullName + ", gender= " + gender + ", category= " + category + ", msg= " + msgArea);

        //check for missing fields data
        if(fullName.equals("")){
            missingFieldsMsg += "<span style='color:red;'>Your Name is required!</span><br />";
        }

        if (category.equals("null")) {
            missingFieldsMsg += "<span style='color:red;'>Category is missing.</span><br />";
        }
        if (gender == null){
           missingFieldsMsg += "<span style='color:red;'>Gender is missing.</span><br />";
        }
        if (msgArea.equals("")){
            missingFieldsMsg += "<span style='color:red;'>Message is missing.</span><br />";
        }
        if(!missingFieldsMsg.equals("")){
            request.setAttribute("errMsgName", missingFieldsMsg);
            //forward back to sender
            RequestDispatcher rd = request.getRequestDispatcher("/contactform");
            rd.forward(request, response);
        }
        else {
            //go thank you page
            HttpSession session = request.getSession(true);
            session.setAttribute("Name",fullName);
            session.setAttribute("Gender", gender);
            session.setAttribute("Category", category);
            session.setAttribute("TxtArea", msgArea);
            String url = "thankyou?fullName=" + fullName +"&radioGender="+gender+"&ddlCategory="+category+"&message="+msgArea;
            response.sendRedirect(url); // HTTP response code 302
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("contactform");
    }
}
