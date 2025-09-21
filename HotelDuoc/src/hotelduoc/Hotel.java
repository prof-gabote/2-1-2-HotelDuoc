/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

import java.util.ArrayList;

/**
 *
 * @author Gabote
 */
public class Hotel {
    private String idHotel;
    private String nombre;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String idHotel, String nombre) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public String getIdHotel() {
        return idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void listarHabitacionesDisponibles() {
        System.out.println("Habitaciones disponibles en " + nombre + ":");
        for (Habitacion h : habitaciones) {
            if (h.isDisponible()) {
                System.out.println("Número: " + h.getNumeroHabitacion() +
                                   " - Precio: " + h.getPrecioNoche());
            }
        }
    }

    public Habitacion buscarHabitacion(String numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumeroHabitacion().equals(numero)) {
                return h;
            }
        }
        return null;
    }
}
