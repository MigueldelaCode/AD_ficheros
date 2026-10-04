package EjerciciosBinarios2.EjAlumnos;

import java.io.Serializable;
//Desarrollar un programa que almacene en un fichero binario la información de cinco alumnos
// (nombre y nota media). Posteriormente, leer los datos y mostrarlos por pantalla en el mismo orden en que fueron almacenados.
public class Alumno implements Serializable {
    private String nombre;
    private double notaMedia;
    public Alumno(String nombre,double nota){
        this.nombre = nombre;
        this.notaMedia = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
