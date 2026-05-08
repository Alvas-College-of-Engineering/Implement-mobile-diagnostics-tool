<%@ page import="model.Device" %>

<%
Device d = (Device) request.getAttribute("device");
String health = (String) request.getAttribute("health");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diagnostic Result</title>
</head>

<body>

<h1>Device Diagnostics Result</h1>

<p>Device Name: <%= d.getDeviceName() %></p>
<p>Battery: <%= d.getBattery() %>%</p>
<p>Storage: <%= d.getStorage() %> GB</p>
<p>Connectivity: <%= d.getConnectivity() %></p>

<h2>Overall Health: <%= health %></h2>

</body>
</html>