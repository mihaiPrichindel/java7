<html>
    <%@ page import="com.sda.welecome.*" %>

    <body>

        <h2>
        Here is my first JSP application
        </h2>

        Time on the server is: <%= new java.util.Date()%>
        <br>
        <%=Welcome.sum(3,3)%>
    </body>
</html>
