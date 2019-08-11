<%@page import="com.sda.model.*" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<html>
    <body>
    <%List<Client> clientList = (List<Client>) request.getAttribute("Client");%>

    <h2>Tabel clienti</h2>
        <table border="1" align="center">
            <tr>
                <th type="text">ID</th>
                <th type="text">Nume</th>
                <th type="text">Prenume</th>
                <th type="nmber">CNP</th>
            </tr>
            <%
                for(Client client:clientList){
                    %>
            <tr>
                <td type="text"><%=client.getId()%></td>
                <td type="text"><%=client.getNume()%></td>
                <td type="text"><%=client.getPrenume()%></td>
                <td type="number"><%=client.getCnp()%></td>
            </tr>
            <%
                    //aceasta acolada este de la for-ul de sus.
                } %>
        </table>
    </body>
</html>


