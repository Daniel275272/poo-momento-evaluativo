public class BotonAscensor extends Boton {
    private int pisoDestino;
    
    public BotonAscensor(int pisoDestino) {
        super();
        this.pisoDestino = pisoDestino;
    }
    
    public int getPisoDestino() {
        return pisoDestino;
    }
    
    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Solicitando ir al piso " + pisoDestino);
    }
}
