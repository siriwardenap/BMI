<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter height and weight here Jee</h2>
<br>
<form action="${pageContext.request.contextPath}/convertMetric" method=post>
<table  >
<tr>
<td>Weight in kilograms</td>
<td><input type="text" name="weight" id="txtweight"/></td>
<td>Height in centimeters</td>
<td><input type="text" name="height" id="txtheight"/></td>
</tr>
</table>
<input type="submit" name="next" value="Calculate BMI">
</form>
</body>
</html>