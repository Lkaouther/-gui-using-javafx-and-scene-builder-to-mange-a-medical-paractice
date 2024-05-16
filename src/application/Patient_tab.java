package application;



public class Patient_tab {
	private int id ;
	private String nom;
	private String prenom;
	private String heure ;
	private String date;
	private String antm ;
	private String antc;
	
	public Patient_tab(int id,String nom, String prenom,String heure, String date,String antc,String antm) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.heure = heure;
		this.date = date;
		this.antc = antc;
		this.antm = antm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAntm() {
		return antm;
	}
	public void setAntm(String antm) {
		this.antm = antm;
	}
	public String getAntc() {
		return antc;
	}
	public void setAntc(String antc) {
		this.antc = antc;
	}
	
	
}
