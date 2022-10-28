package com.tuempresa.vuelo.modelo;

import java.time.*;

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
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList(descriptionProperties = "origen")
	CiudadOrigen ciudOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY , optional = true)
	@DescriptionsList(descriptionProperties = "destino")
	CiudadDestino ciuDestino;
	
	@ManyToOne
	@DescriptionsList
	Tripulacion tripulacion;
}
