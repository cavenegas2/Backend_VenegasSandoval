package com.asistencias.backend.services.interfaces;

import java.util.List;

import com.asistencias.backend.models.entities.Informe;

public interface IInformeService {
	
	public void save(Informe informe); 
	public Informe findById(Long id); 
	public void delete(Long id);	
	public List<Informe> findAll();

}
