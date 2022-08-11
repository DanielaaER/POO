/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author danie
 */
public class Cuenta {
   private String nombre;
   private double monto, cantidad, retirar;
   private int inicializado;
   
   public Cuenta(){
       this.nombre="";
       inicializado=0;
   }
   
   public double Saldo(){
   return monto;
   }
   
   public double Deposito(){
       if (cantidad>0){
           monto=monto+cantidad;
       }
       return monto;
   }

   public double Retiro (){
       if(monto<retirar){
           System.out.println("Saldo Insuficiente, no se puede realizar el retiro");
       }else{
           monto=monto-retirar;
           System.out.println("Retiro Exitoso");
       }
       return monto;
   }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getRetirar() {
        return retirar;
    }

    public int getInicializado() {
        return inicializado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public void setInicializado(int inicializado) {
        this.inicializado = inicializado;
    }
   
   
}
