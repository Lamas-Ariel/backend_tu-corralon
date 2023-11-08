package com.api.rest.corra.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.rest.corra.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Integer>{
	//crear metodos personalizados
	
}