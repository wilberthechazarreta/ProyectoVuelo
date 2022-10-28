package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class ListaPaises extends Identificable{
	
	@Column(length = 50)
	String pais;

}
