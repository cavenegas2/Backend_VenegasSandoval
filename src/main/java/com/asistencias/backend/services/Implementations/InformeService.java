package com.asistencias.backend.services.Implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asistencias.backend.models.dao.IInforme;
import com.asistencias.backend.models.entities.Informe;
import com.asistencias.backend.services.interfaces.IInformeService;

@Service
public class InformeService implements IInformeService {
	
	private IInforme dao;

	@Override
	public void save(Informe informe) {

		try {
			
			dao.save(informe);

		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public Informe findById(Long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {

		try {
			
			dao.deleteById(id);

		} catch (Exception e) {
			
			throw e;

		}
		
	}

	@Override
	public List<Informe> findAll() {

		return (List<Informe>) dao.findAll();
	}

}
