package com.potoware.patrones.factory.producto;

import com.potoware.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
    super();
    nombre = "Pizza Peperoni New York";
    masa = "Masa delgada a la piedra";
    salsa = "Salsa de tomate cherry";
        ingredientes.add("Tomate");
        ingredientes.add("Queso Mozarrela");
        ingredientes.add("Peperonni Extra");
        ingredientes.add("Jamon Serrrano");
        ingredientes.add("Maiz dulce");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 45 min a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas triangulares");
    }
}
