package EjerciciosBinarios2;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Ej1 {
    public static void main(String[] args)  {
        //Desarrollar un programa que escriba en un fichero binario los valores enteros del 1 al 50 utilizando un objeto
        // DataOutputStream. A continuación, leer el fichero con un objeto DataInputStream y
        // mostrar todos los valores por pantalla.
        String ruta = "src/main/java/EjerciciosBinarios2/Ej1.dat";
        try(DataOutputStream escribirFichero = new DataOutputStream(new FileOutputStream(ruta));
            DataInputStream leerFichero = new DataInputStream(new FileInputStream(ruta))){
            for(int i=1 ;i < 51;i++){
                escribirFichero.writeInt(i);
            }
            for(int i=0;i < 50;i++){
                System.out.println(leerFichero.readInt());
            }

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
