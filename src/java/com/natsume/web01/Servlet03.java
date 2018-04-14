package com.natsume.web01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet03 extends HttpServlet {

       @Override
       // Recibe ua petición del cliente, a través de un formulario, y genera una respuesta
       protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();

        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Información de la persona solicitante</title>");
        pw.println("<meta charset='UTF-8' />");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>Datos enviados</h1>");
        pw.println("<p><strong>Nombre:</strong> " +request.getParameter("nombre")+ "</p>");
        pw.println("<p><strong>Apellidos:</strong> " +request.getParameter("apellidos")+ "</p>");
        pw.println("<p><strong>Edad:</strong> " +request.getParameter("edad")+ "</p>");
        pw.println("<p><strong>Sexo:</strong> " +request.getParameter("sexo")+ "</p>");
        pw.println("<p><strong>Curso:</strong> " +request.getParameter("curso")+ "</p>");
        pw.println("<p><strong>E-mail:</strong> " +request.getParameter("email")+ "</p>");
        pw.println("<p>La solictud ha sido tramitada.</p>");
        pw.println("<p><a href=index.html>Volver a la página principal</a></p>");
        pw.println("</body>");
        pw.println("</html>");
    }

}