<%@page import="com.sda.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>

    <% Client client= (Client)request.getAttribute("Clients");%>

        <br>de aici incepe mare fun

        <br>3.facem meniu (hotaram ce sa avem in meniu).

        <br>4.fiecare buton din meniu o sa ne duca in alta pagina. (pagina corespunzatoare a ceea ce am selectat)

        <br> 5. odata creata pagina dorita (nu stiu inca ce "business" o sa avem) va  avea forma ei.

       <%

         ExampleModel exampleModel = (ExampleModel)request.getAttribute("key");%>
              </br>
                   <%=exampleModel.javaProperty%>
        <br/>

    <table border="1" allign="center">Clienti<br/>
        <tr>
            <th type="text">Nume</th>
            <th type="text">Prenume</th>
            <th type="number">CNP</th>
        </tr>

        <tr>
            <td type="text"><%=client.getNume()%></td>
            <td type="text"><%=client.getPrenume()%></td>
            <td type="number"><%=client.getCNP()%></td>
        </tr>

    </table>
    <div align="center"><a href="http://localhost:8080/FirstProject">Return to login page</a></div>
    </body>
</html>


