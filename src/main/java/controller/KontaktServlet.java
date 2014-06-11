package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.CSVKontakt;
import persistence.KontaktDAO;
import model.Kontakt;


public class KontaktServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestVorname= request.getParameter("name");
		String requestNachname = request.getParameter("name");
		String requestWohnort = request.getParameter("wohnort");
		String requestNachrricht = request.getParameter("nachrricht");
		String requestEmail = request.getParameter("email");
		String requestTelefonNummer = request.getParameter("telefonnummer");
		
		KontaktDAO contactDAO = new CSVKontakt();
		Kontakt contact = new Kontakt(requestVorname,requestNachname,requestWohnort,requestNachrricht,requestEmail , requestTelefonNummer);
		
		if(contact.isValid()){
			try {
				contactDAO.Save(contact);
				response.setContentType("text/html");
				response.getWriter().write(String.format("<h1>Hallo %s!</h1>", requestVorname));
				response.getWriter().write("<p>Vielen Danke für ihren kommentar.Die Daten wurden erfolgreich gespeichert</p>");
				response.getWriter().write("<a href=\"fragen.html\">Zurück zur StartSeite</a>");
				response.getWriter().close();
			} catch (Exception e) {
				response.setContentType("text/html");
				response.getWriter().write("<h1>Fehler !</h1>");
				response.getWriter().write("<p>Ein fehler ist aufgetreten.Beim Speichern der Daten"+e.getMessage());
				response.getWriter().write("<a href=\"fragen.html\">Zurück zur StartSeite</a>");
				response.getWriter().close();
			}			
		}else{
			response.setContentType("text/html");
			response.getWriter().write("<h1>Fehler !</h1>");
			response.getWriter().write("<p>Ein fehler ist aufgetreten mindestends ein Pflichtpfeld fehlt!(name,email,wohnort,nachrricht)</p>");
			response.getWriter().write("<a href=\"fragen.html\">Zurück zur StartSeite</a>");
			response.getWriter().close();
		}
	}

}
