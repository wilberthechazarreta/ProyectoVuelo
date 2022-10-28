package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Pasajero extends Identificable{
	
	@Column(length = 32)
	int numasiento;
	
	@Column(length = 45)
	float costoboleto;
	
	@ManyToOne
	Persona persona;
	
}
