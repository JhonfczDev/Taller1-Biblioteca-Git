package com.mycompany.biblioteca;

public class Client extends Person{
    private String email;

    public Client() {
    }

    public Client(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
