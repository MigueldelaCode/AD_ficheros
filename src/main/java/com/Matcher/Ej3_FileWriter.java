package com.Matcher;

import java.io.FileWriter;
import java.io.IOException;

public class Ej3_FileWriter {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\datos.txt";
        try(FileWriter fw = new FileWriter(ruta)){
            fw.write("Hola mundo 2");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
