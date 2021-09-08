package com.potoware.patrones.decorator2.decorador;

import com.potoware.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        float precioTest = cafe.getPrecioBase();
        return cafe.getPrecioBase()+2f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+"Leche";
    }
}
