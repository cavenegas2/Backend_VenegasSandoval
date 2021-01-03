package com.asistencias.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Departamentos")
@Entity
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_departamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idDep;
	
	@Column(name = "descripcion", length=255)
	private String descripcion;
	
	@Column(name = "jefe", length=20)
	private String jefe;

	public Departamento() {
		super();
	}

	public Departamento(Long idDep) {
		super();
		this.idDep = idDep;
	}

	public Long getIdDep() {
		return idDep;
	}

	public void setIdDep(Long idDep) {
		this.idDep = idDep;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}
	
	
	

}
