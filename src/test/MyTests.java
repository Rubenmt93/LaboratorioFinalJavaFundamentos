package test;

import dominio.peliculas.datos.AccesoDatosImpl;
import dominio.peliculas.domain.Pelicula;
import dominio.peliculas.exepciones.AccesoDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyTests {

    public static void main(String[] args) {
//        testPelicula();
//     testAccesoDatos();
    }

    public static void testPelicula() {
        Pelicula peli1 = new Pelicula();
        peli1.setNombre("Avatar");
        System.out.println("peli1 = " + peli1);
    }
    
//    public static void testAccesoDatos(){
//        var nombreArchivo= "C:\\Users\\ruben\\Desktop\\prueba.txt";
//        try {
//            AccesoDatosImpl.crear(nombreArchivo);
//        } catch (AccesoDatosEx ex) {
//            Logger.getLogger(MyTests.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        AccesoDatosImpl.borrar(nombreArchivo);
//    }

}
