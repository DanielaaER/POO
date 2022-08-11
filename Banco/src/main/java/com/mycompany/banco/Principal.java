/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.banco;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author danie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static float comprobar(String opcion) {

        Scanner s = new Scanner(System.in);
        boolean avanza;
        float cantidad = 0;
        do {
            try {
                avanza = false;
                System.out.println("Ingresa la cantidad a " + opcion);
                cantidad = s.nextInt();
            } catch (InputMismatchException ex) {
                avanza = true;
                System.out.println("Ingresa un numero");
                s.next();
            }
        } while (avanza);
        return cantidad;
    }

    public static void ejecutar(Cuenta p) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        boolean avanza, control;
        if (p.getInicializado() != 1) {
            control = false;
            do {
                System.out.println("Ingresa tu nombre");
                p.setNombre(s.nextLine());
                if (p.getNombre().matches(".*[0-9].*")) {
                    System.out.println("Ingresa solo letras");
                    control = true;
                } else {
                    control = false;
                }
            } while (control);
            do {
                try {
                    avanza = false;
                    System.out.println("Ingresa el monto inicial de tu cuenta");
                    p.setMonto(s.nextInt());
                    p.setInicializado(1);
                } catch (InputMismatchException ex) {
                    System.out.println("ingresa los datos correctamente");
                    avanza = true;
                    s.next();
                }
            } while (avanza);
        }
        do {
            do {
                try {
                    avanza = false;
                    System.out.println("Bienvenido/a de nuevo " + p.getNombre() + "\n ¿Que deseas hacer?\n 1. Consultar saldo"
                            + "\n 2. Retirar Efectivo \n 3. Depositar Efectivo \n 4. Salir");
                    i = s.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Ingresa un numero por favor");
                    s.next();
                    avanza = true;
                }
            } while (avanza);
            switch (i) {
                case 1:
                    System.out.println("Tu saldo es de $" + p.getMonto());
                    break;
                case 2:
                    p.setRetirar(comprobar("retirar"));
                    p.Retiro();
                    break;
                case 3:
                    p.setCantidad(comprobar("depositar"));
                    p.Deposito();
                    break;
            }
        } while (4 != i);
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1, c2;
        c1 = new Cuenta();
        c2 = new Cuenta();
        boolean avanza;
        int op = 0;
        Scanner s = new Scanner(System.in);
        do {
            try {
                avanza = false;
                System.out.println("Ir a \n 1. persona 1 \n 2. persona 2 \n 3. salir");
                op = s.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingresa un numero");
                s.nextLine();
                avanza = true;
            }
            while (avanza);
            switch (op) {
                case 1:
                    ejecutar(c1);
                    break;
                case 2:
                    ejecutar(c2);
                    break;
            }
        } while (3 != op);
    }

}
