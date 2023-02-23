package com.listopro.marcosbr.enums;

public enum NombreEntidad {
    
    AUTOMOVIL("Automóvil"),
    CAMION("Camión"),
    VEHICULO("Vehículo");
    
    private String valor;

    private NombreEntidad(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
