package com.potoware.patrones.decorator;

public class Texto implements IFormateable{
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String darFormato() {
        return getTexto();
    }
}
