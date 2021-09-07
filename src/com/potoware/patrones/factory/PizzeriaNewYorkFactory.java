package com.potoware.patrones.factory;

import com.potoware.patrones.factory.producto.PizzaNewYorkItaliana;
import com.potoware.patrones.factory.producto.PizzaNewYorkPeperoni;
import com.potoware.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
       switch (tipo){
           case "vegetariana":
               producto = new PizzaNewYorkVegetariana();
               break;
           case "peperoni":
               producto = new PizzaNewYorkPeperoni();
               break;

           case "italiana":
               producto = new PizzaNewYorkItaliana();
               break;
       }

       return producto;
    }
}
