package com.Matcher;

import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        File fichero2 = new File("fichero/fichero2.txt");
        System.out.println("Eliminado: " + fichero2.delete());
    }
}
