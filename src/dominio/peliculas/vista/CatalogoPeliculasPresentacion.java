package dominio.peliculas.vista;

import dominio.peliculas.servicio.CatalogoPeliculasImpl;
import dominio.peliculas.servicio.ICatalogoPeliculas;
import java.util.Scanner;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo de peliculas \n"
                    + "2. Agregar pelicula \n"
                    + "3. Listar peliculas \n"
                    + "4. Buscar pelicula \n"
                    + "0. Salir \n");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:                    
                    System.out.println("Introduzca el titulo de la pelicula: ");
                    String newPelicula =  scanner.nextLine();
                    catalogo.agregarPelicula(newPelicula);
                    break;
                case 3: 
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduzca el titulo que desea buscar: ");
                    String busqueda=  scanner.nextLine();
                    catalogo.buscarPeliculas(busqueda);
                    break;
          
                    
                    
            }         

        }
    }
    
    public static void agregarPelicula(){
            
         
         
        
    }
}
