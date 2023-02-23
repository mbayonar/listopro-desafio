package com.listopro.marcosbr.controlador;

import org.springframework.http.ResponseEntity;

import com.listopro.marcosbr.util.RespuestaControlador;

public interface BaseControlador<Entidad, TipoLlave> {

    public ResponseEntity<RespuestaControlador> crear(Entidad entidad);

    public ResponseEntity<RespuestaControlador> obtener(TipoLlave id);

    public ResponseEntity<RespuestaControlador> actualizar(Entidad entidad);

    public ResponseEntity<RespuestaControlador> eliminar(TipoLlave entidadId);

    public ResponseEntity<RespuestaControlador> obtenerTodos();

}
