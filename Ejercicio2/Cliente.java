//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carné: 23053
//Programación Orientada a Objetos
//Ejercicio 2 - Arreglos de Objetos

import java.util.Scanner;

public class Cliente {
    // Variables de estado
    private String nombre;
    private int frecuencia;
    private int personas;
    private Scanner scanner;

    // Constructor de Cliente
    public Cliente(){
        scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=scanner.nextLine();
        System.out.println("Ingrese el número de veces que ha visitado el hotel");
        frecuencia=scanner.nextInt();
        System.out.println("Ingrese la cantidad de personas que se hospedarán");
        personas=scanner.nextInt();

        // Agregar el cliente al hotel
        Hotel hotel = new Hotel();
        hotel.agregarCliente(this);
    }

    // Métodos para verificar el tipo de cliente
    public boolean isRegular(){
        return frecuencia < 5;
    }
    public boolean isFrequent(){
        return frecuencia >= 5;
    }
    public boolean isVIP(){
        return frecuencia >= 10;
    }

    // Getters para acceder a los datos del cliente
    public String getNombre() {
        return nombre;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public int getPersonas() {
        return personas;
    }
}