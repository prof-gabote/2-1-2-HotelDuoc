/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelduoc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gabote
 */
public class Menu {

    private static final List<Hotel> hoteles = new ArrayList<>();
    private static final List<Cliente> clientes = new ArrayList<Cliente>();
    private static HashSet<String> reservasSet = new HashSet<>();
    private static Map<String, Reserva> reservasMap = new HashMap<>();

    public static void registrarHotel(Scanner sc) {
        System.out.print("Ingrese ID del hotel: ");
        String id = sc.nextLine();
        System.out.print("Ingrese nombre del hotel: ");
        String nombre = sc.nextLine();
        hoteles.add(new Hotel(id, nombre));
        System.out.println("Hotel registrado con éxito.");
    }

    public static void registrarCliente(Scanner sc) {
        System.out.print("Ingrese ID del cliente: ");
        String id = sc.nextLine();
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();
        clientes.add(new Cliente(id, nombre));
        System.out.println("Cliente registrado con éxito.");
    }

    public static void agregarHabitacion(Scanner sc) {
        System.out.print("Ingrese ID del hotel: ");
        String idHotel = sc.nextLine();
        Hotel hotel = buscarHotel(idHotel);

        if (hotel != null) {
            System.out.print("Ingrese número de habitación: ");
            String numero = sc.nextLine();
            System.out.print("Ingrese precio por noche: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            hotel.agregarHabitacion(new Habitacion(numero, precio));
            System.out.println("Habitación agregada con éxito.");
        } else {
            System.out.println("Hotel no encontrado.");
        }
    }

    public static void listarHoteles() {
        if (hoteles.isEmpty()) {
            System.out.println("No hay hoteles registrados.");
        } else {
            System.out.println("Lista de hoteles:");
            for (Hotel h : hoteles) {
                System.out.println("ID: " + h.getIdHotel() + " - Nombre: " + h.getNombre());
            }
        }
    }

    public static void listarHabitaciones(Scanner sc) {
        System.out.print("Ingrese ID del hotel: ");
        String idHotel = sc.nextLine();
        Hotel hotel = buscarHotel(idHotel);

        if (hotel != null) {
            hotel.listarHabitacionesDisponibles();
        } else {
            System.out.println("Hotel no encontrado.");
        }
    }

    public static void crearReserva(Scanner sc) {
        System.out.print("Ingrese ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Ingrese ID del hotel: ");
        String idHotel = sc.nextLine();
        Hotel hotel = buscarHotel(idHotel);

        if (hotel == null) {
            System.out.println("Hotel no encontrado.");
            return;
        }

        System.out.print("Ingrese número de habitación: ");
        String numeroHabitacion = sc.nextLine();
        Habitacion habitacion = hotel.buscarHabitacion(numeroHabitacion);

        if (habitacion == null) {
            System.out.println("Habitación no encontrada.");
            return;
        }

        System.out.print("Ingrese fecha de la reserva (AAAA-MM-DD): ");
        String fechaStr = sc.nextLine();
        LocalDate fecha = LocalDate.parse(fechaStr);

        // ❌ Complejidad O(n²): recorrer todos los clientes y todas sus reservas
        for (Cliente c : clientes) {
            for (Reserva r : c.getReservas()) {
                if (r.getHotel().getIdHotel().equals(hotel.getIdHotel())
                        && r.getHabitacion().getNumeroHabitacion().equals(habitacion.getNumeroHabitacion())
                        && r.getFecha().equals(fecha)) {
                    System.out.println("Error: la habitación ya está reservada ese día por otro cliente.");
                    return;
                }
            }
        }

        /*
        // 🟢 Validación optimizada con Set
        String clave = hotel.getIdHotel() + "-" + numeroHabitacion + "-" + fecha;
        if (reservasSet.contains(clave)) {
            System.out.println("Error: la habitación ya está reservada ese día.");
            return;
        }
         */
        
        /*
        // 🟢 Validación con Map (clave = idHotel-numeroHabitacion-fecha)
        String clave = hotel.getIdHotel() + "-" + numeroHabitacion + "-" + fecha;

        if (reservasMap.containsKey(clave)) {
            System.out.println("Error: la habitación ya está reservada ese día.");
            return;
        }
        */
        
        System.out.print("Ingrese cantidad de noches: ");
        int noches = sc.nextInt();
        sc.nextLine();

        Reserva reserva = new Reserva(hotel, habitacion, cliente, fecha, noches);
        cliente.agregarReserva(reserva);

        //reservasSet.add(clave); // Guardamos en el set
        //reservasMap.put(clave, reserva); //Guardamos en el Map
        habitacion.setDisponible(false);
        System.out.println("Reserva creada con éxito.");
    }

    public static void listarReservasCliente(Scanner sc) {
        System.out.print("Ingrese ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);

        if (cliente != null) {
            cliente.listarReservas();
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static Hotel buscarHotel(String id) {
        for (Hotel h : hoteles) {
            if (h.getIdHotel().equals(id)) {
                return h;
            }
        }
        return null;
    }

    public static Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getIdCliente().equals(id)) {
                return c;
            }
        }
        return null;
    }

}
