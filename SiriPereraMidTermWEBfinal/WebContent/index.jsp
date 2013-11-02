<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BMI Calculator WEB</title>
</head>
<body>

<h1>Welcome to the BMI Calculator</h1>
<p>Body Mass Index (BMI) a measure of the portion of a person's weight that is made up 
of fat based on height and weight. BMI is not an entirely accurate measure because it does
not factor in age, gender, or an individual's muuscles-to-fat ratio but gives a useful estimate
and is used widely in fitness testing</p>


<br><br>
<h3>First, select your units of measure</h3>
<br>
<form action="${pageContext.request.contextPath}/enterValueChoice" method="post">
<table  >
<tr>
<td>Metric units</td>
<td><input type="submit" name="Metric" value="kilograms & centimeters"></td>
</tr><tr>
<td>US/Imperial units</td>
<td><input type="submit" name="Imperial" value="pounds & inches"></td>
</tr>
</table>

</form>
</body>
</html>