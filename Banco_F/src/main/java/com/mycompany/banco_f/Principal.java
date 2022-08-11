/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.banco_f;

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
    public static Persona Agregar() {
        boolean avanza = false, avanzar = false, control = false;
        Scanner s = new Scanner(System.in);
        Persona temporal = new Persona();
        do {
            try {
                control = false;
                do {
                    System.out.println("Ingresa tu nombre");
                    temporal.setNombre(s.nextLine());
                    if (temporal.getNombre().matches(".*[0-9].*")) {
                        System.out.println("Ingresa solo letras");
                        control = true;
                    } else {
                        control = false;
                    }
                } while (control);
                do {
                    try {
                        System.out.println("Ingresa tu edad");
                        temporal.setEdad(s.nextInt());
                        avanza = false;
                    } catch (InputMismatchException ex) {
                        System.out.println("Ingresa un valor numerico");
                        avanza = true;
                        s.next();
                    }
                } while (avanza);
                do {
                    try {
                        System.out.println("Ingresa el monto a depositar");
                        temporal.setMonto(s.nextFloat());
                        avanza = false;
                    } catch (InputMismatchException ex) {
                        System.out.println("Ingresa un valor numerico");
                        avanza = true;
                        s.next();
                    }
                } while (avanza);
            } catch (InputMismatchException ex) {
                System.out.println("Ingresa los datos correctamente");
                avanzar = true;
                s.next();
            }
        } while (avanzar);
        return temporal;
    }

    public static void Mostrar(Fila temporal) {
        int i;
        for (i = 0; i <= temporal.getIndice(); i++) {
            System.out.println(temporal.getPersonas()[i].getNombre());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 8;
        boolean avanza = false;
        Scanner s = new Scanner(System.in);
        Fila filaa = new Fila(5);
        do {
            do {
                try {
                    System.out.println("Bienvenido/a \n ¿Que deseas hacer?\n 1. Formar \n 2. Atender \n 3. Ordenar por edad (Persona mayor a menor"
                            + "\n 4. Mostrar nombres de clientes formados \n 5 Mostrar monto total al momento \n 6. Monto mas alto al momento"
                            + "\n 7. Depositos mayores a 3500 \n 8. Promedio de depositos \n 9. Salir");
                    opc = s.nextInt();
                    avanza = false;
                } catch (InputMismatchException ex) {
                    System.out.println("Ingresa un valor numerico");
                    avanza = true;
                    s.next();
                }
            } while (avanza);
            switch (opc) {
                case 1:

                    if (filaa.getIndice() < filaa.getCantidad() - 1) {
                        filaa.Formar(Agregar());
                        System.out.println("Bienvenido " + filaa.getPersonas()[filaa.getIndice()].getNombre() + " te encuentras en la fila");
                    } else {
                        System.out.println("La fila se encuentra llena");
                    }
                    break;
                case 2:
                    if (filaa.getIndice() >= 0) {
                        System.out.print(filaa.getPersonas()[0].getNombre());
                        filaa.Atender();
                        System.out.println(" has sido atendido");
                    }
                    break;
                case 3:
                    filaa.Ordenar();
                    break;
                case 4:
                    Mostrar(filaa);
                    break;
                case 5:
                    System.out.println("El monto depositado es de $" + filaa.getAcumulado());
                    break;
                case 6:
                    System.out.println("El monto mas alto  a depositar es de $" + filaa.mayor);
                    break;
                case 7:
                    System.out.println("La cantidad de depositos mayores a 3500 son: " + filaa.contar());
                    break;
                case 8:
                    System.out.println("El promedio de depositos es de $" + filaa.promediar());
                    break;

            }
        } while (opc != 9);
    }

}
