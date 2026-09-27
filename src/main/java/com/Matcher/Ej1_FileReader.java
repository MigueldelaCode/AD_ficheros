package com.Matcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej1_FileReader {
    public static void main(String[] args){
        String ruta = "C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\datos.txt";
        try(FileReader fr = new FileReader(ruta)){
            int caracter;
            while ((caracter = fr.read()) !=-1){
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
