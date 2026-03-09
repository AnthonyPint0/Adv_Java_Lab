<%-- 
    Document   : welcome
    Created on : 09-Mar-2026, 4:41:51 pm
    Author     : LENOVO
--%>

<%@ page session="true" %>

<html>
<body>

    <%
    String user = (String) session.getAttribute("username");

    if(user == null){
        response.sendRedirect("index.html");
    }
    %>

    <h2>Welcome <%= user %></h2>

    <a href="LogoutServlet">Logout</a>

</body>
</html>