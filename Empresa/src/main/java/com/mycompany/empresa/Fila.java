/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author danie
 */
public class Fila {

    private Persona[] personas;
    private int indice, cantidad;

    public Fila(int cantidad) {
        this.cantidad = cantidad;
        indice = -1;
        personas = new Persona[this.cantidad];
    }

    public void Formar(Persona temp) {
        indice = indice + 1;
        personas[indice] = temp;
    }

    public void Ordenar() {
        int i, j, aux;
        if (indice >= 1) {
            for (i = 0; i < indice - 1; i++) {
                for (j = 0; j < indice - i - 1; j++) {
                    if (personas[j + 1].getEdad() > personas[j].getEdad()) {
                        aux = personas[j + 1].getEdad();
                        personas[j + 1].setEdad(personas[j].getEdad());
                        personas[j].setEdad(aux);
                    }
                }
            }
        }
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public int getIndice() {
        return indice;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

}
