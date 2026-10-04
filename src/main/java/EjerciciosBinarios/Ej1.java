package EjerciciosBinarios;

import java.io.*;

public class Ej1 {
    public static void main(String[] args) {
        String ruta = "src/main/java/EjerciciosBinarios/Ej1.dat";
        try(FileOutputStream escribir = new FileOutputStream(ruta);
        FileInputStream leer = new FileInputStream(ruta)) {
            for (int i = 0; i < 100; i++) {
                escribir.write(i);
            }
            int dato;
            while((dato= leer.read()) != -1){
                System.out.println(dato);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
