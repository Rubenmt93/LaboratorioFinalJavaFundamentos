package dominio.peliculas.servicio;

import dominio.peliculas.datos.AccesoDatos;
import dominio.peliculas.datos.AccesoDatosImpl;
import dominio.peliculas.domain.Pelicula;
import dominio.peliculas.exepciones.AccesoDatosEx;
import dominio.peliculas.exepciones.LecturaDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            boolean anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso de datos");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPeliculas() {
        try {
            var Peliculas = this.datos.listar(NOMBRE_RECURSO);
            for(var pelicula:Peliculas){
                System.out.println("pelicula: " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error acceso datos");
            ex.printStackTrace(System.out);
        }
       
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try {
            resultado= this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado  );
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo");
            ex.printStackTrace(System.out);
        }
    }

}
