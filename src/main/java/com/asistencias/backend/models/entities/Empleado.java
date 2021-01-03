package com.asistencias.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="Empleados")
@Entity
public class Empleado implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Anotaciones
	@Id
	@Column(name = "id_empl")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idEmp;
	
	@Column(name = "nombres_completos", length=255)
	private String nombres;
	
	@Column(name = "CI", length=15)
	private String CI;
	
	@Column(name = "direccion", length=150)
	private String direccion;
	
	@Column(name = "fecha_nacimiento")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fechaNaci;
	
	@Column(name = "telefono", length=15)
	private String telefono;
	
	@Column(name = "correo", length=150)
	private String correro;
	
	@Column(name = "estado_civil", length=20)
	private String estadoCivil;

	//Constructor
	public Empleado() {
		super();
	}

	public Empleado(Long idEmp) {
		super();
		this.idEmp = idEmp;
	}

	//Get y Set
	public Long getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(Long idEmp) {
		this.idEmp = idEmp;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCI() {
		return CI;
	}

	public void setCI(String cI) {
		CI = cI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Calendar getFechaNaci() {
		return fechaNaci;
	}

	public void setFechaNaci(Calendar fechaNaci) {
		this.fechaNaci = fechaNaci;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorrero() {
		return correro;
	}

	public void setCorrero(String correro) {
		this.correro = correro;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	


}
