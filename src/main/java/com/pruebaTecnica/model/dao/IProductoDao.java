package com.pruebaTecnica.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.pruebaTecnica.model.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Integer>{

}
