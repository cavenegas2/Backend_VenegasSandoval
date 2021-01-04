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

import com.asistencias.backend.models.entities.Empleado;
import com.asistencias.backend.services.interfaces.IEmpleadoService;

@RestController
@RequestMapping("/api/empleado")

public class EmpleadoController {

	@Autowired
	private IEmpleadoService service;
	
	@GetMapping("/{id}")
	public Empleado retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Empleado> list(){
		return service.findAll();
	}
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado create(@RequestBody Empleado empleado) {		
		service.save(empleado);
		return empleado;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado update(@RequestBody Empleado empleado, @PathVariable Long id) {		 			
		service.save(empleado);
		return empleado;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

	
}
