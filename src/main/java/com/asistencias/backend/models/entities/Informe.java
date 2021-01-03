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

@Table(name="Informes")
@Entity
public class Informe implements Serializable {


	


	private static final long serialVersionUID = 1L;
	
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
	
	
	public Informe() {
		super();
	}


	public Informe(Long idInf) {
		super();
		this.idInf = idInf;
	}


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
