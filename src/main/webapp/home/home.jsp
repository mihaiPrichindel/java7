<%@page import="com.sda.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>
        <br>de aici incepe mare fun

        <br>3.facem meniu (hotaram ce sa avem in meniu).

        <br>4.fiecare buton din meniu o sa ne duca in alta pagina. (pagina corespunzatoare a ceea ce am selectat)

        <br> 5. odata creata pagina dorita (nu stiu inca ce "business" o sa avem) va  avea forma ei.

       <%

         ExampleModel exampleModel = (ExampleModel)request.getAttribute("key");%>
              </br>
                   <%=exampleModel.javaProperty%>
    </body>
</html>


