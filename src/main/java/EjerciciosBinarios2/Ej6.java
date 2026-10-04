package EjerciciosBinarios2;

import java.io.*;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args)  {
        //Realizar un programa en java, que pregunte el número de personas
        //de los que se van a almacenar los datos, y cree un fichero binario
        //llamado “datospersonas.dat” que contendrá el nombre, apellidos,
        //edad, número de teléfono, dirección de email, ciudad de residencia,
        //nacionalidad y profesión de cada persona. Escribir por pantalla los
        //datos del fichero.
        Scanner sc = new Scanner(System.in);
        String ruta = "src/main/java/EjerciciosBinarios2/datosPersonas.dat";
        File datosPersonas = new File(ruta);

        int nPersonas;
        try(DataOutputStream escribirBin = new DataOutputStream(new FileOutputStream(datosPersonas));
            DataInputStream leerBin = new DataInputStream((new FileInputStream(datosPersonas)))){

            System.out.println("Introduzca el número de personas que desea guardar: ");
            nPersonas = sc.nextInt();

            for(int i = 0 ; i < nPersonas; i++){

                System.out.println("Introduzca el nombre: ");
                escribirBin.writeUTF("Nombre: "+sc.next());

                System.out.println("Introduzca los apellidos: ");
                escribirBin.writeUTF("Apellidos: "+sc.next());

                System.out.println("Introduzca la edad: ");
                escribirBin.writeUTF("Edad:"+sc.next());

                System.out.println("Introduzca el número de telefono");
                escribirBin.writeUTF("Número de teléfono: "+sc.next());

                System.out.println("Introduzca el email");
                escribirBin.writeUTF("Email: " + sc.next());

                System.out.println("Introduzca ciudad de residencia");
                escribirBin.writeUTF("Ciudad: "+sc.next());

                System.out.println("Introduzca la nacionalidad");
                escribirBin.writeUTF("Nacionalidad: "+sc.next());

                System.out.println("Introduzca la profesión");
                escribirBin.writeUTF("Profesión: "+sc.next());
            }
            int byt = 0;
            while (true) {
                System.out.println(leerBin.readUTF());

            }



        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
