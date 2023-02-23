package com.listopro.marcosbr.entidad;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@MappedSuperclass
@JsonAutoDetect
@Data
public class EntidadPadre implements Serializable {

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnore
	@Column(nullable = false)
	private Boolean estado;

	@Transient
	private Object extraInfo;

	public EntidadPadre() {
    }
	
	public EntidadPadre(Long id) {
        this();
        this.id = id;
    }

	public boolean esNuevo() {
		return this.id == null;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final EntidadPadre other = (EntidadPadre) obj;
		return Objects.equals(this.id, other.id);
	}

}