package momento1;

public class Main5 {
    public static void main(String[] args){

        ReservaHotel reserva1 = new ReservaHotel("Daniel", "10/06/2026", "15/06/2026", 114);
        ReservaHotel reserva2 = new ReservaHotel("Juan", "12/06/2026", "18/06/2026", 116);

        reserva1.nuevaReserva();
        reserva1.consultarReserva();

        reserva2.nuevaReserva();
        reserva2.consultarReserva();

        reserva1.cancelarReserva();
    }
}
