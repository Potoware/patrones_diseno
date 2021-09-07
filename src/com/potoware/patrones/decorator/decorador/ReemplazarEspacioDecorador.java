package com.potoware.patrones.decorator.decorador;

import com.potoware.patrones.decorator.IFormateable;

public class ReemplazarEspacioDecorador extends TextoDecorador{

    public ReemplazarEspacioDecorador(IFormateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
