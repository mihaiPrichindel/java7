<%--
  Created by IntelliJ IDEA.
  User: ghost
  Date: 8/3/2019
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Response</title>
</head>
<body>

The student is confirmed:
<%= request.getParameter("firstName")%> <%= request.getParameter("lastName")%>
<br>
The student is confirmed: ${param.firstName} ${param.lastName}
<br>
List of favorite languages:

<!-- display list of "favoriteLanguage" -->
<ul>
    <%
        String[] langs = request.getParameterValues("favoriteLanguage");

        for (String lang : langs) {
            out.println("<li>" + lang + "</li>");
        }
    %>
</ul>
</body>
</html>
