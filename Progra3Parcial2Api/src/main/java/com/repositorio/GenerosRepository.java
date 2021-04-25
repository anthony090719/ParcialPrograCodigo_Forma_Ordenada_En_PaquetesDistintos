package com.repositorio;

//interface de la variable llamada generos


import org.springframework.data.repository.CrudRepository;

import com.entities.Genero;


public interface GenerosRepository extends CrudRepository<Genero, Long> {

}
