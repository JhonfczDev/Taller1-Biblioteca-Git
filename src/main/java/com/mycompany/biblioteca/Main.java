package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clientes = new ArrayList<>(); 
    static Scanner sc = new Scanner(System.in);
    
    static void createClient(){
        Client newClient = new Client();
        
        System.out.println("__________AGREGAR CLIENTE__________");
        System.out.println("-A continuacion ingrese los datos del cliente a agregar:");
        
        System.out.println("-Ingrese la identificacion:");
        System.out.print("*"); newClient.setId(sc.nextLine());
        
        System.out.println("-Ingrese el nombre:");
        System.out.print("*"); newClient.setName(sc.nextLine());
        
        System.out.println("-Ingrese el numero de telefono:");
        System.out.print("*"); newClient.setPhoneNumber(sc.nextLine());
        
        System.out.println("-Ingrese el email:");
        System.out.print("*"); newClient.setPhoneNumber(sc.nextLine());
        
        clientes.add(newClient);
        
        System.out.println("\n-Cliente agregado exitosamente.");
        
        return;
    }

    public static void main(String[] args) {
        createClient();
    }
}
