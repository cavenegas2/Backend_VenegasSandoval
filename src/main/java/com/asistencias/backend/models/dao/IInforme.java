package com.asistencias.backend.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.asistencias.backend.models.entities.Informe;
public interface IInforme extends CrudRepository<Informe,Long> {

}
