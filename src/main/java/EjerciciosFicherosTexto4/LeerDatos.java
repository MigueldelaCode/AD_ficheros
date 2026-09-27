package EjerciciosFicherosTexto4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos {
    public static void main(String[] args) {
        //1. Desarrollar un programa que lea el fichero datos.txt y muestre por pantalla el número total de líneas que contiene.
        String ruta = "src/main/java/datos.txt";
        File datos = new File(ruta);
        int nLineas = 0;

        try(BufferedReader  br = new BufferedReader(new FileReader(datos))){
            while(br.readLine() != null){
                nLineas++;
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println("El fichero " + datos.getName() + " tiene: " + nLineas + " líneas." );
    }
}
