package momento1;

public class Producto {
    private String nombre;
	private int codigo;
	private int cantidad;
	private double precio;
	
	public Producto(String nombre, int codigo, int cantidad, double precio){
		this.nombre =nombre;
		this.codigo = codigo;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	public void AgregarStock(int cantidad){
		this.cantidad += cantidad;
	}
    public void ReducirStock(int cantidad){
		 this.cantidad -= cantidad;
    }
	public double calcularValorInventario(){
		return cantidad*precio;
	}
	public String toString(){
        return "Producto[nombre: " + nombre + " código: " + codigo + " cantidad: " + cantidad + " precio: " + precio + "]";
    }

}
