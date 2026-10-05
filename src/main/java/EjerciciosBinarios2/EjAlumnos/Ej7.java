package EjerciciosBinarios2.EjAlumnos;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Ej7 {
    public static void main(String[] args) {
        //7. Tomando como base el fichero “muchosdatos.dat” (creado como en
        //el ejercicio anterior y adjuntado en la práctica) hacer un programa
        //en Java que lea los datos de las personas y los copie en otros
        //ficheros distintos según se traten de menores de edad
        //        (“menores.dat”), adultos (“adultos.dat”) o mayores de 65 años
        //        (“mayores.dat”). Escribir en pantalla los 3 nuevos ficheros creados.
        String rutamuchosDat = "src/main/java/EjerciciosBinarios2/EjAlumnos/muchosdatos.bin";
        String rutaMenoresDat = "src/main/java/EjerciciosBinarios2/EjAlumnos/menores.dat";
        String rutaMayoresDat = "src/main/java/EjerciciosBinarios2/EjAlumnos/mayores.dat";
        String rutaAdultosDat = "src/main/java/EjerciciosBinarios2/EjAlumnos/adultos.dat";

        File muchosDat = new File(rutamuchosDat);
        File menores = new File(rutaMenoresDat);
        File mayores = new File(rutaMayoresDat);
        File adultos = new File(rutaAdultosDat);
        AbstractList<Persona> personas = new ArrayList<>();

        try (
             DataInputStream leerBin = new DataInputStream(new FileInputStream(muchosDat))){
            while(true){
                String nombre= leerBin.readUTF();
                String apellidos =leerBin.readUTF();
                int edad = leerBin.readInt();
                String nTelefono = leerBin.readUTF();
                String correo = leerBin.readUTF();
                String ciudad = leerBin.readUTF();
                String nacionalidad = leerBin.readUTF();
                String profesion = leerBin.readUTF();
                personas.add(new Persona(nombre,apellidos,edad,nTelefono,correo,ciudad,nacionalidad,profesion));
            }

        }catch(IOException e){
            System.out.println("muchosdatos.bin ha sido leido correctamente");
        }
        try(DataOutputStream escribirMayores = new DataOutputStream(new FileOutputStream(mayores));
            DataOutputStream escribirMenores = new DataOutputStream((new FileOutputStream(menores)));
            DataOutputStream escribirAdultos = new DataOutputStream((new FileOutputStream(adultos)))


        ){
            for(Persona persona: personas){
                if(persona.edad<18){
                    escribirMenores.writeInt(persona.idPersona);
                    escribirMenores.writeUTF(persona.nombre);
                    escribirMenores.writeUTF(persona.apellidos);
                    escribirMenores.writeInt(persona.edad);
                    escribirMenores.writeUTF(persona.nTelefono);
                    escribirMenores.writeUTF(persona.correo);
                    escribirMenores.writeUTF(persona.localidad);
                    escribirMenores.writeUTF(persona.nacionalidad);
                    escribirMenores.writeUTF(persona.profesion);
                } else if (persona.edad>65) {
                    escribirMayores.writeInt(persona.idPersona);
                    escribirMayores.writeUTF(persona.nombre);
                    escribirMayores.writeUTF(persona.apellidos);
                    escribirMayores.writeInt(persona.edad);
                    escribirMayores.writeUTF(persona.nTelefono);
                    escribirMayores.writeUTF(persona.correo);
                    escribirMayores.writeUTF(persona.localidad);
                    escribirMayores.writeUTF(persona.nacionalidad);
                    escribirMayores.writeUTF(persona.profesion);
                }
                else{
                    escribirAdultos.writeInt(persona.idPersona);
                    escribirAdultos.writeUTF(persona.nombre);
                    escribirAdultos.writeUTF(persona.apellidos);
                    escribirAdultos.writeInt(persona.edad);
                    escribirAdultos.writeUTF(persona.nTelefono);
                    escribirAdultos.writeUTF(persona.correo);
                    escribirAdultos.writeUTF(persona.localidad);
                    escribirAdultos.writeUTF(persona.nacionalidad);
                    escribirAdultos.writeUTF(persona.profesion);
                }
            }

        }
        catch(IOException e){
            System.out.println("Ficheros guardados");
        }
        try(DataInputStream leerMayores = new DataInputStream(new FileInputStream(mayores))){
            System.out.println("FICHERO MAYORES");
            while(true){
                System.out.println("ID: "+leerMayores.readInt());
                System.out.println("nombre: "+leerMayores.readUTF());
                System.out.println("apellidos: "+leerMayores.readUTF());
                System.out.println("Edad: "+leerMayores.readInt());
                System.out.println("Número de teléfono: "+leerMayores.readUTF());
                System.out.println("Correo: "+leerMayores.readUTF());
                System.out.println("Localidad: "+leerMayores.readUTF());
                System.out.println("Nacionalidad: "+leerMayores.readUTF());
                System.out.println("Profesión: "+ leerMayores.readUTF());
            }
        }catch (IOException e){
            System.out.println("Fichero mayores leido");
        }
        try(DataInputStream leerMenores = new DataInputStream(new FileInputStream(menores))){
            System.out.println("FICHERO MENORES");
            while(true){
                System.out.println("ID: "+leerMenores.readInt());
                System.out.println("nombre: "+leerMenores.readUTF());
                System.out.println("apellidos: "+leerMenores.readUTF());
                System.out.println("Edad: "+leerMenores.readInt());
                System.out.println("Número de teléfono: "+leerMenores.readUTF());
                System.out.println("Correo: "+leerMenores.readUTF());
                System.out.println("Localidad: "+leerMenores.readUTF());
                System.out.println("Nacionalidad: "+leerMenores.readUTF());
                System.out.println("Profesión: "+ leerMenores.readUTF());
            }
        }catch (IOException e){
            System.out.println("Fichero menores leido");
        }
        try(DataInputStream leerAdultos = new DataInputStream(new FileInputStream(adultos))){
            System.out.println("FICHERO ADULTOS");
            while(true){
                System.out.println("ID: "+leerAdultos.readInt());
                System.out.println("nombre: "+leerAdultos.readUTF());
                System.out.println("apellidos: "+leerAdultos.readUTF());
                System.out.println("Edad: "+leerAdultos.readInt());
                System.out.println("Número de teléfono: "+leerAdultos.readUTF());
                System.out.println("Correo: "+leerAdultos.readUTF());
                System.out.println("Localidad: "+leerAdultos.readUTF());
                System.out.println("Nacionalidad: "+leerAdultos.readUTF());
                System.out.println("Profesión: "+ leerAdultos.readUTF());
            }
        }catch (IOException e){
            System.out.println("Fichero adultos leido");
        }

    }
}
