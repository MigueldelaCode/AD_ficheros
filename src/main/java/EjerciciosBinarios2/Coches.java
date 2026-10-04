package EjerciciosBinarios2;

import java.io.*;
import java.util.Scanner;

//2. Crea una aplicación en Java que almacene los datos básicos de
//varios vehículos: matricula (String), marca (String), tamaño de
//depósito (double) y modelo (String), sin crear ninguna clase, en un
//fichero binario. Cada vez que se ejecute la aplicación, se pedirá por
//teclado el número de vehículos a introducir y los datos de cada uno
//de ellos, sin borrar los anteriores. Una vez creado/modificado el
//fichero, mostrar por pantalla todos los datos de cada coche (cada
//uno en una línea)
public class Coches {
    public static void main(String[] args) {
        String ruta = "src/main/java/EjerciciosBinarios2/Coches.dat";
        Scanner sc = new Scanner(System.in);
        try(DataOutputStream escribirBin = new DataOutputStream(new FileOutputStream(ruta,true));
            DataInputStream leerBin = new DataInputStream(new FileInputStream(ruta))){
            String matricula;
            String marca;
            String modelo;
            double deposito;
            System.out.println("¿Qué número de vehículos desea introducir?");
            int num_vehiculos = sc.nextInt();

            for(int i = 0 ; i < num_vehiculos; i++){
                System.out.print("Introduzca la matrícula del vehículo: ");
                matricula = sc.next();
                escribirBin.writeUTF(matricula);
                System.out.print("Introduzca la marca del vehículo: ");
                marca = sc.next();
                escribirBin.writeUTF(marca);
                System.out.print("Introduzca el modelo del vehículo: ");
                modelo = sc.next();
                escribirBin.writeUTF(modelo);
                System.out.print("Introduzca la capacidad del depósito: ");
                deposito = sc.nextDouble();
                escribirBin.writeDouble(deposito);
            }
            int cont=0;

            while(true){
                cont++;
                System.out.println("\nCOCHE: " + cont );
                System.out.println("Matrícula: " + leerBin.readUTF());
                System.out.println("Marca: " + leerBin.readUTF());
                System.out.println("Modelo: " + leerBin.readUTF());
                System.out.println("Depósito: " + leerBin.readDouble());


            }


        }
        catch(IOException e){
            System.out.println("Sin introducir\n"+e);
        }
    }
}
