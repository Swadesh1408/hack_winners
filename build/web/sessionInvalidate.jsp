<%-- 
    Document   : sessionInvalidate
    Created on : 20 Mar, 2024, 8:28:09 AM
    Author     : Swadesh Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%
    HttpSession sess=request.getSession();
    sess.invalidate();
    response.sendRedirect("login.jsp");
%>
