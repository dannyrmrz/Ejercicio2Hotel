//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carné: 23053
//Programación Orientada a Objetos
//Ejercicio 2 - Arreglos de Objetos

import java.util.ArrayList;
import java.util.List;

public class Hotel{
    // Lista para almacenar los clientes
    private List<Cliente> listaClientes;
    
    // Constructor de Hotel
    public Hotel() {
        listaClientes = new ArrayList<>();
    }

    // Método para agregar un cliente a la lista
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    // Método para obtener la lista de clientes
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
}