public class PuertaPiso extends Puerta {
    private int numeroPiso;
    
    public PuertaPiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }
    
    public int getNumeroPiso() {
        return numeroPiso;
    }
    
    @Override
    public void abrir() {
        super.abrir();
        System.out.println("Puerta del piso " + numeroPiso + " abierta");
    }
    
    @Override
    public void cerrar() {
        super.cerrar();
        System.out.println("Puerta del piso " + numeroPiso + " cerrada");
    }
}
