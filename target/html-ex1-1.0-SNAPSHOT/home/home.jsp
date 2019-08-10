<%@page import="com.sda.model.*"%>
<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>


<body>
<% Client client = (Client)request.getAttribute("Clients"); %>

<table border="1" align="center">
    <tr>
        <th type="text">Firstname</th>
        <th type="text">Lastname</th>
        <th type="number">CNP</th>
    </tr>

    <tr>
        <td><%=client.getNume()%></td>
        <td><%=client.getPrenume()%></td>
        <td><%=client.getCNP()%></td>
    </tr>
</table>

<div align="center"><a href="http://localhost:8080/FirstProject">Return to login page</a></div>
</body>
        </html>