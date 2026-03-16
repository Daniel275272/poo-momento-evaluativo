package momento1;

public class ReservaHotel {
     String nombreCliente;
    String fechaEntrada;
    String fechaSalida;
    int numeroHabitacion;

    public ReservaHotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion){
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }

    public void nuevaReserva(){
        System.out.println("Reserva creada para: " + nombreCliente);
    }

    public void cancelarReserva(){
        System.out.println("Reserva cancelada para: " + nombreCliente);
    }

    public void consultarReserva(){
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Entrada: " + fechaEntrada);
        System.out.println("Salida: " + fechaSalida);
        System.out.println("Habitación: " + numeroHabitacion);
    }
}
