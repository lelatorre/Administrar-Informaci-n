<%-- 
    Document   : registro
    Created on : 29/09/2022, 8:18:55 a. m.
    Author     : lelp8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@page import = "registroHospital.Paciente" %>
        <%
        Paciente pa;
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        double codigo = Double.parseDouble(request.getParameter("identificacion"));
        String sexo=request.getParameter("sexo");
        String direccion =request.getParameter("direccion");
        String motivoConsulta=request.getParameter("motivoConsulta");
        String medico=request.getParameter("medico");
        String fechaCons=request.getParameter("fecha");
        String lugarAtencion =request.getParameter("lugar");
        %>
    </body>
</html>
