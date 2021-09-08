package com.potoware.patrones.observer.ejemplos;

import com.potoware.patrones.observer.Corporacion;

import java.util.Collection;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google",1000);
        google.addObserver((observable,obj)-> {
            System.out.println("Jhon Due" + ((Corporacion)observable).getNombre()+
                " nuevo precio $"+((Corporacion) observable).getPrecio());
        });

        google.addObserver((observable,obj)-> {
            System.out.println("Potoware S.A.S" + ((Corporacion)observable).getNombre()+
                    " nuevo precio $"+((Corporacion) observable).getPrecio());
        });

        google.addObserver((observable,obj)-> {
            System.out.println("Juliana Riscanevo" + ((Corporacion)observable).getNombre()+
                    " nuevo precio $"+((Corporacion) observable).getPrecio());
        });

        google.modificarPrecio(2000);
    }


}
