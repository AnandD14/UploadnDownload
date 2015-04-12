

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
       HttpSession sess=request.getSession();
       sess.invalidate();
       response.sendRedirect("home.jsp");
       %>
    </body>
</html>
