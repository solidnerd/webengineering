package model;

public class Kontakt {

	private String vorname;
	private String nachname;
	private String wohnort;
	private String telefonnummer;
	private String email;
	private String nachrricht;

	
	public Kontakt(String vorname , String nachname, String wohnort, String nachrricht ,String email){
		this.vorname 	= vorname;
		this.nachname 	= nachname;
		this.wohnort 	= wohnort;
		this.nachrricht = nachrricht;
		this.email 		= email;
	}
	
	public Kontakt(String vorname , String nachname, String wohnort, String nachrricht ,String email,String telefonnummer){
		this.vorname 	= vorname;
		this.nachname 	= nachname;
		this.wohnort 	= wohnort;
		this.nachrricht = nachrricht;
		this.email 		= email;
		this.telefonnummer = telefonnummer;
	}
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getWohnort() {
		return wohnort;
	}
	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNachrricht() {
		return nachrricht;
	}
	public void setNachrricht(String nachrricht) {
		this.nachrricht = nachrricht;
	}

	public boolean isValid(){
		return (nachname != null && !nachname.isEmpty())  //isEmpty checks only the length
				&& (vorname != null && !vorname.isEmpty()) 
				&& (wohnort != null && !wohnort.isEmpty()) 
				&& (email != null && !email.isEmpty()) 
				&& (nachrricht != null && !nachrricht.isEmpty());
	}
}
