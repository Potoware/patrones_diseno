package com.potoware.patrones.factory.producto;

import com.potoware.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {
    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada Light";
        salsa = "Salsa BBQ Ligtht";
        ingredientes.add("Queso Mozarrella");
        ingredientes.add("Espinaca");
        ingredientes.add("Aceitunas");
        ingredientes.add("Cebolla");
        ingredientes.add("Tomate");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 80 min a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas redondas");
    }
}
