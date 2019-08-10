<%@page import="com.sda.model.*"%>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>

    <% List<Client> clientList= (List<Client>)request.getAttribute("Clients");%>


       <%

         ExampleModel exampleModel = (ExampleModel)request.getAttribute("key");%>
              </br>
                   <%=exampleModel.javaProperty%>
        <br/>

    <table border="1">
        <caption>
            Clienti
        </caption>
        <tr>
            <th type="number">Id</th>
            <th type="text">Nume</th>
            <th type="text">Prenume</th>
            <th type="text">CNP</th>
        </tr>

        <% for(Client client:clientList) {    %>
        <tr>
            <td type="number"><%=client.getId()%></td>
            <td type="text"><%=client.getNume()%></td>
            <td type="text"><%=client.getPrenume()%></td>
            <td type="text"><%=client.getCNP()%></td>
        </tr>

        <% // aceasta acolada este de la for each ul de mai sus
        } %>


    </table>
    <div align="center"><a href="http://localhost:8080/JSPProject">Return to login page</a></div>
    </body>
</html>


