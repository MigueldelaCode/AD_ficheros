package EjerciciosBinarios;

import java.io.*;

public class Ej2 {
    public static void main(String[] args) {
        // Realiza un programa que escriba un nombre, una edad y una nota media en un fichero binario.
        // A continuación, lee los datos y los muestra por pantalla.
        String ruta = "src/main/java/EjerciciosBinarios/Ej2.dat";
        try(DataOutputStream escribirBin = new DataOutputStream(new FileOutputStream(ruta));
            DataInputStream leerBin = new DataInputStream(new FileInputStream(ruta))){
            String texto = "Miguel";
            int edad = 26;
            double notaMedia = 7.5;

            escribirBin.writeUTF(texto);
            escribirBin.writeInt(edad);
            escribirBin.writeDouble(notaMedia);

            String textoRecibido = leerBin.readUTF();
            int edadRecibida = leerBin.readInt();
            double notaMediaRecibida = leerBin.readDouble();

            System.out.println(textoRecibido);
            System.out.println(notaMediaRecibida);
            System.out.println(edadRecibida);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
