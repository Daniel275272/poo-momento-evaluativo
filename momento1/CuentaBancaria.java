package momento1;

public class CuentaBancaria {
    String numeroDeCuenta;
    double saldo;
    String titular;

    public CuentaBancaria(String numeroDeCuenta, String titular, double saldoInicial) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Depósito realizado: " + cantidad);
    }
    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    System.out.println("Retiro realizado: " + cantidad);

    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
