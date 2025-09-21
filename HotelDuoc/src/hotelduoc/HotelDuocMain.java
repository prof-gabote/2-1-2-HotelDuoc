/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelduoc;

import java.util.Scanner;

/**
 *
 * @author Gabote
 */
public class HotelDuocMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE RESERVAS ===");
            System.out.println("1. Registrar hotel");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Agregar habitación a un hotel");
            System.out.println("4. Listar hoteles");
            System.out.println("5. Listar habitaciones disponibles de un hotel");
            System.out.println("6. Crear reserva");
            System.out.println("7. Listar reservas de un cliente");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    Menu.registrarHotel(sc);
                case 2 ->
                    Menu.registrarCliente(sc);
                case 3 ->
                    Menu.agregarHabitacion(sc);
                case 4 ->
                    Menu.listarHoteles();
                case 5 ->
                    Menu.listarHabitaciones(sc);
                case 6 ->
                    Menu.crearReserva(sc);
                case 7 ->
                    Menu.listarReservasCliente(sc);
                case 8 ->
                    System.out.println("Saliendo del sistema...");
                default ->
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 8);
    }
}
