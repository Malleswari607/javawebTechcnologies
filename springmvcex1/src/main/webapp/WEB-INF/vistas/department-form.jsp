<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Form</title>
</head>
<body>

<form:form action="save" method="post" modelAttribute="department">
<table>
    <tr>
        <td>Name:</td>
        <td><form:input path="name"/></td>
        <td><form:errors path="name" style="color:red;"/></td>
    </tr>
    <tr>
        <td>Department Name:</td>
        <td><form:input path="dept_name"/></td>
        <td><form:errors path="dept_name" style="color:red;"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="Save"/></td>
    </tr>
</table>
</form:form>

</body>
</html>
