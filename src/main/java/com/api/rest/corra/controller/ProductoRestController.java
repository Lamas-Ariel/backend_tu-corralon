package com.api.rest.corra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.corra.entity.Producto;
import com.api.rest.corra.service.IProductoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> getTodos(){
		return productoService.obtenerTodos();
	}
	
	@GetMapping("/productos/{id}")
	public Producto buscarxId(@PathVariable Integer id){
		return productoService.obtenerxId(id);
	}
	
	@PostMapping("/productos")
	public Producto guardar(@RequestBody Producto producto) {
		return productoService.crear(producto);
	}
	// (/)productos
	@PutMapping("/productos/{id}")
	public Producto actualizar(@RequestBody Producto producto, @PathVariable Integer id) {
		Producto productoActual = productoService.obtenerxId(id);
		productoActual.setDescripcion(producto.getDescripcion());
		productoActual.setFecha_v(producto.getFecha_v());
		productoActual.setFoto(producto.getFoto());
		productoActual.setMarca(producto.getMarca());
		productoActual.setN_producto(producto.getN_producto());
		productoActual.setPrecio_producto(producto.getPrecio_producto());
		productoActual.setCategoria(producto.getCategoria());
		return productoService.actualizar(productoActual);
	}
	
	@DeleteMapping("/productos/{idprod}")
	public Producto eliminar(@PathVariable Integer idprod) {
		Producto productoActual = productoService.obtenerxId(idprod);
		if (productoActual != null) {
			productoService.borrar(idprod);
		}
		return productoActual;
	}
	
}
