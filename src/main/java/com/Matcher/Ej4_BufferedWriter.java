package com.Matcher;

import java.io.*;

public class Ej4_BufferedWriter {
    public static void main(String[] args) {
        final String ruta = "C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\datos.txt";
        final String rutaObjetiva = "C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\datos_copia.txt";
        try(BufferedReader br = (new BufferedReader(new FileReader(ruta)));
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaObjetiva))){
            String line;
            while ( (line = br.readLine()) != null){
                System.out.println(line);

                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
