/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculoimc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
 
    public static void comprobarPeso(Persona temp) {
        int imc;
        imc = temp.calcularImc();
        System.out.print(temp.getNombre());
        switch (imc) {
            case -1:
                System.out.println(" estas debajo de tu peso ideal");
                break;
            case 0:
                System.out.println(" estas en tu peso ideal");
                break;
            default:
                System.out.println(" tienes sobrepeso");
                break;
        }
    }

    public static void llenarDato(Persona temp){
        boolean edad;
        comprobarPeso(temp);
        edad=temp.comprobarEdad();
        System.out.print(temp.getNombre());
        if(edad==true){
            System.out.println(" eres mayor de edad");
        }else{
            System.out.println(" eres menor de edad");
        }
        temp.generarDNI();
    }
    
    public static void mostrarDatos(Persona temp){
        System.out.println("\nNombre :"+temp.getNombre()+"\nEdad :"+temp.getEdad()+"\nDNI :"+temp.getDni()+"\nSexo :"+temp.getSexo()+
                "\nEstatura :"+temp.getEstatura()+"\nPeso :"+temp.getPeso());
        
    }
    
    public static String llenarDatos(String opc){
        Scanner s = new Scanner(System.in);
        boolean avanza,control=false;
        String dato="";
        do {
            try {
                avanza = false;
                System.out.println("Ingresa tu "+opc);
                switch(opc){
                    case "nombre":
                        control=false;
                        do{
                            dato=s.nextLine();
                            if(dato.matches(".*[0-9].*")){
                                System.out.println("Ingresa solo letras");
                                control=true;
                            }else
                                control=false;
                        }while(control);
                       break;
                    case "sexo":
                        control=false;
                        do{
                            char g= s.next().charAt(0);
                            dato=Character.toString(g);
                            if(dato.matches(".*[0-9].*")){
                                System.out.println("Ingresa solo letras");
                                control=true;
                            }else
                                control=false;
                        }while(control);
                        break;
                    case "edad":
                        int e = s.nextInt();
                        dato=String.valueOf(e);
                        break;
                    case "peso":
                        double d=s.nextDouble();
                        dato=String.valueOf(d);
                        break;
                    case "estatura":
                        control = false;
                        do{
                        double a=s.nextDouble();
                        if(a<=2){
                            dato=String.valueOf(a);
                            control=false;
                        }else{
                            System.out.println("Ingresa tu estatura en metros");
                            control=true;
                        }
                        }while(control);
                        break;         
                }
            } catch (InputMismatchException ex) {
                avanza = true;
                System.out.println("Ingresa los datos correctamente");
                s.next();
            }
        } while (avanza);
        return dato;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
         String nombre;
    char sexo;
     double peso, estatura;
     int edad;
          Persona p1, p2, p3, temporal;
          temporal=new Persona();
          System.out.println("Ingresa nombre");
          nombre=s.next();
          System.out.println("Ingresa sexo");
          sexo=s.next().charAt(0);
          System.out.println("Ingresa peso");
          peso=s.nextDouble();
          System.out.println("Ingresa estatura");
          estatura=s.nextDouble();
          System.out.println("Ingresa edad");
          edad=s.nextInt();
          p1=new Persona(nombre, sexo, peso, estatura, edad);
          p2=new Persona(llenarDatos("nombre"),llenarDatos("sexo").charAt(0), Integer.valueOf(llenarDatos("edad")));
          p3=new Persona();
          llenarDato(p1);
          llenarDato(p2);
          llenarDato(p3);
          mostrarDatos(p1);
          mostrarDatos(p2);
          mostrarDatos(p3);

    }

}
