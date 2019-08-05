<html>
<body>
<br/>
<%= request.getParameter("firstName")%>
<%= request.getParameter("LastName")%>
<% String[] langs=request.getParameterValues("favouriteLanguage");
for(String tempLang:langs){
        out.println("<li>"+tempLang+"</li>");
    }
%>
<br/>
${param.firstName}
${param.LastName}
</body>

</html>



