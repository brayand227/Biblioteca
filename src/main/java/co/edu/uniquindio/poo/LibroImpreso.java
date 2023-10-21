package co.edu.uniquindio.poo;

public class LibroImpreso extends Libro {

    private String nombre;
    private String fecha;
    private Autor autor;
    private Editorial editorial;

    public LibroImpreso(String nombre, String fecha, Autor autor, Editorial editorial){
        this.nombre = nombre;
        this.fecha = fecha;
        this.autor = autor;
        this.editorial = editorial;

    }

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
