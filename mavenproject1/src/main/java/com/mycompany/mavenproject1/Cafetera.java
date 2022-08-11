/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author danie
 */
public class Cafetera {
     private int capacidadMaxima, capacidadActual, cantidad;
    
    public Cafetera(){
        capacidadMaxima=2000;
        capacidadActual=0;
    }
    
    public Cafetera(int capacidadActual){
        this.capacidadActual=capacidadActual;
        capacidadMaxima=this.capacidadActual;
    }
    
    public Cafetera(int capacidadMaxima, int capacidadActual){
        if (capacidadMaxima<capacidadActual){
            this.capacidadActual=capacidadMaxima;
        }
        this.capacidadActual= capacidadActual;
        this.capacidadMaxima=capacidadMaxima;
    }

    
    
    
    public void llenarCafetera(){
        capacidadActual=capacidadMaxima;
    }
    
    public int servirTaza(){
        int faltante=0;
        if (this.cantidad>capacidadActual){
            faltante=capacidadActual-cantidad;
            faltante=faltante*-1;
            cantidad=capacidadActual;
            
        }
        capacidadActual=capacidadActual-cantidad;
        cantidad=0;
        return faltante;
    }
    
    public void vaciarCafetera(){
        capacidadActual=0;
        
    }
    
    public int agregarCafe(int cantidad){
        this.cantidad=cantidad;
        capacidadActual=capacidadActual+this.cantidad;
        this.cantidad=0;
        if (capacidadActual>capacidadMaxima){
            this.cantidad=capacidadActual-capacidadMaxima;
            this.capacidadActual=capacidadMaxima;
        }
        return capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
}
