package com.asistencias.backend.services.interfaces;

import java.util.List;

import com.asistencias.backend.models.entities.Empleado;

public interface IEmpleadoService {

	public void save(Empleado empleado); 
	public Empleado findById(Long id); 
	public void delete(Long id);	
	public List<Empleado> findAll(); 
}
