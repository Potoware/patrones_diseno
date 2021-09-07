package com.potoware.patrones.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
protected String nombre;
protected String masa;
protected String salsa;
protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("agregando la masa = " + masa);
        System.out.println("agregando la salsa = " + salsa);
        System.out.println("agregando los ingredientes");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();

    abstract public void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la piza en una caja");
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
}
