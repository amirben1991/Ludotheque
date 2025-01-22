package fr.eni.projetLudotheque.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// TODO: résoudre le souci au niveau du gradle et des importations des librairies
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Min;

public class Jeu {
	
//	@NotBlank
	private Integer noJeu;
	
	private String titre;
	
	private String reference;
	
	private String description;
	
	
	
//	
	private Float tarifJournee;
	
	private int ageMin;
	
	private int duree;
	
	// Appel la la liste contenue dans la classe Genre
	private List<Genre> genres;
	
	
	public Jeu() {
		genres = new ArrayList<>();
	}
	
	
	// Constructeur avec noJeu comme seul attribut
	public Jeu(Integer noJeu) {
		this();
		this.noJeu = noJeu;
	}
	
	public Jeu(Integer noJeu, String titre, 
			String reference, String description,
			Float tarifJournee, int ageMin, int duree
			) 
		{
			this(noJeu);
			this.titre = titre;
			this.reference = reference;
			this.description = description;
			this.tarifJournee = tarifJournee;
			this.ageMin = ageMin;
			this.duree = duree;
			this.genres = new ArrayList<>();
		}
	
	
	

}

	public Integer getNoJeu() {
		return noJeu;
	}

	public void setNoJeu(Integer noJeu) {
		this.noJeu = noJeu;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getTarifJournee() {
		return tarifJournee;
	}

	public void setTarifJournee(Float tarifJournee) {
		this.tarifJournee = tarifJournee;
	}

	public int getAgeMin() {
		return ageMin;
	}

	public void setAgeMin(int ageMin) {
		this.ageMin = ageMin;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}


	@Override
	public String toString() {
		return "Jeu [noJeu=" + noJeu + ", titre=" + titre + ", reference=" + reference + ", description=" + description
				+ ", tarifJournee=" + tarifJournee + ", ageMin=" + ageMin + ", duree=" + duree + "]";
	}
	
	
	// valeur de hashage de notre objet
	@Override
	public int hashCode() {
		return Objects.hash(noJeu);
	
	}
	

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if (this == null) {
			return false;
		}
		
		if (getClass() != obj.getClass())
			return false;
		
		
		Jeu Other = (Jeu) obj;
		return Objects.equals(noJeu, Other.noJeu);
	}
}