package com.repositorio;

//interface de la variable llamada contenidos


import org.springframework.data.repository.CrudRepository;

import com.entities.Contenido;

public interface ContenidosRepository extends CrudRepository<Contenido, Long> {

}
