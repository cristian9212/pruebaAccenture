package com.pruebaTecnica.apirest.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.model.dao.services.IProductoService;
import com.pruebaTecnica.model.dao.services.IUsuarioService;
import com.pruebaTecnica.model.entity.Producto;
import com.pruebaTecnica.model.entity.Usuario;

@RestController
@RequestMapping("/almacen")
public class AlmacenWS {
	
	@Autowired 
	private IUsuarioService usuarioService;
	
	 @Autowired 
	 private IProductoService productoService;
	
	
	@PostMapping("/Consultar")
	public Usuario  agregarproducto(@RequestBody Usuario producto) {
		return usuarioService.agregar(producto);
	}

	@PutMapping("/editar")
	public Producto editarProducto(@RequestBody Producto producto) {
		return productoService.editarProducto(producto);
		
	}
	@DeleteMapping("/Eliminar")
	public String eliminarPedido(@PathVariable int id) {
		 productoService.cancelarPedido(id);
		 return"se elimino";
	}
	
}
