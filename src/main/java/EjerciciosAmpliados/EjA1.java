package EjerciciosAmpliados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjA1 {
    public static void main(String[] args) {
        //Ejercicio propuesto A.1: Crea un programa que pida frases al usuario y las guarde en un fichero de texto,
        //cada frase en una línea.
        Scanner sc = new Scanner(System.in);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/EjerciciosAmpliados/frasesUsuario.txt"))){
            System.out.println("Escriba primera frase: ");
            String texto = sc.nextLine()+"\n";
            System.out.println("Escriba segunda frase: ");
            texto = texto + sc.nextLine()+"\n";
            System.out.println("Escriba tercera frase: ");
            texto = texto + sc.nextLine()+"\n";
            bw.write(texto);

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
