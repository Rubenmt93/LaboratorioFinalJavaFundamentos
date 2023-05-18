package test;

import dominio.datos.AccesoDatos;
import dominio.peliculas.domain.Pelicula;

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
    
    public static void testAccesoDatos(){
        var nombreArchivo= "C:\\Users\\ruben\\Desktop\\prueba.txt";
        AccesoDatos.crear(nombreArchivo);
        AccesoDatos.borrar(nombreArchivo);
    }

}
