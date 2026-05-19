public class BotonPiso extends Boton{
    private String direccion;
    
    public BotonPiso(String direccion) {
        super();
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Llamando ascensor para " + direccion);
    }
}

