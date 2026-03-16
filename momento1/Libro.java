package momento1;

public class Libro {
    String titulo;
    String autor;
    String ISBN;
    int numeroPaginas;
    boolean disponible;

    public Libro(String titulo, String autor, String ISBN, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true;
    }

    public void prestar(){
         disponible = false;
    }

    public void devolver(){
        disponible = true;
        System.out.println("Libro devuelto");
    }

    public boolean estaDisponible(){
        return disponible;
    }
}
