package com.potoware.patrones.factory.producto;

import com.potoware.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Tomate");
        ingredientes.add("Queso Vegano");
        ingredientes.add("Berenjenas");
        ingredientes.add("Carne fake");
        ingredientes.add("Espinaca");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas cuadradas");
    }
}
