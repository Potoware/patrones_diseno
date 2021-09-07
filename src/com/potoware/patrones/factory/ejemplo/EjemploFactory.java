package com.potoware.patrones.factory.ejemplo;

import com.potoware.patrones.factory.PizzaProducto;
import com.potoware.patrones.factory.PizzeriaCaliforniaFactory;
import com.potoware.patrones.factory.PizzeriaNewYorkFactory;
import com.potoware.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("Hawaiana");
        System.out.println("Potoware ordena la pizza  " + pizza.getNombre());

        pizza = ny.ordenarPizza("Italiana");
        System.out.println("Juliana ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("Vegetariana");
        System.out.println("Papá ordena la pizza" + pizza.getNombre());

        pizza = california.ordenarPizza("Queso");
        System.out.println("Mamá ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
