public class Piso {
    private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;
    private PuertaPiso puerta;
    private boolean solicitud;
    
    public Piso(int numero) {
        this.numero = numero;
        this.botonSubir = new BotonPiso("subir");
        this.botonBajar = new BotonPiso("bajar");
        this.puerta = new PuertaPiso(numero);
        this.solicitud = false;
    }
    
    public void llamarAscensor(String direccion) {
        if (direccion.equals("subir")) {
            botonSubir.presionar();
        } else if (direccion.equals("bajar")) {
            botonBajar.presionar();
        }
        this.solicitud = true;
        System.out.println("Piso " + numero + " llamó ascensor para " + direccion);
    }
    
    public int getNumero() {
        return numero;
    }
    
    public boolean haySolicitud() {
        return solicitud;
    }
    
    public void limpiarSolicitud() {
        this.solicitud = false;
        System.out.println("Solicitud del piso " + numero + " atendida");
    }
    
    public PuertaPiso getPuerta() {
        return puerta;
    }
    
    public BotonPiso getBotonSubir() {
        return botonSubir;
    }
    
    public BotonPiso getBotonBajar() {
        return botonBajar;
    }
}
