package com.tuempresa.vuelo.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.tuempresa.vuelo.calculadores.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name = "Simple", members = "numero, costoBoleto; " +
                                 "persona")
public class Pasajero extends Identificable{
	
	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length = 4)
	int anyo;
	
	@DefaultValueCalculator(value = CalcuadorDenNumDeAsiento.class,
	properties = @PropertyValue(name = "anyo"))
	@Column(length = 6)
	int numero;
	
	@Column(length = 10)
	BigDecimal costoBoleto;
	
	@ManyToOne
	@ReferenceView("Corta")
	Persona persona;
	
}
