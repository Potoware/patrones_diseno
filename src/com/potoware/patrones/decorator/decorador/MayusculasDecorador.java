package com.potoware.patrones.decorator.decorador;

import com.potoware.patrones.decorator.IFormateable;

public class MayusculasDecorador extends TextoDecorador{

    public MayusculasDecorador(IFormateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
