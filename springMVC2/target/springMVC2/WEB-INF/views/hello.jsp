<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Form</title>
</head>
<body>
<h2>Enter Your Name</h2>
<form action="${pageContext.request.contextPath}/hello" method="post">
    <input type="text" name="name" required/>
    <input type="submit" value="Submit"/>
</form>

<c:if test="${not empty message}">
    <h3>${message}</h3>
</c:if>
</body>
</html>
