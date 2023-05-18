
package dominio.peliculas.servicio;


public interface ICatalogoPeliculas {
    String NOMBRE_RECURSO = "C:\\Users\\ruben\\Desktop\\prueba.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarPeliculas(String buscar);
    void iniciarCatalogoPeliculas();
}
