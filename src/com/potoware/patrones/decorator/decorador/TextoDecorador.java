package com.potoware.patrones.decorator.decorador;

import com.potoware.patrones.decorator.IFormateable;

public abstract class TextoDecorador implements IFormateable {
    protected IFormateable texto;

    public TextoDecorador(IFormateable texto) {
        this.texto = texto;
    }
}
