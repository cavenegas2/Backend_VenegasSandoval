package com.asistencias.backend.services.Implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asistencias.backend.controllers.dao.IDepartamento;
import com.asistencias.backend.models.entities.Departamento;
import com.asistencias.backend.services.interfaces.IDepartamentoService;

@Service
public class DepartamentoService implements IDepartamentoService {

	@Autowired
	private IDepartamento dao;
	
	@Override
	public void save(Departamento departamento) {
		// TODO Auto-generated method stub
		try {
			dao.save(departamento);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Departamento findById(Long id) {
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
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		 return (List<Departamento>) dao.findAll();
	}

}
