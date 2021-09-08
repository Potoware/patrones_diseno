package com.potoware.patrones.observer.ejemplos;

import com.potoware.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repositorio= new UsuarioRepositorio();

        repositorio.addObserver((o,obj)-> System.out.println("enviando un email al usuario "+obj));
        repositorio.addObserver((o,obj)-> System.out.println("enviando un email al administrador "+obj));
        repositorio.addObserver((o,obj)-> System.out.println("Guardando info del usuario "+obj));

        repositorio.crearUsuario("Alejo");
    }
}
