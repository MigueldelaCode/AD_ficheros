package com.Matcher;

import java.io.File;
import java.io.IOException;

public class CrearArchivos {
    public static void main(String[] args) throws IOException {
        File reference = new File("fichero");
        File fichero1 = new File(reference,"fichero1.txt");
        File fichero2 = new File(reference, "fichero2.txt");
        System.out.println("Directorio creado: " + reference.mkdir());
        System.out.println("Fichero1 creado: " + fichero1.createNewFile());
        System.out.println("Fichero2 creado: " + fichero2.createNewFile());
    }
}
