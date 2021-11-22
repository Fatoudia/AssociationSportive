package com.simplon.gym.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Seances {

	@Field(name="IdSportifEntraineur")
	private int idSportifEntraineur;
	@Field(name="Jour")
	private String jour;
	@Field(name="Horaire")
	private int horaire;
	@Field(name="Duree")
	private int duree;
	@Field(name="Libelle")
	private String libelle;
	public Seances(int idSportifEntraineur, String jour, int horaire, int duree, String libelle) {
		super();
		this.idSportifEntraineur = idSportifEntraineur;
		this.jour = jour;
		this.horaire = horaire;
		this.duree = duree;
		this.libelle = libelle;
	}
	public int getIdSportifEntraineur() {
		return idSportifEntraineur;
	}
	public void setIdSportifEntraineur(int idSportifEntraineur) {
		idSportifEntraineur = idSportifEntraineur;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public int getHoraire() {
		return horaire;
	}
	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Seance [IdSportifEntraineur=" + idSportifEntraineur + ", jour=" + jour + ", horaire=" + horaire
				+ ", duree=" + duree + ", libelle=" + libelle + "]";
	}
	
	
	
	
	
}

