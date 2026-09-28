package EjerciciosAmpliados;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjA5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero");
        String nombre = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/EjerciciosAmpliados/"+nombre));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/EjerciciosAmpliados/copiaInversa.txt"))){
            int contador = 0;
            String linea = "";
            ArrayList<String> lineas = new ArrayList<>();
            while((linea= br.readLine())!=null){
                lineas.add(linea);
            }
            for(int i = lineas.size()-1;i >= 0; i--){
                bw.write(lineas.get(i)+"\n");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
