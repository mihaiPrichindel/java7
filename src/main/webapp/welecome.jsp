<html>
<%@ page import="com.sda.welecome.*" %>
<body>

<h3>Here is my first JSP application</h3>

Time on the server is: <%= new java.util.Date() %> <br>


Converting a string to upercase
<br>
<br>
<br>
Call on JAVA class sum metod is :<%= Welecome.sum(3,3) %>
<br>
<br>
Call on JSP sum metod is : <%= sum(3,4)%>
<%!
    int sum(int a, int b) {
        return a+b;
    }
    //out.println(sum(3,4));
%>


</body>
</html>