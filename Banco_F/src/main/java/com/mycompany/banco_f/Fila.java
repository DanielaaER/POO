/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco_f;

/**
 *
 * @author danie
 */
public class Fila {

    private Persona[] personas;
    private int indice, cantidad, total;
    public float acumulado, mayor;

    public Fila(int cantidad) {
        this.cantidad = cantidad;
        indice = -1;
        acumulado = 0;
        total = 0;
        mayor=0;
        personas = new Persona[this.cantidad];
    }

    public void Formar(Persona temp) {
        indice = indice + 1;
        if (indice < cantidad) {
            personas[indice] = temp;
        }
    }

    public void Atender() {
        int i;
        Persona aux;
        if (indice > -1) {
            acumulado = acumulado + personas[0].getMonto();
            indice = indice - 1;
            total = total + 1;
            for (i = 0; i < indice + 1; i++) {
                personas[i] = personas[i + 1];
            }
            if(personas[0].getMonto()>mayor){
                mayor=personas[0].getMonto();
            }
        }

    }

    public void Ordenar() {
        int i, j;
        Persona aux;
        if (indice >= 1) {
            for (i = 0; i < indice; i++) {
                for (j = 0; j < indice - i; j++) {
                    if (personas[j + 1].getEdad() > personas[j].getEdad()) {
                        aux = personas[j + 1];
                        personas[j + 1] = personas[j];
                        personas[j] = aux;
                    }
                }
            }
            for (i = 0; i <= indice; i++) {
                System.out.println(personas[i].getNombre());
            }
        }
    }

//    public float Comparar() {
//        int i;
//        float mayor;
//        mayor = 0;
//        if (indice >= 1) {
//            mayor = personas[0].getMonto();
//            if (personas[i].getMonto() > mayor) {
//                mayor = personas[i].getMonto();
//            }
//
//        }
//        return mayor;
//    }

    public float promediar() {

        return acumulado / total;
    }

    public int contar() {
        int cuenta = 0, i;
        for (i = 0; i <= indice; i++) {
            if (personas[i].getMonto() > 3500) {
                cuenta = cuenta + 1;
            }
        }
        return cuenta;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public float getAcumulado() {
        return acumulado;
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
