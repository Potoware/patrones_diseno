package com.potoware.patrones.factory.producto;

import com.potoware.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();
        ingredientes.add("Tomate");
        ingredientes.add("Queso Mozarrela");
        ingredientes.add("Queso paipa");
        ingredientes.add("Jamon");
        ingredientes.add("Chorizo");
        ingredientes.add("Champinones");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 120 min a 50°C");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas grandes cuadradas");
    }
}
