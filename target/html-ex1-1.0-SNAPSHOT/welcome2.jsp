
<html>
<%@ page import="com.sda.welcome.Welcome" %>
<body>

<h2>
    Here is my first JSP application
</h2>

Time on the server is <%= new java.util.Date()%>
<br>
<%= new String("Hello World").toUpperCase()%>

<br>
Call on java class sum method is <%=Welcome.sum(3,4)%>
<br>
<%! public static int sum(int a, int b){
    return a+b;}
%>

<%= sum(7, 7)%>


</body>
</html>