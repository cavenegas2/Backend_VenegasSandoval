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

import com.asistencias.backend.models.entities.Informe;
import com.asistencias.backend.services.interfaces.IInformeService;


@RestController
@RequestMapping("/api/informe")

public class InformeController {

	@Autowired
	private IInformeService service;
	
	@GetMapping("/{id}")
	public Informe retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Informe> list(){
		return service.findAll();
	}
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Informe create(@RequestBody Informe informe) {		
		service.save(informe);
		return informe;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Informe update(@RequestBody Informe informe, @PathVariable Long id) {		 			
		service.save(informe);
		return informe;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

	
}
