package com.yassine.localisation.entites;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String password;
//	@ManyToOne
//	private Pharmacie pharmacie;
//
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name = "role_user", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//	private List<Role> roles = new ArrayList<>();

//	public List<Role> getRoles() {
//		return roles;
//	}
//
//	
//
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

//	public Pharmacie getPharmacie() {
//		return pharmacie;
//	}
//
//
//
//	public void setPharmacie(Pharmacie pharmacie) {
//		this.pharmacie = pharmacie;
//	}



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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User() {
		super();
	}

}