package com.pruebaTecnica.model.dao.services;

import com.pruebaTecnica.model.entity.Producto;

public interface IProductoService {

	public void cancelarPedido(int id);
	
	public Producto editarProducto(Producto producto);

}
