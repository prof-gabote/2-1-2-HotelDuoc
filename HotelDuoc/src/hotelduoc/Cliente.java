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
public class Cliente {
    private String idCliente;
    private String nombre;
    private ArrayList<Reserva> reservas;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("El cliente no tiene reservas.");
        } else {
            System.out.println("Reservas de " + nombre + ":");
            for (Reserva r : reservas) {
                System.out.println("Hotel: " + r.getHotel().getNombre() +
                                   " | Habitación: " + r.getHabitacion().getNumeroHabitacion() +
                                   " | Fecha: " + r.getFecha() +
                                   " | Noches: " + r.getNoches());
            }
        }
    }
}