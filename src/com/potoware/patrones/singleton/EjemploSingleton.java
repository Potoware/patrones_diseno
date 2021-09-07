package com.potoware.patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {

        for (int i = 0;i < 10;i++){
            ConexionBDSingleton con = ConexionBDSingleton.getInstance();
            System.out.println("con = " + con);
        }
        ConexionBDSingleton con2 = ConexionBDSingleton.getInstance();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstance();
        
        boolean b1 =(con2 == con3);
        System.out.println("b1 = " + b1);
    }
}
