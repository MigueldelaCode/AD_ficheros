package com.Matcher;

import java.io.File;

public class ListarDirectorio {
    public static void main(String[] args) {
        File directorio = new File(".");
        File[] elementos = directorio.listFiles();
        for(int i = 0; i < elementos.length;i++){

            System.out.println( elementos[i].getName()+ " es directorio: " + elementos[i].isDirectory());
            System.out.println( elementos[i].getName() +" es fichero: " + elementos[i].isFile());
        }
    }
}
