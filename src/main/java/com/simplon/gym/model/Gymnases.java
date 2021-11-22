package com.simplon.gym.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document()
public class Gymnases {
	
//	 @BsonIgnore
//	 @JsonProperty("_id")

	 @Id
	 private String id;
	 @Field(name="IdGymnase")
	 private int idGymnase;
	 @Field(name="NomGymnase")
	 private String nomGymnase;
	 @Field(name="Adresse")
	 private String adresse;
	 @Field(name="Ville")
	 private String ville;
	 @Field(name="Surface")
	 private int surface;
	 
	 private List<Seances> Seances;

	
	

	public Gymnases(String id, int idGymnase, String nomGymnase, String adresse, String ville, int surface,
			List<Seances> Seances) {
		super();
		this.id = id;
		this.idGymnase = idGymnase;
		this.nomGymnase = nomGymnase;
		this.adresse = adresse;
		this.ville = ville;
		this.surface = surface;
		this.Seances = Seances;
	}

	public Gymnases() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String _id) {
		this.id = _id;
	}

	public int getIdGymnase() {
		return idGymnase;
	}

	public void setIdGymnase(int idGymnase) {
		this.idGymnase = idGymnase;
	}

	public String getNomGymnase() {
		return nomGymnase;
	}

	public void setNomGymnase(String nomGymnase) {
		this.nomGymnase = nomGymnase;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	
	
	
	public List<Seances> getSeance() {
		return Seances;
	}

	public void setSeance(List<Seances> Seances) {
		this.Seances = Seances;
	}

	@Override
	public String toString() {
		return "Gymnase [id=" + id + ", idGymnase=" + idGymnase + ", nomGymnase=" + nomGymnase + ", adresse=" + adresse
				+ ", ville=" + ville + ", surface=" + surface + ", seance=" + Seances + "]";
	}
	 
	 
	 

}
