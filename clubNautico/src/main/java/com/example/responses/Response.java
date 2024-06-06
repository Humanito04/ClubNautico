package com.example.responses;

public class Response<T> {
    private String mensaje;
    private T datos;

    public Response(String mensaje, T datos) {
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }
}

