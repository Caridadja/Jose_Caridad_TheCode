<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1><c:out value="${error}"/></h1>
<h1>What is the code?</h1>
<form method="post" action="/showCode">
<label><input type="password" name="code"></label>
<button>Try Code</button> </form>
</body>
</html>