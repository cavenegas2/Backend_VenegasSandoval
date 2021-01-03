package com.asistencias.backend.services.Implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asistencias.backend.controllers.dao.IEmpleado;
import com.asistencias.backend.models.entities.Empleado;
import com.asistencias.backend.services.interfaces.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService {
	
	
	private IEmpleado dao;

	@Override
	public void save(Empleado empleado) {
		// TODO Auto-generated method stub
		try {
			dao.save(empleado);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Empleado findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>) dao.findAll();
	}

}
