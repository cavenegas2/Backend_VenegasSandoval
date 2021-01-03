package com.asistencias.backend.models.entities;

import java.io.Serializable;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Table(name="Usuarios")
@Entity
public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	//Anotaciones
	@Id
	@Column(name = "id_usu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idUsu;
	@Column(name = "usuario", length=50)
	private String usuario;
	@Column(name = "contrasena", length=50)
	private String contrasena;
	
	

	//Constructor
	public Usuario() {
		super();
	}

	public Usuario(Long idUsu) {
		super();
		this.idUsu = idUsu;
	}

	//Get y Set
	public Long getIdUsu() {
		return idUsu;
	}
	public void setIdUsu(Long idUsu) {
		this.idUsu = idUsu;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	

}
