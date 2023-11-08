package com.api.rest.corra.service;

import java.util.List;

import com.api.rest.corra.entity.Producto;

public interface IProductoService {

	public List<Producto> obtenerTodos();
	public Producto obtenerxId(Integer id);
	public Producto crear(Producto prod);
	public Producto actualizar(Producto prodModificado);
	public void borrar(Integer id);
}
