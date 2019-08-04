
<html>
<%@ page import="com.sda.welcome.*" %>
<body>
<h3> Here is my first JSP  application</h3>

Time on the server is <%= new java.util.Date()%>
<br/>
Converting a string to Uppercase:
<%= new String("Hello World").toUpperCase() %>

<br/>

Call on java class sum method is:
<%=Welcome.sum(3,8)%>
<%!

int sum(int a, int b){
    return a+b;
}
%>
<br/>
Call on JSP sum method is:
<%=sum(3,4)%>


</body>
</html>