//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carné: 23053
//Programación Orientada a Objetos
//Ejercicio 2 - Arreglos de Objetos

import java.util.Scanner;
public class Menu {
    // Variables de estado
    private Scanner scanner;
    private int choice;
    private Hotel hotel;
    private Empleado empleado;

    // Constructor de Menu
    public Menu(){
        scanner = new Scanner(System.in);
        hotel = new Hotel();
        
    }

    // Método para iniciar el menú
    public void iniciarMenu(){
        do {
            System.out.println("1. Reservar habitación");
            System.out.println("2. Asignar reservación");
            System.out.println("3. Salir");
            choice=scanner.nextInt();

            if(choice == 1){
                Cliente cliente = new Cliente();
                hotel.agregarCliente(cliente);
            }
            if(choice == 2){
                empleado = new Empleado(hotel);
                empleado.verReservas();
                empleado.Asignar();
            }
        } while(choice!=3);
        
    }

    // Método main para iniciar el programa
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.iniciarMenu();
    }
}

