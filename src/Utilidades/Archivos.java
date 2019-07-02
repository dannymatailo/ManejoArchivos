/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.File;//creo archivo
import java.io.FileReader;
import java.io.FileWriter;//guardar archivo
import java.io.IOException;
import java.io.PrintWriter;//escribir archivo

/**
 *
 * @author labctr
 */
public class Archivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            
            String contenido="Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de la escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente en El archivo \n");
        }
        catch(IOException ex){
           ex.printStackTrace();
        }
    }
     public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            BufferedReader entrada =new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura=entrada.readLine();
            while(lectura!=null){
                System.out.println("Lectura: "+lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        }
        catch(IOException ex){
           ex.printStackTrace();
        }
    }
      public static void agregarContenidoArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
           PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            
            String contenido="Agregando contenido al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de agregar");
            salida.close();
            System.out.println("Se ha agregadon informacion en El archivo \n"); 
        }
        catch(IOException ex){
           ex.printStackTrace();
        }
    }
}
