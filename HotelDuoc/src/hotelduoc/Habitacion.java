/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

/**
 *
 * @author Gabote
 */
public class Habitacion {
    private String numeroHabitacion;
    private double precioNoche;
    private boolean disponible;

    public Habitacion(String numeroHabitacion, double precioNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = true;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
