package com.nextu_curso_android.modelo;

public class Alarma {

    private  String fecha;
    private  String estado;

    public Alarma(String fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
