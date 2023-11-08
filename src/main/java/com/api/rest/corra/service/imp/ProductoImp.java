package com.api.rest.corra.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.corra.entity.Producto;
import com.api.rest.corra.models.dao.IProductoDao;
import com.api.rest.corra.service.IProductoService;

@Service
public class ProductoImp implements IProductoService{

	@Autowired
	private IProductoDao productoDao;
	
	
	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto obtenerxId(Integer id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto crear(Producto prod) {
		// TODO Auto-generated method stub
		return productoDao.save(prod);
	}

	@Override
	public Producto actualizar(Producto prodModificado) {
		// TODO Auto-generated method stub
		return productoDao.save(prodModificado);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		productoDao.deleteById(id);
	}

}
