package momento1;

public class Main3 {
    public static void main(String[]args){
		
		Producto objp1 = new Producto("tecaldo", 10012,10,230.0);
		System.out.println(objp1);

		objp1.AgregarStock(5);
		System.out.println(objp1);
		
		objp1.ReducirStock(8);
		System.out.println(objp1);

		double total = objp1.calcularValorInventario();
		System.out.println(total);

    }
}
