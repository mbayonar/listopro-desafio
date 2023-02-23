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
public class Vehiculo extends EntidadPadre {

	@Column(name = "marca", nullable = false, length = 100)
	private String marca;

	@Column(name = "modelo", nullable = false, length = 100)
	private String modelo;

	@Column(name = "patente", nullable = false, length = 100)
	private String patente;

	@Column(name = "anio", nullable = false, length = 4)
	private String anio;

	@Column(name = "kilometraje", nullable = false)
	private float kilometraje;

	@Column(name = "cilindrada", nullable = false)
	private float cilindrada;

	public Vehiculo() {

	}

}
