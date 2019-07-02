
package manejoarchivos;

import Utilidades.Archivos;

/**
 *
 * @author labctr
 */
public class ManejoArchivos {
private static final String NOMBRE_ARCHIVO="C:\\Users\\labctr\\Documents\\prueba-java\\nuevoarchivo.txt";
    public static void main(String[] args) {
        Archivos.crearArchivo(NOMBRE_ARCHIVO);
        Archivos.escribirArchivo(NOMBRE_ARCHIVO);
        Archivos.leerArchivo(NOMBRE_ARCHIVO);
        Archivos.agregarContenidoArchivo(NOMBRE_ARCHIVO);
        Archivos.leerArchivo(NOMBRE_ARCHIVO);
    }
    
}
