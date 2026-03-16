package momento1;

public class Main1 {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("1001221", "Daniel", 100000);

        cuenta1.consultarSaldo();

        cuenta1.depositar(1000);

        cuenta1.consultarSaldo();

        cuenta1.retirar(900);

        cuenta1.consultarSaldo();
    }
}
