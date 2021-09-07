package com.potoware.patrones.factory;

import com.potoware.patrones.factory.producto.PizzaCaliforniaHawaiana;
import com.potoware.patrones.factory.producto.PizzaCaliforniaQueso;
import com.potoware.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return  switch (tipo){
            case "Hawaiana" -> new PizzaCaliforniaHawaiana();
            case "Queso" -> new PizzaCaliforniaQueso();
            case "Vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
