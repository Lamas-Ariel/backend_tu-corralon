package com.api.rest.corra.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private int id;
	private String n_categoria;
	
	
	
	
	public Categoria() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}





	public String getN_categoria() {
		return n_categoria;
	}





	public void setN_categoria(String n_categoria) {
		this.n_categoria = n_categoria;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
