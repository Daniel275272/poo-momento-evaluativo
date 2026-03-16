package momento1;

public class Main4 {
    public static void main(String[] args){

        Perfume perfume1 = new Perfume("Light Blue","Dolce & Gabbana",100,350000);
        Perfume perfume2 = new Perfume("Sauvage","Dior",80,420000);

        perfume1.consultarCantidadRestante();

        perfume1.aplicarPerfume(10);

        perfume1.consultarCantidadRestante();

        perfume1.ajustarPrecio(330000);

        perfume2.aplicarPerfume(20);

        perfume2.consultarCantidadRestante();
    }
}
