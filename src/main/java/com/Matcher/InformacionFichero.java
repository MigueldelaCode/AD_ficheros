package com.Matcher;

import java.io.File;

public class InformacionFichero {
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\datos.txt");
        System.out.println("Existe: " + fichero.exists());
        System.out.println("Es un fichero: " + fichero.isFile());
        System.out.println("Es un directorio: " + fichero.isDirectory());
        System.out.println("Tamaño: " + fichero.length());
        System.out.println("Última modificación: " + fichero.lastModified());
        System.out.println("Se puede leer: " + fichero.canRead());
        System.out.println("Puede modificar: " + fichero.canWrite());
        System.out.println("Se puede ejecutar: " + fichero.canExecute());
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Ruta relativa: " + fichero.getPath());
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
        System.out.println("Ruta directorio padre/null: " + fichero.getParent());
    }
}
