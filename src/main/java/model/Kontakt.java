package model;

public class Kontakt {

	private String name;
	private String wohnort;
	private String telefonnummer;
	private String email;
	private String nachrricht;

	public Kontakt(){
		
	}
	
	public Kontakt(String name , String wohnort, String nachrricht ,String email){
		this.name 	= name;
		this.wohnort 	= wohnort;
		this.nachrricht = nachrricht;
		this.email 		= email;
	}
	
	public Kontakt(String name, String wohnort, String nachrricht ,String email,String telefonnummer){
		this.name=name;
		this.wohnort 	= wohnort;
		this.nachrricht = nachrricht;
		this.email 		= email;
		this.telefonnummer = telefonnummer;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return (name != null && !name.isEmpty())  //isEmpty checks only the length
				&& (wohnort != null && !wohnort.isEmpty()) 
				&& (email != null && !email.isEmpty()) 
				&& (nachrricht != null && !nachrricht.isEmpty());
	}
}
