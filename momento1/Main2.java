package momento1;

public class Main2 {
    public static void main(String[] args){

        Libro libro1 = new Libro("La bruja verde", "Arin Murphy-Hiscock", "11111", 256);
        Libro libro2 = new Libro("Rojo, blanco y sangre azul", "Casey McQuiston", "22222", 432);

        libro1.prestar();
        libro2.prestar();

        libro1.devolver();

        System.out.println("Disponible libro1: " + libro1.estaDisponible());
        System.out.println("Disponible libro2: " + libro2.estaDisponible());
    }
}
