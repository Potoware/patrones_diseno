package com.potoware.patrones.factory;

import com.potoware.patrones.factory.producto.PizzaNewYorkItaliana;
import com.potoware.patrones.factory.producto.PizzaNewYorkPeperoni;
import com.potoware.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "Vegetariana" -> new PizzaNewYorkVegetariana();
            case "Peperoni" -> new PizzaNewYorkPeperoni();
            case "Italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
