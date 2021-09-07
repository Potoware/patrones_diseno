package com.potoware.patrones;

import com.potoware.patrones.decorator.IFormateable;
import com.potoware.patrones.decorator.Texto;
import com.potoware.patrones.decorator.decorador.MayusculasDecorador;
import com.potoware.patrones.decorator.decorador.ReemplazarEspacioDecorador;
import com.potoware.patrones.decorator.decorador.ReversaDecorador;
import com.potoware.patrones.decorator.decorador.SubrayadoDecorador;

import java.util.Formattable;

public class EjemploDecorador {
    public static void main(String[] args) {
        IFormateable texto = new Texto("Hola que tal Alejo");

        MayusculasDecorador mayuscula = new MayusculasDecorador(texto);
        ReemplazarEspacioDecorador espacio = new ReemplazarEspacioDecorador(mayuscula);
        ReversaDecorador reversa = new ReversaDecorador(espacio);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);

        System.out.println(espacio.darFormato());
    }
}
