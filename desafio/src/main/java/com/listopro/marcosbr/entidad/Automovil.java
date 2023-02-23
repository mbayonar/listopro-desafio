package com.listopro.marcosbr.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import lombok.Data;

@Entity
@Table(name = "automovil")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
@Data
public class Automovil extends EntidadPadre {

	@Column(name = "numero_puertas", nullable = false)
	private int numeroPuertas;

	@Column(name = "cantidad_pasajeros", nullable = false)
	private int cantidadPasajeros;

	@Column(name = "capacidad_maletero", nullable = false)
	private float capacidadMaletero;

	public Automovil() {

	}

}
