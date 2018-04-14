package com.natsume.web01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet01 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    // Recibe una petición del cliente, a través del formulario, y genera una respuesta
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        
	if ("admin".equals(request.getParameter("user")) && "1234".equals(request.getParameter("pass"))) {
            pw.println("Datos correctos. <br/>");
            pw.println("Pulsa el enlace para entrar al sistema...<br/>");
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head><title>Página de chequeo</title></head>");
            pw.println("<body><a href=ejercicios.html>Ir a la siguiente página</a></body>");
            pw.println("</html>");
	}
	else {
            pw.println("Datos incorrectos. Inténtalo de nuevo.<br/>");
            pw.println("<a href=index.html>Volver a la página principal</a>");
	}

    }

}