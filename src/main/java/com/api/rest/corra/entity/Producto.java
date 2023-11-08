package com.api.rest.corra.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Integer id;
	private String n_producto;
	private Double precio_producto;
	private Date fecha_v;
	private String marca;
	private String descripcion;
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	private String foto;
	
	
	
	
	public Producto() {
		
	}
	
	

	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	public Date getFecha_v() {
		return fecha_v;
	}



	public void setFecha_v(Date fecha_v) {
		this.fecha_v = fecha_v;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getN_producto() {
		return n_producto;
	}

	public void setN_producto(String n_producto) {
		this.n_producto = n_producto;
	}

	public Double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(Double precio_producto) {
		this.precio_producto = precio_producto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
