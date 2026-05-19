public class Ascensor {
    private int piso;
    private String direccion;
    private PuertaAscensor puerta;
    private int[] destinos;
    private int totalDestinos;
    
    public Ascensor(int inicio) {
        this.piso = inicio;
        this.direccion = "quieto";
        this.puerta = new PuertaAscensor();
        this.destinos = new int[10];
        this.totalDestinos = 0;
    }
    
    public void mover() {
        if (direccion.equals("subiendo")) {
            piso++;
            System.out.println("Ascensor subiendo... Piso " + piso);
        } else if (direccion.equals("bajando")) {
            piso--;
            System.out.println("Ascensor bajando... Piso " + piso);
        }
    }
    
    public void abrirPuerta() {
        puerta.abrir();
    }
    
    public void cerrarPuerta() {
        puerta.cerrar();
    }
    
    public void agregarDestino(int pisoDestino) {
        if (totalDestinos < 10) {
            destinos[totalDestinos] = pisoDestino;
            totalDestinos++;
            System.out.println("Destino agregado: Piso " + pisoDestino);
        }
    }
    
    public boolean tieneDestinos() {
        return totalDestinos > 0;
    }
    
    public int getPiso() {
        return piso;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public PuertaAscensor getPuerta() {
        return puerta;
    }
}
