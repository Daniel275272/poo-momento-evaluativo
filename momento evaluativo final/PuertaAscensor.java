public class PuertaAscensor extends Puerta{
    private boolean mantener;
    
    public PuertaAscensor() {
        super();
        this.mantener = false;
    }
    
    public void mantenerAbierta() {
        this.mantener = true;
        System.out.println("Botón mantener presionado. Puerta se queda abierta");
    }
    
    @Override
    public void cerrar() {
        if (mantener) {
            System.out.println("No se puede cerrar. Botón mantener activado");
        } else {
            super.cerrar();
        }
    }
    
    public void desactivarMantener() {
        this.mantener = false;
        System.out.println("Botón mantener desactivado");
    }
}
