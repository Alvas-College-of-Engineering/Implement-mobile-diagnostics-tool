<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mobile Diagnostics Tool</title>
</head>

<body>

<h1>Mobile Diagnostics Tool</h1>

<form action="DiagnosticServlet" method="post">

    Device Name:
    <input type="text" name="deviceName"><br><br>

    Battery Percentage:
    <input type="text" name="battery"><br><br>

    Storage Available:
    <input type="text" name="storage"><br><br>

    Connectivity:
    <input type="text" name="connectivity"><br><br>

    <input type="submit" value="Check Device">

</form>

</body>
</html>