/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

/**
 *
 * @author Gabote
 */
public class Cliente {

    private String idCliente;
    private String nombre;
    //Lista de reservas

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        //Inicializar lista de reservas
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    //Getter de reservas
    
    public void agregarReserva(Reserva reserva) {
        //Agregar reservas
    }

    public void listarReservas() {

        //Si hay reservas, imprimirlas
        //System.out.println("Hotel: " + r.getHotel().getNombre()
        //        + " | Habitación: " + r.getHabitacion().getNumeroHabitacion()
        //        + " | Fecha: " + r.getFecha()
        //        + " | Noches: " + r.getNoches());
    }

}
