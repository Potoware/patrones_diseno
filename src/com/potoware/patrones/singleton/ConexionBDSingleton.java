package com.potoware.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton() {
        System.out.println("Conectandose al motor de base de datos");
    }

    public static ConexionBDSingleton getInstance(){
        if (instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
