<%@ page import="com.sda.welcome.Welcome" %>
<html>
<body>
<h2>
    Here is my first JSP application
</h2>


Time on the server is <%= new java.util.Date()%>
<br>

<%= new String("Hello World").toUpperCase()%>

<br>

Call on java class sum method is :<%=Welcome.sum(3,3)%>

        </body>

</html>