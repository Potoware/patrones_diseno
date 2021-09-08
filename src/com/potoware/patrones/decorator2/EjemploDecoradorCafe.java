package com.potoware.patrones.decorator2;

import com.potoware.patrones.decorator2.decorador.ConChocolateDecorador;
import com.potoware.patrones.decorator2.decorador.ConCremaDecorador;
import com.potoware.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

            Configurable cafe = new Cafe(15f,"Cafe Mocha");
            ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
            ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
            ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);
            System.out.println("El precio de Mocca es = " + conLeche.getPrecioBase());


        System.out.println("Ingredientes: " + conChocolate.getIngredientes());
    }
}
