package com.tuempresa.vuelo.modelo;

import java.sql.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "anyo, hora; " +
                "ciudadOrigen, ciudadDestino; " +
		        "tripulacion, pasajero")
public class Vuelo extends Identificable{
	

	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length = 4)
	int anyo;
	
	@Required
	@Column(length = 5)
	Time hora;
	
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
	@ReferenceView("Simple")
	Pasajero pasajero;
}
