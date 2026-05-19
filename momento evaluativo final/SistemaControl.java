public class SistemaControl {
    private Ascensor ascensor;
    private Piso[] pisos;
    private int totalPisos;
    private Alerta[] alertas;
    private int totalAlertas;
    
    public SistemaControl(int totalPisos) {
        this.totalPisos = totalPisos;
        this.ascensor = new Ascensor(1);
        this.pisos = new Piso[totalPisos];
        this.alertas = new Alerta[10];
        this.totalAlertas = 0;
        
        for (int i = 0; i < totalPisos; i++) {
            pisos[i] = new Piso(i + 1);
        }
        System.out.println("Sistema iniciado con " + totalPisos + " pisos");
    }
    
    public void agregarAlerta(String mensaje) {
        if (totalAlertas < 10) {
            alertas[totalAlertas] = new Alerta(mensaje);
            totalAlertas++;
        }
    }
    
    public void mostrarAlertas() {
        for (int i = 0; i < totalAlertas; i++) {
            alertas[i].mostrar();
        }
    }
    
    public void atenderLlamado(int piso, String direccion) {
        if (piso >= 1 && piso <= totalPisos) {
            pisos[piso - 1].llamarAscensor(direccion);
        }
    }
    
    public void atenderDestino(int pisoDestino) {
        if (pisoDestino >= 1 && pisoDestino <= totalPisos) {
            ascensor.agregarDestino(pisoDestino);
        }
    }
    
    public void procesarSolicitudes() {
        for (int i = 0; i < totalPisos; i++) {
            if (pisos[i].haySolicitud()) {
                int pisoSolicitado = pisos[i].getNumero();
                System.out.println("Atendiendo solicitud en piso " + pisoSolicitado);
                
                if (pisoSolicitado > ascensor.getPiso()) {
                    ascensor.setDireccion("subiendo");
                } else if (pisoSolicitado < ascensor.getPiso()) {
                    ascensor.setDireccion("bajando");
                }
                
                while (ascensor.getPiso() != pisoSolicitado) {
                    ascensor.mover();
                }
                
                ascensor.abrirPuerta();
                pisos[i].getPuerta().abrir();
                pisos[i].limpiarSolicitud();
                
                ascensor.cerrarPuerta();
                pisos[i].getPuerta().cerrar();
                break;
            }
        }
        
        if (ascensor.tieneDestinos()) {
            System.out.println("Procesando destinos internos...");
        }
    }
    
    public void moverAscensor() {
        if (ascensor.tieneDestinos()) {
            ascensor.mover();
        }
    }
    
    public void detectarFallas() {
        for (int i = 0; i < totalPisos; i++) {
            if (!pisos[i].getBotonSubir().isIluminado() && 
                pisos[i].haySolicitud()) {
                agregarAlerta("Posible falla en boton subir del piso " + (i+1));
            }
            if (!pisos[i].getBotonBajar().isIluminado() && 
                pisos[i].haySolicitud()) {
                agregarAlerta("Posible falla en boton bajar del piso " + (i+1));
            }
        }
    }
    
    public void ejecutar() {
        System.out.println("=== Sistema de Control de Ascensor ===");
        System.out.println("Ascensor iniciando en piso " + ascensor.getPiso());
        
        atenderLlamado(3, "subir");
        procesarSolicitudes();
        
        atenderDestino(5);
        procesarSolicitudes();
        
        detectarFallas();
        mostrarAlertas();
        
        System.out.println("=== Fin de la simulacion ===");
    }
}
