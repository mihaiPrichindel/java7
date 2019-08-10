<%@page import="com.sda.model.*"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>

</head>
    <body>
    <% List<Client> clientList = (List<Client>)request.getAttribute("Clients"); %>

    <table border="1" align="center">
        <tr>
            <th type="number">ID</th>
            <th type="text">Firstname</th>
            <th type="text">Lastname</th>
            <th type="text">CNP</th>
        </tr>

        <% for(Client client : clientList) { %>
        <tr>
            <td><%=client.getId()%></td>
            <td><%=client.getNume()%></td>
            <td><%=client.getPrenume()%></td>
            <td><%=client.getCNP()%></td>
        </tr>
        <% } // aceasta acolada se poate folosi separat de codul html sa includem un cod html in interiorul unui cod java

        %>
    </table>

    <div align="center"><a href="http://localhost:8080/JSPProject/index.jsp">Return to login page</a></div>
    </body>
</html>


