package com.listopro.marcosbr.repositorio;

import java.util.List;

import org.hibernate.Session;

public interface BaseRepositorio<Entidad, TipoLlave> {

	Entidad obtener(TipoLlave id);

	void crear(Entidad entidad);

	void actualizar(Entidad entidad);

	void grabarTodos(List<Entidad> list);

	Session getCurrentSession();

	List<Entidad> obtenerTodos();

}
