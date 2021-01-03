package com.asistencias.backend.controllers.dao;
import org.springframework.data.repository.CrudRepository;

import com.asistencias.backend.models.entities.Informe;
public interface IInforme extends CrudRepository<Informe,Long> {

}
