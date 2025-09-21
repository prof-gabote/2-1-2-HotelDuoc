/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

/**
 *
 * @author Gabote
 */
public class Hotel {

    private String idHotel;
    private String nombre;
    //Lista de habitaciones

    public Hotel(String idHotel, String nombre) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        //Inicializar lista de habitaciones
    }

    public String getIdHotel() {
        return idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    //Getter de habitaciones
    
    public void agregarHabitacion(Habitacion habitacion) {
        //Agregar habitación
    }

    public void listarHabitacionesDisponibles() {
        System.out.println("Habitaciones disponibles en " + nombre + ":");

        //Imprimir si están disponibles
        //System.out.println("Número: " + h.getNumeroHabitacion()
        //        + " - Precio: " + h.getPrecioNoche());
    }

    public Habitacion buscarHabitacion(String numero) {
        //Buscar y devolver habitación
        return null;
    }

}
