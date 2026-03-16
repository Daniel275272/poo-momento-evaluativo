package momento1;

public class Perfume {
    String nombre;
    String marca;
    double capacidad;
    double precio;

    public Perfume(String nombre, String marca, double capacidad, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicarPerfume(double cantidad){
        capacidad = capacidad - cantidad;
    }

    public void consultarCantidadRestante(){
        System.out.println("Cantidad restante: " + capacidad + " ml");
    }

    public void ajustarPrecio(double nuevoPrecio){
        precio = nuevoPrecio;
        System.out.println("Nuevo precio: " + precio);
    }
}
