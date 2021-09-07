package com.potoware.patrones.factory.producto;

import com.potoware.patrones.factory.PizzaProducto;

public class PizzaCaliforniaHawaiana extends PizzaProducto {
    public PizzaCaliforniaHawaiana() {
        super();
        nombre = "Pizza California Hawaiana";
        masa = "Masa Gruesa";
        salsa = "Salsa de Tomate";
        ingredientes.add("Jamon");
        ingredientes.add("Queso");
        ingredientes.add("Piña");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 55 min a 78°C");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas triangulares medianas");
    }
}
