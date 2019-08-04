The student is confirmed:
<%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %>

<%
    String[] resp = request.getParameterValues("favouriteResponse");
    for (String tempResp : resp) {
        out.println("<li>" + tempResp + "</li>");
    }
%>