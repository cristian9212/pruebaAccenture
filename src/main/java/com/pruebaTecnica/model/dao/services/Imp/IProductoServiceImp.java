package com.pruebaTecnica.model.dao.services.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaTecnica.model.dao.IProductoDao;
import com.pruebaTecnica.model.dao.IUsuarioDao;
import com.pruebaTecnica.model.dao.services.IProductoService;
import com.pruebaTecnica.model.entity.Producto;

@Service
public class IProductoServiceImp implements IProductoService {
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	public void cancelarPedido(int id) {
		productoDao.deleteById(id);
		
	}

	@Override
	public Producto editarProducto(Producto producto) {
		return productoDao.save(producto);
	}

}
