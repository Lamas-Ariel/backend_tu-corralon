package com.api.rest.corra.entity;

import java.io.Serializable;

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
@Table(name = "items")
public class Item implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item")
	private Integer id;
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_factura")
	private Factura factura;
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_produto")
	private Producto producto;
	private Integer cantidad;
	
	
	
	
	public Item() {
		
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Factura getFactura() {
		return factura;
	}




	public void setFactura(Factura factura) {
		this.factura = factura;
	}




	public Producto getProducto() {
		return producto;
	}




	public void setProducto(Producto producto) {
		this.producto = producto;
	}




	public Integer getCantidad() {
		return cantidad;
	}




	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
