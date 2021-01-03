package com.asistencias.backend.services.Implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asistencias.backend.controllers.dao.IInforme;
import com.asistencias.backend.models.entities.Informe;
import com.asistencias.backend.services.interfaces.IInformeService;

@Service
public class InformeService implements IInformeService {
	
	private IInforme dao;

	@Override
	public void save(Informe informe) {
		// TODO Auto-generated method stub
		try {
			dao.save(informe);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Informe findById(Long id) {
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
	public List<Informe> findAll() {
		// TODO Auto-generated method stub
		return (List<Informe>) dao.findAll();
	}

}
