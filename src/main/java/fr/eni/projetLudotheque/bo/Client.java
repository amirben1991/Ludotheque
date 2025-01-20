package fr.eni.projetLudotheque.bo;

import java.util.Objects;

public class Client {
	
	private Integer noClient;
	private String nom;
	private String prenom;
	
	private String email;
	private String noTelephone;
	
	private String rue;
	
	private String codePostal;
	
	private String ville;
	
	
	// Constructor
	public Client(String nom, String prenom, String email, String noTelephone, String rue, String codePostal, String ville) {
		
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.noTelephone = noTelephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	
	
	// Exhaustive Constructor
	public Client(Integer noClient, String nom, String prenom, String email, String noTelephone, String rue, String codePostal, String ville) {
		
		super();
		this.noClient = noClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.noTelephone = noTelephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}


	/*
	 * Getters --> méthode pour accéder aux valeurs des attributs privés de la classe
	 * Setters --> Méthodes pour modifier les valeurs des attributs privés de la classe
	 * Utiles pour contrôler l'accès et la modification des données d'un objet.
	 */
	
	public Integer getNoClient() {
		return noClient;
	}



	public void setNoClient(Integer noClient) {
		this.noClient = noClient;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNoTelephone() {
		return noTelephone;
	}



	public void setNoTelephone(String noTelephone) {
		this.noTelephone = noTelephone;
	}



	public String getRue() {
		return rue;
	}



	public void setRue(String rue) {
		this.rue = rue;
	}



	public String getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}


	// Méthode to string --> pour représenter l'objet sous forme de chaîne de caractères.
	@Override
	public String toString() {
		return "Client [noClient=" + noClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", noTelephone=" + noTelephone + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville
				+ "]";
	}
	
	// Implémentation de hashCode avec attribut noClient --> génère un code de hachage unique pour chaque objet 
	
	@Override
	public int hashCode() {
		return Objects.hash(noClient);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (this == null) 
			return false;
		
		
		if (getClass() != obj.getClass()) 
			return false;
			
		Client other = (Client) obj;
		return Objects.equals(noClient, other.noClient);
	}


}
	

