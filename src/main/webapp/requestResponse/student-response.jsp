
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

The student is confirmed:
<%= request.getParameter("firstName") %> <%= request.getParameter("lastName")%>


<!-- display list of "favoriteLAnguages"-->
<ul>

<%
    String[] langs = reguest.getParametersValues("favoriteLanguages");

    for (String tempLang: langs){
        out.println("<li>" + tempLang + "</li>");

    }
%>

</ul>
</body>
</html>
