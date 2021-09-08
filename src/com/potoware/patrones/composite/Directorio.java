package com.potoware.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

    private List<Componente> hijos;
    public Directorio(String nombre) {
        super(nombre);
        hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente c){
        hijos.add(c);
        return this;
    }

    public void removeComponent(Componente c){
        hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        for(Componente c: hijos){
            sb.append(c.mostrar(nivel+1))
                    .append("\n");
        }
           return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
        /*for (Componente hijo:hijos) {
            if(hijo.buscar(nombre)){
                return true;
            }
        }*/
        return hijos.stream().anyMatch(h->h.buscar(nombre));
    }
}
