package co.edu.uniquindio.poo;


public class AppTest 
{

    

    public static void main(String[] args) {
        // Crear una instancia de la clase Biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central", "Calle Principal 123", 10000, "15 de agosto de 1990");

        Biblioteca bibliotecaBrayan = new Biblioteca("Brayitan", "La ofi", 10000 , "Ayer");

        miBiblioteca.mostrarInformacion();
        System.out.println("----------");
        bibliotecaBrayan.setFechaCreacion("Ahorita");
        bibliotecaBrayan.mostrarInformacion();
        System.out.println("----------");
        String nombreMasLibros=hallarMasLibros(miBiblioteca, bibliotecaBrayan);
        System.out.println(nombreMasLibros);
        
    }


    public static String hallarMasLibros(Biblioteca biblioteca1,Biblioteca biblioteca2){

        String nombreMasLibros="";

        if(biblioteca1.getCantidadLibros()>biblioteca2.getCantidadLibros()){
            nombreMasLibros=biblioteca1.getNombre();
        }

        else{
            if(biblioteca1.getCantidadLibros()<biblioteca2.getCantidadLibros()){
                nombreMasLibros=biblioteca2.getNombre();
            }
            else{
                nombreMasLibros="Son iguales";
            }

            return nombreMasLibros;
        }
        return nombreMasLibros;

        
    }

    
  
    
    
}
