<%@ page import="static java.lang.System.out" %>
<%@ page import="com.sda.welcome.Welcome" %>
<html>

<body>

<h2>
    Here is my first JSP application
</h2>

Time on the servers is: <%=new java.util.Date()%><br/>
Converting a string to uppercase: <%=new String("Hello World").toUpperCase()%>
<br/>
<%!
    public int sum(int a, int b){
        return a+b;
    }
%>
Call on JSP sum method is: <%= sum(7,8)%>
<br/>
Call on java Class sum method is : <%=Welcome.sum(3, 4)%>

</body>

</html>