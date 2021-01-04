package com.asistencias.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.asistencias.backend.models.entities.Departamento;
import com.asistencias.backend.services.interfaces.IDepartamentoService;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService service;
	
	@GetMapping("/{id}")
	public Departamento retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Departamento> list(){
		return service.findAll();
	}
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Departamento create(@RequestBody Departamento departamento) {		
		service.save(departamento);
		return departamento;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Departamento update(@RequestBody Departamento departamento, @PathVariable Long id) {		 			
		service.save(departamento);
		return departamento;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
