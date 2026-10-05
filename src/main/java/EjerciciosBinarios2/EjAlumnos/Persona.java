package EjerciciosBinarios2.EjAlumnos;

public class Persona {
    static int cont = 0;
    int idPersona = 0;
    String nombre;
    String apellidos;
    int edad;
    String nTelefono;
    String correo;
    String localidad;
    String nacionalidad;
    String profesion;
    public Persona(String n ,String a,int e ,String nT ,String correo,String localidad,String nacionalidad,String profesion){
        cont++;
        this.idPersona = cont;
        this.nombre=n;
        this.apellidos=a;
        this.edad=e;
        this.nTelefono=nT;
        this.correo=correo;
        this.localidad=localidad;
        this.nacionalidad=nacionalidad;
        this.profesion=profesion;
    }
}
