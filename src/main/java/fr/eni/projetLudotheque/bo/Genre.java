package fr.eni.projetLudotheque.bo;

public class Genre {
	
	
	private Integer noGenre;
	private String categorie;
	
	public Genre() {
		
	}
	
	public Genre(Integer noGenre, String categorie) {
		super();
		this.noGenre = noGenre;
		this.categorie = categorie;
	}

	public Integer getNoGenre() {
		return noGenre;
	}

	public void setNoGenre(Integer noGenre) {
		this.noGenre = noGenre;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Genre [noGenre=" + noGenre + ", categorie=" + categorie + "]";
	}
	

}
