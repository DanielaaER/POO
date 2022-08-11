/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author danie
 */
public class Persona {
    private int edad, turno;
    private String nombre;
    private boolean sexo;
    private float monto;

    public Persona(){
        monto=0;
    }
    public int getEdad() {
        return edad;
    }

    public int getTurno() {
        return turno;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public float getMonto() {
        return monto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
}
