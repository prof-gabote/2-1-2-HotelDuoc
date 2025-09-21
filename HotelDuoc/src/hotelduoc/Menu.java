/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Gabote
 */
public class Menu {

    public static void registrarHotel(Scanner sc) {
        System.out.print("Ingrese ID del hotel: ");
        String id = sc.nextLine();
        System.out.print("Ingrese nombre del hotel: ");
        String nombre = sc.nextLine();
        //Agregar hotel
        System.out.println("Hotel registrado con éxito.");
    }

    public static void registrarCliente(Scanner sc) {
        System.out.print("Ingrese ID del cliente: ");
        String id = sc.nextLine();
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();
        //Agregar cliente
        System.out.println("Cliente registrado con éxito.");
    }

    public static void agregarHabitacion(Scanner sc) {
        System.out.print("Ingrese ID del hotel: ");
        String idHotel = sc.nextLine();
        Hotel hotel = null; //Buscar y devolver hotel

        if (hotel != null) {
            System.out.print("Ingrese número de habitación: ");
            String numero = sc.nextLine();
            System.out.print("Ingrese precio por noche: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            //Agregar hotel
            System.out.println("Habitación agregada con éxito.");
        } else {
            System.out.println("Hotel no encontrado.");
        }
    }

    public static void listarHoteles() {
        //Si hay hoteles,m listarlos
    }

    public static void listarHabitaciones(Scanner sc) {
        System.out.print("Ingrese ID del hotel: ");
        String idHotel = sc.nextLine();
        Hotel hotel = null; //Buscar y devolver hotel

        //Si hotel no es nulo, devolver habitaciones
    }

    public static void crearReserva(Scanner sc) {
        System.out.print("Ingrese ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = null; //Buscar y devolver cliente

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Ingrese ID del hotel: ");
        String idHotel = sc.nextLine();
        Hotel hotel = null; //Buscar y devolver hotel

        if (hotel == null) {
            System.out.println("Hotel no encontrado.");
            return;
        }

        System.out.print("Ingrese número de habitación: ");
        String numeroHabitacion = sc.nextLine();
        Habitacion habitacion = null; //Buscar y devolver habitación
        
        if (habitacion == null) {
            System.out.println("Habitación no encontrada.");
            return;
        }
        
        System.out.print("Ingrese fecha de la reserva (AAAA-MM-DD): ");
        String fechaStr = sc.nextLine();
        LocalDate fecha = LocalDate.parse(fechaStr);

        //Validar regla de negocio
        
        System.out.print("Ingrese cantidad de noches: ");
        int noches = sc.nextInt();
        sc.nextLine();

        Reserva reserva = new Reserva(hotel, habitacion, cliente, fecha, noches);
        
        //Agregar reserva en cliente
        
        habitacion.setDisponible(false);
        System.out.println("Reserva creada con éxito.");
    }

    public static void listarReservasCliente(Scanner sc) {
        System.out.print("Ingrese ID del cliente: ");
        String idCliente = sc.nextLine();
        
        Cliente cliente = null; //Buscar y devolver cliente

        if (cliente != null) {
            //listar reservas
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static Hotel buscarHotel(String id) {
        //Buscar y devolver hotel

        return null;
    }

    public static Cliente buscarCliente(String id) {
        //Buscar y devolver cliente

        return null;
    }

}
