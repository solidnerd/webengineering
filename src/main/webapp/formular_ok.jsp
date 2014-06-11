<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Verein Formular Ok</title>
</head>
<body>
	<h1>Hallo <%=request.getParameter("name")%>!</h1>
	<p>Vielen Danke für ihren kommentar.Die Daten wurden erfolgreich gespeichert</p>
	<% Kontakt contact = (Kontakt) request.getAttribute("kontakt"); %>
	<table>
		<tr>
			<td>Name:<%= contact.getVorname() %> </td>
			<td>Wohnort:<%= contact.getWohnort() %> </td>
			<td>Email:<%= contact.getEmail() %> </td>
			<td>Nachrricht:<%= contact.getNachrricht() %> </td>
			<td>Telefon:<%= contact.getTelefonnummer() %> </td>
		</tr>
	</table>
	<a href=fragen.html>Zurück zur StartSeite</a>
</body>
</html>