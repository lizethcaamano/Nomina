package com.ejercicios.Nomina.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NominaServlet", value = "/NominaServlet")
public class NominaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request.setAttribute("nombre", request.getParameter(""));

        PrintWriter out = response.getWriter();


        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
        out.println("</head>");
        out.println("<body>");

        //Trayendo variables del formulario
        out.println("Nombre:");
        String name= request.getParameter("nombre");
        out.println(name);

        out.println("<br>");

        out.println("Apellidos:");
        String apellido= request.getParameter("apellidos");
        out.println(apellido);

        out.println("<br>");

        out.println("Documento:");
        String doc= request.getParameter("documento");
        out.println(doc);

        out.println("<br>");

        out.println("Dias laborados:");
        String diaslab= request.getParameter("dlaborados");
        int dlaborados = Integer.parseInt(diaslab);
        out.println(dlaborados);

        out.println("<br>");

        out.println("Sueldo:");
        String sueldo= request.getParameter("salario");
        int salario = Integer.parseInt(sueldo);
        out.println(sueldo);

        //Convirtiendo variables


        out.println("</body>");
        out.println("</html>");
        //calculando


    }
}
