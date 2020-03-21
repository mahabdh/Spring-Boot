package com.ingweb.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//entite JPA : utiliser le mapping Objet/Relationnel
@Entity
public class Contact implements Serializable { //les entites sont serialisables
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String email;
	private String photo;
	private long tel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public Contact(String nom, String prenom, java.util.Date date, String email, String photo, long tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = (Date) date;
		this.email = email;
		this.photo = photo;
		this.tel = tel;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
