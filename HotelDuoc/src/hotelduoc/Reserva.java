/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

import java.time.LocalDate;

/**
 *
 * @author Gabote
 */
public class Reserva {
    private Hotel hotel;
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fecha;
    private int noches;

    public Reserva(Hotel hotel, Habitacion habitacion, Cliente cliente, LocalDate fecha, int noches) {
        this.hotel = hotel;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fecha = fecha;
        this.noches = noches;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNoches() {
        return noches;
    }
}
