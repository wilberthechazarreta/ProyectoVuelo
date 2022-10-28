package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
public class Direccion {
	
	@Id
	@Column(length = 32)
	String calle;
	
	@Column(length = 64)
	String colonia;
	
	@Column(length = 64)
	String municipio;
	
	@Column(length = 32)
	String estado;
	
	@Column(length = 32)
	String pais;
	
}
