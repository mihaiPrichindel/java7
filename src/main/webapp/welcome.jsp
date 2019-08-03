<html>
<head>
 <%@ page import="com.sda.welcome.Welcome" %>
</head>
<body>

<h2>
 Here is my first JSP application
</h2>

Time on the server is <%= new java.util.Date() %>
<br>
<%= new String("Hello World").toUpperCase() %>

<br>
Call on java Class Welcome method sum: <%= Welcome.sum(2, 3)%>

<%! int sum(int a, int b) {
 return a + b;
 }
 %>

<br>
Method 2: Method sum declared within JSP: <%= sum(2,3) %>


</body>
</html>