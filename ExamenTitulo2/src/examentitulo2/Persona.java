/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentitulo2;

/**
 *
 * @author danie
 */
public class Persona {

    private String nombre;
    private int edad;
    private double peso;

    public String asignar() {
        String categoria="null";
            if (edad <= 12) {
                categoria = "Niño";
            } else if (edad <= 29) {
                categoria = "Joven";
            } else if (edad <= 59) {
                categoria = "Adulto";
            } else if (edad>60){
                categoria = "Viejo";
            }
        
        return categoria;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
