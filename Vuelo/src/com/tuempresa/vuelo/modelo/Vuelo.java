package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
public class Vuelo extends Identificable{
	

	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length = 4)
	int anyo;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList(descriptionProperties = "origen")
	CiudadOrigen ciudadOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY , optional = true)
	@DescriptionsList(descriptionProperties = "destino")
	CiudadDestino ciudadDestino;
	
	@ManyToOne
	@DescriptionsList
	Tripulacion tripulacion;
	
	@ManyToOne
	Pasajero pasajero;
}
