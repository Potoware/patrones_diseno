package com.potoware.patrones.factory.producto;

import com.potoware.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre ="Pizza California Queso";
        masa = "Masa delgada con bordes de queso";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Queso extra mozarrella");
        ingredientes.add("Queso para gratinar");
        ingredientes.add("Queso paipa");
        ingredientes.add("Cebolla");
        ingredientes.add("Jamon");
        ingredientes.add("Quezo Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 10 min a 250°C");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas pequeñas");
    }
}
