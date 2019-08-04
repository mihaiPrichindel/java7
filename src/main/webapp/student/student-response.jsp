This student is confirmed:
<%= request.getParameter("firstName")%>
<%= request.getParameter("lastName")%>

<!--display list of "favoriteResponse"-->
<ul>
    <%
        String[] langs = request.getParameterValues("favoriteResponse");
        for (String temp: langs){
            System.out.println("<li>" + temp+ "</li>");
        }

    %>
</ul>