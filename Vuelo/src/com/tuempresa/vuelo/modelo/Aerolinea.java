package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinea extends Identificable{
	
	@Column(length = 32)
	String nombre;
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "pais")
	ListaPaises listaPaises;

}
