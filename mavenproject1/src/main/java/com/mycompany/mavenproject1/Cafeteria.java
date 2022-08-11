/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    
    public static void llenar(Cafetera tem,String op){
        boolean avanza;
        Scanner s= new Scanner(System.in);
         do {
                        try {
                            avanza = false;
                            System.out.println("Ingresa la medida de tu "+op+" : ");
                            int cantidad = s.nextInt();
                            tem.setCantidad(cantidad);
                            cantidad=tem.servirTaza();
                            if ( cantidad!=0) {
                                System.out.println("La cantidad actual de cafe no alcanza para llenar tu "+op);
                                System.out.println("Faltaron " + cantidad + " mililitros");
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Ingresa un numero por favor");
                            s.next();
                            avanza = true;
                        }
                    } while (avanza);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        boolean avanza;
        int i = 0;
        Scanner s = new Scanner(System.in);
        Cafetera c1;
        c1 = new Cafetera();
        do {
            do {
                try {
                    avanza = false;
                    System.out.println("BIENVENID@ ");
                    System.out.println("¿Que deseas hacer \n 1. Estado de la Cafetera \n 2. Llenar Cafetera \n 3. Vaciar cafetera \n 4. Servir taza de cafe \n 5. Llenar termo \n 6. Agregar café a la cafetera \n 7. Salir");
                    i = s.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Ingresa un numero por favor");
                    s.next();
                    avanza = true;
                }
            } while (avanza);
            switch (i) {
                case 1:
                    System.out.println("Cantidad Actual:  " + c1.getCapacidadActual());
                    System.out.println("Cantidad Maxima:  " + c1.getCapacidadMaxima());
                    break;
                case 2:
                    c1.llenarCafetera();
                    break;
                case 3:
                    c1.vaciarCafetera();
                    break;
                case 4:
                    llenar(c1,"taza");

                    break;
                case 5:
                    llenar(c1,"termo");
                    break;
                case 6:
                        do {
                try {
                avanza = false;
                    System.out.println("Ingresa la cantidad a agregar : ");
                    c1.setCantidad(s.nextInt());
                    c1.agregarCafe(c1.getCantidad());
                    if (c1.getCantidad() >= 0) {
                        System.out.println("Sobraron " + c1.getCantidad() + " mililitros");
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Ingresa un numero por favor");
                     s.next();
                    avanza = true;
                }
            } while (avanza);
               
                    
                    break;
            }

        } while (i < 7);
    }

}
