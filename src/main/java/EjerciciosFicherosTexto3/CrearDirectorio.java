package EjerciciosFicherosTexto3;

import java.io.File;

public class CrearDirectorio {
    public static void main(String[] args) {
        //Crear un programa que cree un directorio llamado copias en la carpeta del proyecto.
        //Si el directorio ya existe, mostrar un mensaje informando de ello.
        String ruta = "C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\EjerciciosFicherosTexto3";

        File copia = new File(ruta + "\\copias");
        if(copia.exists()){
            System.out.println("El directorio ya existe");

        }
        else{
            copia.mkdir();
            if(copia.exists()){
                System.out.println("Directorio creado");
            }
            else{
                System.out.println("Fallo al crear compruebe rutas");
            }
        }

    }
}
