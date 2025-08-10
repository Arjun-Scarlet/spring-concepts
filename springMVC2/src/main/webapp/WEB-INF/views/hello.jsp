<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello Form</title>
    </head>
    <body>
        <h2>Enter Your Name</h2>

        <form action="hello" method="post">
            <input type="text" name="name" required/>
            <input type="submit" value="Submit"/>
        </form>

        <%String msg = (String) request.getAttribute("message");%>
        <h3><%= msg %></h3>
    </body>
</html>
