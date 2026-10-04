package EjerciciosBinarios2.EjAlumnos;

import java.io.*;
import java.util.Scanner;

//Desarrollar un programa que almacene en un fichero binario la información de cinco alumnos
// (nombre y nota media). Posteriormente, leer los datos y mostrarlos por pantalla en el mismo orden en que fueron almacenados.
public class guardarAlumnos {
    public static void main(String[] args) {
        String ruta = "src/main/java/EjerciciosBinarios2/EjAlumnos/guardarAlumnos.dat";
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(ruta));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            Alumno rober = new Alumno("Roberto",9.5);
            Alumno eli = new Alumno("Elizabeth",10);
            Alumno alumno3 = new Alumno("alumno3",0);
            Alumno alumno4 = new Alumno("alumno4",0);
            Alumno alumno5 = new Alumno("alumno5",1);
            oos.writeObject(rober);
            oos.writeObject(eli);
            oos.writeObject(alumno3);
            oos.writeObject(alumno4);
            oos.writeObject(alumno5);
            Alumno alumno;
            
            while (true) {
                alumno = (Alumno)ois.readObject();
                System.out.println("\n"+alumno.getNombre() + " \nNota media: " + alumno.getNotaMedia());
            }
        }
        catch (IOException  e){
            System.out.println(e+" ERROR/FIN FICHERO");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
