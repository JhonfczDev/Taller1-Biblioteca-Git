package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clientes = new ArrayList<>(); 
    static Scanner sc = new Scanner(System.in);
    
    static void createClient(){
        Client newClient = new Client();
        
        System.out.println("          __________AGREGAR CLIENTE__________");
        System.out.println("-A continuacion ingrese los datos del cliente a agregar:\n");
        
        System.out.print("-Ingrese la identificacion: "); newClient.setId(sc.nextLine());
        
        System.out.print("-Ingrese el nombre: "); newClient.setName(sc.nextLine());
        
        System.out.print("-Ingrese el numero de telefono: "); newClient.setPhoneNumber(sc.nextLine());
        
        System.out.print("-Ingrese el email: "); newClient.setEmail(sc.nextLine());
        
        clientes.add(newClient);
        System.out.println("\n-Cliente agregado exitosamente.\n");
        
        return;
    }
    
    static void readClient(){
        
        String resultado=" ";
        int ind=1;
        
        for (Client client : clientes) {
            resultado += "CLIENTE "+ind+".\n" 
                    +"\n-Identificacion: "+client.getId()
                    +"\n-Nombre: "+client.getName()
                    +"\n-Telefono: "+client.getPhoneNumber()
                    +"\n-Email: "+client.getEmail()
                    +"\n";
                    
                    ind+=1;
        }
        
        System.out.println("          __________CONSULTAR CLIENTES__________");
        System.out.println("-Listado de clientes registrados:\n");
        System.out.println(resultado);
        
    };

    public static void main(String[] args) {
        createClient();
        readClient();
    }
}
