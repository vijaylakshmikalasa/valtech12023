<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Results</title>
</head>
<body>
<script>

<% String message = (String)request.getAttribute("message"); %>
 
    <% if (message != null) { %>
 
        alert('<%= message %>');
 
    <% } %>
    </script>
Message = <%= request.getAttribute("message") %>
</body>
</html>