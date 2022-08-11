/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculoimc;

/**
 *
 * @author danie
 */
public class Persona {

    private String nombre, dni;
    char sexo;
    private double peso, estatura;
    private int edad, asignado;

    public Persona() {
        nombre = "Default";
        sexo = 'H';
        peso = 60;
        estatura = 1.70;
        edad = 18;
    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        peso = 60;
        estatura = 1.70;
    }

    public Persona(String nombre, char sexo, double peso, double estatura, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
    }

    public int calcularImc() {
        double imc;
        int resultado;
        imc = (peso / (estatura * estatura));
        if (imc < 20) {
            resultado = -1;
        } else if (imc > 25) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public boolean comprobarEdad() {
        boolean mayor;
        mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public void comprobarSexo() {
        if (sexo == 'm' || sexo == 'M') {
            sexo = 'M';
        } else {
            sexo = 'H';
        }
    }

    public void generarDNI() {
        if (asignado ==0) {
            comprobarSexo();
            asignado = 1;
            int numero = (int) (1000000 + Math.random() * 900000);
            dni = Integer.toString(numero);
            dni = dni + sexo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAsignado(int asignado) {
        this.asignado = asignado;
    }

    public int getEdad() {
        return edad;
    }

    public int getAsignado() {
        return asignado;
    }

}
