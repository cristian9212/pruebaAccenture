package com.pruebaTecnica.model.dao.services.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaTecnica.model.dao.IUsuarioDao;
import com.pruebaTecnica.model.dao.services.IUsuarioService;
import com.pruebaTecnica.model.entity.Usuario;

@Service
public class IUsuarioServiceImp implements IUsuarioService{
	
	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public Usuario agregar(Usuario producto) {
		return usuarioDao.save(producto);
	}

	
}
