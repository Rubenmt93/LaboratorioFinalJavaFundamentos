package dominio.datos;

import dominio.peliculas.domain.Pelicula;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class AccesoDatos {

    public static boolean existe(String nombreArchivo) {
        return false;
    }

    public static List<Pelicula> listar(String nombre) {

        return null;

    }

    public static void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    public static String buscar(String nombreArchivo, String buscar) {
        return "";
    }

    public static void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if(archivo.delete()){
            System.out.println("Archivo eliminado");
        }else{
            System.out.println("El archivo no se pudo borrar");
        }
        
    }
}
