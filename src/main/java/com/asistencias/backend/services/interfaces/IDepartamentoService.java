package com.asistencias.backend.services.interfaces;

import java.util.List;

import com.asistencias.backend.models.entities.Departamento;

public interface IDepartamentoService {
	
	public void save(Departamento departamento); 
	public Departamento findById(Long id); 
	public void delete(Long id);	
	public List<Departamento> findAll();

}
