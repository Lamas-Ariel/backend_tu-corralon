package com.api.rest.corra.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Integer id;
	private String n_nombre;
	
	
	
	public Rol() {
		
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getN_nombre() {
		return n_nombre;
	}



	public void setN_nombre(String n_nombre) {
		this.n_nombre = n_nombre;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
