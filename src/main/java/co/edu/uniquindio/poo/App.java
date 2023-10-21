package co.edu.uniquindio.poo;

import java.util.HashSet;
import java.util.Set;

class Biblioteca {
     String nombre;
     String direccion;
     int cantidadLibros;
     String fechaCreacion;
     private Set<String> nombresLibros;

    public Biblioteca(String nombre, String direccion, int cantidadLibros, String fechaCreacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadLibros = cantidadLibros;
        this.fechaCreacion = fechaCreacion;
        nombresLibros = new HashSet<>();
    }

    // Getters y setters para acceder a los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de libros: " + cantidadLibros);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println(agregarLibro(libroA));
        System.out.println(agregarLibro(libroB));
        System.out.println(nombresLibros);
    }

    public boolean agregarLibro(LibroImpreso libro) {
        if (!nombresLibros.contains(libro.getNombreLibro())) {
            nombresLibros.add(libro.getNombreLibro());
            System.out.println("El libro ha sido agregado exitosamente.");
            return true;
        } else {
            System.out.println("Ya existe un libro con el mismo nombre en la biblioteca.");
            return false;
        }
    }
    LibroImpreso libroA = new LibroImpreso("La divina comedia","1472","Dante Aleghieri","Grupo Planeta");
    LibroImpreso libroB = new LibroImpreso("El Resplandor","1977","Stephen King","Grupo Planeta");
        


}




