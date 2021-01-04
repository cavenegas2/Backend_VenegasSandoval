package com.asistencias.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.asistencias.backend.models.entities.Empleado;

//DAO sin error.

public interface IEmpleado extends CrudRepository<Empleado,Long> {

}
