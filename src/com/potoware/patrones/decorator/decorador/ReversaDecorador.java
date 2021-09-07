package com.potoware.patrones.decorator.decorador;

import com.potoware.patrones.decorator.IFormateable;

public class ReversaDecorador extends TextoDecorador{

    public ReversaDecorador(IFormateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
