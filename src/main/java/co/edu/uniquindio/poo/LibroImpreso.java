package co.edu.uniquindio.poo;

public class LibroImpreso extends Libro {

    private String nombre;

    public LibroImpreso(String nombreLibro, String fechaCreacion, Autor autor, Editorial editorial, String nombre,
            String fecha, Autor autor2, Editorial editorial2) {
        super(nombreLibro, fechaCreacion, autor, editorial);
        this.nombre = nombre;
        this.fecha = fecha;
        autor = autor2;
        editorial = editorial2;
    }

    private String fecha;
    private Autor autor;
    private Editorial editorial;

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

}
