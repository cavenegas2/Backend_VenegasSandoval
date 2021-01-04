package com.asistencias.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.asistencias.backend.models.entities.Departamento;

public interface IDepartamento extends CrudRepository<Departamento,Long> {

}
