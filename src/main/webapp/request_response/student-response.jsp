The student is confirmed:
<%= request.getParameter("firstName")%>
<%= request.getParameter("lastName")%>


The student is confirmed (alternativ):
${param.firstName}
${param.lastName}



<ul>
    <%
        String[] langs = request.getParameterValue("favoriteLanguage");

        for(String tempLang :langs) {
            out.println("<li>" + tempLang + "</li>")
        }
    %>
</ul>
