package com.potoware.patrones.composite.ejemplo;

import com.potoware.patrones.composite.Archivo;
import com.potoware.patrones.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {
        Directorio doc= new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("entrenamiento_java.pdf"));
        java.addComponente(new Archivo("Progreso.xlsx"));

        Directorio stream = new Directorio("APIStream");
        stream.addComponente(new Archivo("map.docx"));
        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv_apotosi.pdf"));
        doc.addComponente(new Archivo("foto_3x4.png"));

        System.out.println(doc.mostrar(0));
    }
}
