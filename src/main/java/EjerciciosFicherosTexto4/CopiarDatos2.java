package EjerciciosFicherosTexto4;

import java.io.*;

public class CopiarDatos2 {
    public static void main(String[] args) {
        //4. Modificar el ejercicio anterior para que solo se copien las líneas que contienen texto, omitiendo las líneas vacías.
        final String rutaDatos = "src/main/java/datos.txt";
        final String rutaCopia = "src/main/java/copia.txt";

        try(BufferedReader br = (new BufferedReader(new FileReader(rutaDatos)));
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaCopia))){
            String line;
            while ((line = br.readLine()) != null){
                if (!line.isEmpty()){
                    System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                }
                else{
                    System.out.println("LINEA VACÍA");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
