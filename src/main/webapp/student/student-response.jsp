This student is confirmed:
<%= request.getParameter("firstName") %>
<%= request.getParameter("lastName")%>

<!--display list of "favoriteResponse"-->
<ul>
    <%
        String[] response = request.getParameterValues("favoriteResponse");
        for (String temp: response){
            out.println("<li>" + temp+ "</li>";
        }
        %>
    %>
</ul>