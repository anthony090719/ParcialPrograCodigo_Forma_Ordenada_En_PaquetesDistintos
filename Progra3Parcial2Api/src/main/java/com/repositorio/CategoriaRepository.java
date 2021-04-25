package com.repositorio;

//interface de la variable llamada categoria

import org.springframework.data.repository.CrudRepository;

import com.entities.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}
