package EjerciciosFicherosTexto4;

import java.io.*;

public class CopiarDatos {
    public static void main(String[] args) {
        //3. Desarrollar un programa que copie el contenido del fichero datos.txt en un nuevo fichero llamado copia.txt.
        final String rutaDatos = "src/main/java/datos.txt";
        final String rutaCopia = "src/main/java/copia.txt";

        try(BufferedReader br = (new BufferedReader(new FileReader(rutaDatos)));
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaCopia))){//CON FILEWRITTER NO HACE FALTA CREATENEWFILE()
            String line;
            while ( (line = br.readLine()) != null){
                System.out.println(line);

                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
