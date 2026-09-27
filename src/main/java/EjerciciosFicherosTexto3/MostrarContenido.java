package EjerciciosFicherosTexto3;

import java.io.File;

public class MostrarContenido {
    public static void main(String[] args) {
        //MOSTRAR CONTENIDO DEL DIRECTORIO COPIAS INDICANDO SI SE TRATA DE UN FICHERO O UN DIRECTORIO
        String copias = "src/main/java/EjerciciosFicherosTexto3/copias";
        File directorioCopias = new File(copias);
        File[] listaCopias = directorioCopias.listFiles();
        for(File fichero:listaCopias){
            System.out.println(fichero.getName());
            if(fichero.isDirectory()){
                System.out.println("Es un directorio");
            }
            else if(fichero.isFile()){
                System.out.println("Es un fichero");
            }
            else{
                System.out.println("ERROR");
            }
        }

    }
}
