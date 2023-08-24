//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carné: 23053
//Programación Orientada a Objetos
//Ejercicio 2 - Arreglos de Objetos

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    // Variables de estado
    private int disponibleStandard;
    private int disponibleDeluxe;
    private int disponibleVIP;
    private int limpersonas;
    private List<Cliente> Waitinglist;
    private Hotel hotel;

    // Constructor de Empleado
    public Empleado(Hotel hotel) {
        this.hotel = hotel;
        Waitinglist = new ArrayList<>();
        disponibleStandard=10;
        disponibleDeluxe=10;
        disponibleVIP=10;
    }
    
    // Método para ver las reservas de los clientes
    public void verReservas() {
        List<Cliente> listaClientes = hotel.getListaClientes();

        // Verificar si no hay reservas pendientes
        if (listaClientes.isEmpty()) {
            System.out.println("No hay ninguna reserva pendiente");
            return;
        }

        // Mostrar los detalles de las reservas
        for (Cliente cliente : listaClientes) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Frecuencia: " + cliente.getFrecuencia());
            System.out.println("Personas: " + cliente.getPersonas());
            System.out.println("Tipo de cliente: " + (cliente.isVIP() ? "VIP" : (cliente.isFrequent() ? "Frecuente" : "Regular")));
            System.out.println("----");
        }
    }

    // Método para asignar habitaciones a los clientes
    public void Asignar() {
            List<Cliente> listaClientes = hotel.getListaClientes();
            for (Cliente cliente : listaClientes) {
                if (cliente.isRegular()) {
                    limpersonas = 4;
                    if (cliente.getPersonas() < limpersonas && disponibleStandard > 0) {
                        disponibleStandard--;
                        System.out.println("Cliente asignado exitosamente");
                    }
                } if (cliente.isFrequent()) {
                    limpersonas = 6;
                    if (cliente.getPersonas() < limpersonas && disponibleDeluxe > 0) {
                        disponibleDeluxe--;
                        System.out.println("Cliente asignado exitosamente");
                    }
                } if (cliente.isVIP()) {
                    limpersonas = 8;
                    if (cliente.getPersonas() < limpersonas && disponibleVIP > 0) {
                        disponibleVIP--;
                        System.out.println("Cliente asignado exitosamente");
                    }
                } else {
                    Waitinglist.add(cliente);
                    System.out.println("El cliente ha sido asignado a la lista de espera debido a que no cumple con los requerimientos del hotel");
                }
            }
    } 
}
    




