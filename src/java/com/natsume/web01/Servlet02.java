package com.natsume.web01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends HttpServlet {

    @Override
    // Recibe una petición del cliente y genera una respuesta
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter(); 
            
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Saludo desde un servlet</title>");            
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>Hola desde un servlet.</h1><br/>");
        pw.println("<p>Esto es una prueba de 'doGet'.</p>");
        pw.println("</body>");
        pw.println("</html>");
        
    }

}