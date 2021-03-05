package com.pruebaTecnica.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebaTecnica.model.entity.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Integer>{

}
