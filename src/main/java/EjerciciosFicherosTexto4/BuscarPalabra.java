package EjerciciosFicherosTexto4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BuscarPalabra {
    public static void main(String[] args) {
        //2. Desarrollar un programa que solicite una palabra por teclado y muestre cuántas líneas del fichero datos.txt
        //contienen dicha palabra. No es necesario distinguir entre mayúsculas y minúsculas.
        String ruta = "src/main/java/datos.txt";
        File datos = new File(ruta);
        int contadorLineas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra que desea buscar: ");
        String palabra = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(datos))){
            String linea = "";
            while((linea = br.readLine()) != null){
                if (linea.toLowerCase().contains(palabra.toLowerCase())){
                    contadorLineas++;
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println("El fichero " + datos.getName() + " contiene la palabra " + palabra + " en " + contadorLineas + " líneas." );


    }
}
