package EjerciciosFicherosTexto3;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) throws IOException {
        //Crear un fichero llamado config.txt dentro del directorio copias. Si el fichero ya existe, indicarlo por pantalla.
        String ruta = "C:/Users/mikik/IdeaProjects/AD_ficheros/src/main/java/EjerciciosFicherosTexto3/copias/config.txt";
        File config = new File(ruta);
        if(config.createNewFile()){
            System.out.println("Fichero creado correctamente");
        }
        else{
            System.out.println("El fichero ya existe");
        }

    }
}
