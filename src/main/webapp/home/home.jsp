<%@page import="com.sda.model.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<html>
    <body>
    <%Client client = (Client) request.getAttribute("Client");%>

    <h2>Tabel clienti</h2>
        <table style="width: 100%">
            <tr>
                <td type="text">Nume</td>
                <td type="text">Prenume</td>
                <td type="nmber">CNP</td>
            </tr>
            <tr>
                <td type="text"><%=client.getNume()%></td>
                <td type="text"><%=client.getPrenume()%></td>
                <td type="number"><%=client.getCnp()%></td>
            </tr>
        </table>
    </body>
</html>


