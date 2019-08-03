

<%--<%= request.getParameter("firstName") %>--%>
<%--<%= request.getParameter("lastName") %>--%>
<%--<%= request.getParameter("lastName") %>--%>

The student is confirmed:
${param.firstName}
${param.lastName}

Languages known:
<ul>
    <%
    String[] langs = request.getParameterValues("language");
        for (String temp: langs) {

            out.println("<li>" + temp + "</li");


        }
    %>
</ul>

<%--</body>--%>
<%--</html>--%>
