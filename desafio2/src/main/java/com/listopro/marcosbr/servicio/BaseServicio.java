package com.listopro.marcosbr.servicio;

import java.util.List;

import com.listopro.marcosbr.excepcion.EntidadDuplicadaExcepcion;
import com.listopro.marcosbr.util.RespuestaControlador;

public interface BaseServicio<Entidad, TipoLlave> {

    Entidad obtener(TipoLlave id);

    void grabarTodos(List<Entidad> list) throws EntidadDuplicadaExcepcion;

    List<Entidad> obtenerTodos();

    public RespuestaControlador crear(Entidad entidad) throws EntidadDuplicadaExcepcion;

    public RespuestaControlador actualizar(Entidad entidad) throws EntidadDuplicadaExcepcion;

    public RespuestaControlador eliminar(TipoLlave entidadId);

}
