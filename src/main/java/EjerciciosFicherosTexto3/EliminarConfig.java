package EjerciciosFicherosTexto3;

import java.io.File;

public class EliminarConfig {
    public static void main(String[] args) {
        //Modificar el programa anterior para eliminar el fichero config.txt.
        //Comprobar qué ocurre al intentar eliminar posteriormente el directorio copias.
        String copias = "src/main/java/EjerciciosFicherosTexto3/copias";
        File directorioCopias = new File(copias);
        File[] listaCopias = directorioCopias.listFiles();
        for(File fichero:listaCopias){
            if(fichero.getName().equals("config.txt")){
                System.out.println("Fichero borrado: " + fichero.delete());
            }
        }
        System.out.println("Directorio borrado: " + directorioCopias.delete());
    }
}
