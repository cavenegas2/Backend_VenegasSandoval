package com.asistencias.backend.controllers.dao;

import org.springframework.data.repository.CrudRepository;

import com.asistencias.backend.models.entities.Empleado;

public interface IEmpleado extends CrudRepository<Empleado,Long> {

}
