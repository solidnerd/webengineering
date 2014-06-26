<!-- Scope must be set on the BEAN , cause Jetty doesnt interpreted the Default Scope-->
<jsp:useBean id="kontakt" class="model.Kontakt" scope="request"/> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Verein Formular Ok</title>
</head>
<body>
	<h1>
		Hallo<jsp:getProperty property="name" name="kontakt"/>!
	</h1>
	<p>
		Vielen Danke für ihren kommentar.Die Daten wurden erfolgreich gespeichert.
	</p>
	<table>
		<tr>
			<td>
				Name:<jsp:getProperty property="name" name="kontakt"/>
			</td>
		</tr>
		<tr>
			<td>
				Wohnort:<jsp:getProperty property="wohnort" name="kontakt"/>
			</td>
		</tr>
		<tr>
			<td>
				Email:<jsp:getProperty property="email" name="kontakt"/>
			</td>
		</tr>
		<tr>
			<td>
				Nachrricht:<jsp:getProperty property="nachrricht" name="kontakt"/>
			</td>
	 	</tr>
		<tr>
			<td>
				Telefon:<jsp:getProperty property="telefonnummer" name="kontakt"/>
			</td>
		</tr>		
	</table>
	<a href="uebersicht.html">Zurück zur StartSeite</a>
</body>
</html>