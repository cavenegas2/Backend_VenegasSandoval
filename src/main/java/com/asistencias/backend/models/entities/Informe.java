package com.asistencias.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="Informes")
@Entity
public class Informe implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//Anotaciones
	@Id
	@Column(name = "id_departamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idInf;
	
	
	@Column(name = "fecha_entrada")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fechaEnt;
	
	
	@Column(name = "fecha_salida")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fechaSal;
	
	@JoinColumn(name="fk_empleado", referencedColumnName="id_empl")
	@ManyToOne
	private Empleado  empleado;
	
	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	//Constructor
	public Informe() {
		super();
	}


	public Informe(Long idInf) {
		super();
		this.idInf = idInf;
	}

	//Get y Set
	public Long getIdInf() {
		return idInf;
	}


	public void setIdInf(Long idInf) {
		this.idInf = idInf;
	}


	public Calendar getFechaEnt() {
		return fechaEnt;
	}


	public void setFechaEnt(Calendar fechaEnt) {
		this.fechaEnt = fechaEnt;
	}


	public Calendar getFechaSal() {
		return fechaSal;
	}


	public void setFechaSal(Calendar fechaSal) {
		this.fechaSal = fechaSal;
	}
	
	
	
	

}
