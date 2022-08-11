/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.zbanco;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 8;
        boolean condiciona = false;
        Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        do {
            do {
                try {
                    System.out.println("Bienvenido/a \n ¿Que deseas hacer?\n 1. Formar \n 2. Atender \n 3. Ordenar por edad (Persona mayor a menor"
                            + "\n 4. Mostrar nombres de clientes formados \n 5 Mostrar monto total al momento \n 6. Monto mas alto al momento"
                            + "\n 7. Depositos mayores a 3500 \n 8. Promedio de depositos \n 9. Salir");
                    opc = s.nextInt();
                    condiciona = false;
                } catch (InputMismatchException ex) {
                    System.out.println("Ingresa un dato correcto");
                    condiciona = true;
                    s.next();
                }
            } while (condiciona);
            switch (opc) {
                case 1:

                    if (lista.getIndice() < 4) {
                        do {
                            try {
                                Persona temp = new Persona();
                                System.out.println("Ingresa nombre");
                                temp.setNombre(s.next());
                                System.out.println("Ingresa edad");
                                temp.setEdad(s.nextInt());
                                System.out.println("Ingresa monto");
                                temp.setMonto(s.nextFloat());
                                lista.agregar(temp);
                                condiciona = false;
                            } catch (Exception e) {
                                System.out.println("datos de tipo incorrecto");

                                condiciona = true;
                                s.next();
                            }
                        } while (condiciona);
                    } else {
                        System.out.println("La fila se encuentra llena");
                    }
                    break;
                case 2:
                    lista.atender();
                    break;
                case 3:
                    lista.ordena();
                    break;
                case 4:
                    int i;
                    for(i=0; i<lista.getIndice(); i++){
                    System.out.println(lista.getDatos()[i].getNombre());
                    }
                    break;
                case 5:
                    System.out.println("El monto depositado es de $" + lista.getTotalDepositado());
                    break;
                case 6:
                    System.out.println("El monto mas alto  a depositar es de $" + lista.mayor());
                    break;
                case 7:
                    System.out.println("La cantidad de depositos mayores a 3500 son: " + lista.mayores());
                    break;
                case 8:
                    System.out.println("El promedio de depositos es de $" + lista.promedio());
                    break;

            }
        } while (opc != 9);
    }
}
