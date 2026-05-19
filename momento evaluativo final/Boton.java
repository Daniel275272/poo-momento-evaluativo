public class Boton {
    private boolean iluminado;
    private boolean sonido;
    
    public Boton() {
        this.iluminado = false;
        this.sonido = true;
    }
    
    public void presionar() {
        iluminar();
        emitirSonido();
        System.out.println("Botón presionado");
    }
    
    public void iluminar() {
        this.iluminado = true;
        System.out.println("Botón iluminado");
    }
    
    public void apagarLuz() {
        this.iluminado = false;
        System.out.println("Luz del botón apagada");
    }
    
    public void emitirSonido() {
        if (sonido) {
            System.out.println("Beep");
        }
    }
    
    public boolean isIluminado() {
        return iluminado;
    }
}
