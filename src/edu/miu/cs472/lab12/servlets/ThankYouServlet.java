package edu.miu.cs472.lab12.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ThankYouServlet", urlPatterns = {"/ThankYouServlet", "/thankyou"})
public class ThankYouServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        StringBuilder sb = new StringBuilder();
        ServletContext context = request.getServletContext();


        response.setContentType("text/html");
        response.setBufferSize(8192);
//        StringBuilder sb = new StringBuilder();
        sb.append("<!doctype html>");
        sb.append("<html lang='en'>");
        sb.append("<head>");
        sb.append(" <meta charset='UTF-8'>");
        sb.append(" <meta name='viewport' content='width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0'>");
        sb.append("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");

        sb.append("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css' integrity='sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh' crossorigin='anonymous'>");
        sb.append("<link rel='stylesheet' type='text/css' href='../styles/form-styles.css'/>");

        sb.append(" <title>Thank You!</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<header>");
        sb.append("<nav class='navbar navbar-expand-lg navbar-light bg-primary '>");
        sb.append("<a class='navbar-brand text-light' href='https://denis-kisina.github.io/WEB-Application-Programming-cs472/'>CS472-WAP:: LAB12 </a>");
        sb.append("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>");
        sb.append(" <span class='navbar-toggler-icon'></span>");
        sb.append("</button>");
        sb.append(" <div class='collapse navbar-collapse ' id='navbarNav'>");
        sb.append("  <ul class='navbar-nav mr-auto mt-2 mt-lg-0'>");

        sb.append(" <li class='nav-item'>");
        sb.append(" <a class='nav-link text-light' href='/Java_Servlet_WebApp/>Home </a>");
        sb.append("</li>");
        sb.append(" <li class='nav-item'>");
        sb.append("      <a class='nav-link text-light' href='#'>About</a>");
        sb.append("    </li>");
        sb.append("      <li class='nav-item'>");
        sb.append("      <a class='nav-link text-light' href=''>Contact Us</a>");
        sb.append("   </li>");
        sb.append(" </ul>");
        sb.append("  <form class='form-inline my-2 my-lg-0'>");
        sb.append("   <input class='form-control mr-sm-2' type='search' placeholder='Search' aria-label='Search'>");
        sb.append("   <button class='btn btn-outline-success my-2 my-sm-0' type='submit'>Search</button>");
        sb.append("  </form>");
        sb.append("</div>");

        sb.append("</nav>");

        sb.append("</header>");

        sb.append("<main>");
        sb.append("<div class='container border mt-5'>");
        sb.append("<div class='col-12 form-group mb-5 mt-1'>");
        sb.append("  <p class='text-secondary float-right'>Wednesday, 6 2020.</p>");
        sb.append(" </div>");
        sb.append(" <div class='col-12 form-group bg-light mt-5'>");
        sb.append("   <h1>Thank You! Your message has been received as follows:</h1>");
        sb.append("  </div>");
        sb.append("<div class='col-12 form-group mt-5'>");
        sb.append("  <p>Name: "+fullName+ "</p>");
        sb.append("</div>");
        sb.append("<div class='col-12 form-group mt-5'>");
        sb.append("  <p>Gender:</p>");
        sb.append("</div>");
        sb.append("<div class='col-12 form-group mt-5'>");
        sb.append("   <p>Category:</p>");
        sb.append("</div>");
        sb.append("<div class='col-12 form-group mt-5'>");
        sb.append(" <p>Message:</p>");
        sb.append("</div>");

        sb.append("</div>");

        sb.append("</main>");


        sb.append("<script src='https://code.jquery.com/jquery-3.4.1.slim.min.js'");
        sb.append("integrity='sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n'");
        sb.append("crossorigin='anonymous'></script>");
        sb.append("<script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js'");
        sb.append("integrity='sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo'");
        sb.append("crossorigin='anonymous'></script>");
        sb.append("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js");
        sb.append(" integrity='sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6'");
        sb.append(" crossorigin='anonymous'></script>");
        sb.append("<script defer type='text/javascript' src='./js/app1.js'></script>");

        sb.append("</body>");
        sb.append("</html>");
        response.setContentType("text/html");
        response.getWriter().println(sb.toString());
    }
}
