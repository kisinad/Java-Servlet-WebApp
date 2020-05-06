package edu.miu.cs472.lab12.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ContactFormServlet", urlPatterns = {"/ContactFormServlet","/contactform"})
public class ContactFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setBufferSize(8192);
        StringBuilder sb = new StringBuilder();
        sb.append("<!doctype html>");
        sb.append("<html lang='en'>");
        sb.append("<head>");
        sb.append(" <meta charset='UTF-8'>");
        sb.append(" <meta name='viewport' content='width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0'>");
        sb.append("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");

        sb.append("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css' integrity='sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh' crossorigin='anonymous'>");
        sb.append("<link rel='stylesheet' type='text/css' href='../styles/form-styles.css'/>");

        sb.append(" <title>CS472-WAP LAB12</title>");
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
        sb.append("<div class='container bg-light'>");
        sb.append("<h2>Customer Contact Form </h2>");
        sb.append("<form method='post' action='#'>");

        sb.append(" <div class='row mt-5'>");
        sb.append(" <div class='col-12 form-group '>");
        sb.append("  <div class='form-group'>");
        sb.append("  <label for='nameId'>*Name:</label>");
        sb.append("       <input class='form-control form-control-lg' type='text' id='nameId' name='name' placeholder='e.g. John Smith' />");
        sb.append("    <p class='text-secondary'>Enter your full name.</p>");
        sb.append("   </div>");
        sb.append("  <div class='col-12 form-group'>");
        sb.append("   <label>*Gender: </label><br>");
        sb.append("  <input type='checkbox' id='maleId' name='male'>");
        sb.append("  <label for='maleId'>Male</label>");
        sb.append("     <input type='checkbox' id='femaleId' name='female'>");
        sb.append("   <label for='femaleId'>Male</label>");
        sb.append("     </div>");
        sb.append("  <div class='col-12 form-group'>");
        sb.append("    <label for='categoryId'>*Category:</label>");
        sb.append("        <select id='categoryId' class='form-control form-control-lg' name='category'>");
        sb.append("         <option value=''>Select...</option>");
        sb.append("    <option>Category One</option>");
        sb.append("<option>Category Two</option>");
        sb.append("  <option>Category Three</option>");
        sb.append(" <option>Category Four</option>");
        sb.append("    </select>");
        sb.append("   </div>");
        sb.append("  <div class='col-12 form-group'>");
        sb.append("     <label for='messageId'>Example textarea</label>");
        sb.append("    <textarea class='form-control' id='messageId' rows='3'></textarea>");
        sb.append("     </div>");
        sb.append("    <div class='col-12 form-group'>");
        sb.append(" <input id='submit' class='col-12 btn btn-primary btn-lg' type='submit' value='Submit'>");
        sb.append("   </div>");

        sb.append(" </div>");
        sb.append(" </div>");
        sb.append("</form>");
        sb.append(" </div>");
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
        PrintWriter printWriter = response.getWriter();
        printWriter.println(sb.toString());
    }
}
