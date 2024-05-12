package application;

public class Prog_j_tab {
	private int id ;
	private String nom;
	private String prenom;
	private String heure ;
	
	
	
public Prog_j_tab (int id ,String nom, String prenom,String heure){
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.heure = heure;
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

}
