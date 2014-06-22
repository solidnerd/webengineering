package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		String requestName= request.getParameter("name");
		String requestWohnort = request.getParameter("wohnort");
		String requestNachrricht = request.getParameter("nachrricht");
		String requestEmail = request.getParameter("email");
		String requestTelefonNummer = request.getParameter("telefonnummer");
		
		KontaktDAO contactDAO = new CSVKontakt();
		Kontakt contact = new Kontakt(requestName,requestWohnort,requestNachrricht,requestEmail , requestTelefonNummer);
		
		if(contact.isValid()){
			request.setAttribute("kontakt", contact);
			try {
				RequestDispatcher view  = request.getRequestDispatcher("formular_ok.jsp");
				view.forward(request, response);
			} catch (Exception e) {
				RequestDispatcher view  = request.getRequestDispatcher("formular_error.jsp");
				view.forward(request, response);
			}			
		}else{
			RequestDispatcher view  = request.getRequestDispatcher("formular_error.jsp");
			view.forward(request, response);
		}
	}

}
