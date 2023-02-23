package com.listopro.marcosbr.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import lombok.Data;

@Entity
@Table(name = "camion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
@Data
public class Camion extends EntidadPadre {

	@Column(name = "tipo", nullable = false, length = 100)
	private String tipo;

	@Column(name = "capacidad_toneladas", nullable = false)
	private float capacidadToneladas;

	@Column(name = "cantidad_ejes", nullable = false)
	private int cantidadEjes;

	public Camion() {

	}

}
