<html>
<body>

The student is confirmed:
<%= request.getParameter("firstName") %>
<%= request.getParameter("lastName") %>

<% String[] langs = request.getParameterValues("favoriteLanguage");
    for (String tempLang:langs){
        out.println("<li>" + tempLang + "</li>");
    }
%>

<br>
${param.firstName}
${param.lastName}

</body>
</html>

