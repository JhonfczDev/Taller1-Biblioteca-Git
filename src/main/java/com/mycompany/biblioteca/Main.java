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
    
    static Client searchClient(String id){
        for (Client client : clientes) {
            if(client.getId().equals(id)){
                
                return client;
            }
        }
        
        return null;
    }
    
    static void updateClient(){
        
        String id="";
        Client client;
        
        System.out.println("          __________EDITAR CLIENTE__________");
        System.out.print("-Ingrese la identificacion del cliente que desea modificar: "); id = sc.nextLine();
        
        client = searchClient(id);
        
        if(client == null){
            System.out.println("\n-El cliente ingresado no se encuentra registrado.");
            
            return;
        }
        else{
            System.out.println("\n-El cliente se encuentra registrado, ingrese los nuevos datos: ");
            
            System.out.print("-Ingrese la identificacion: "); client.setId(sc.nextLine());
            System.out.print("-Ingrese el nombre: "); client.setName(sc.nextLine());
            System.out.print("-Ingrese el numero de telefono: "); client.setPhoneNumber(sc.nextLine());
            System.out.print("-Ingrese el email: "); client.setEmail(sc.nextLine());
            
            System.out.println("Cliente modificado con exito.");
            
        }
        
    }

    public static void main(String[] args) {
        createClient();
        readClient();
        updateClient();
        readClient();
    }
}
