/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancosalvador;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class BancoSalvador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 8;
        boolean avanza = false;
        Scanner s = new Scanner(System.in);
        Fila fila = new Fila(5);
        do {
            System.out.println("Bienvenido/a \n ¿Que deseas hacer?\n 1. Formar \n 2. Atender \n 3. Ordenar por edad (Persona mayor a menor");
            System.out.println(" 4. Mostrar nombres de clientes formados \n 5. Mostrar monto total al momento \n 6. Monto mas alto al momento");
            System.out.println(" 7. Depositos mayores a 3500 \n 8. Promedio de depositos \n 9. Salir");
            opc = s.nextInt();
            switch (opc) {
                case 1:

                    if (fila.getI() < fila.getLargo() - 1) {
                        Cliente temporal = new Cliente();
                        System.out.println("Ingresa tu nombre");
                        temporal.setNombre(s.next());
                        System.out.println("Ingresa tu edad");
                        temporal.setEdad(s.nextInt());
                        avanza = false;
                        System.out.println("Ingresa el monto a depositar");
                        temporal.setMonto(s.nextFloat());
                        avanza = false;
                        fila.agregaCliente(temporal);
                    } else {
                        System.out.println("La fila llena");
                    }
                    break;
                case 2:
                    if (fila.getI() >= 0) {
                        fila.deposito();
                    }
                    break;
                case 3:
                    fila.OrdenaCliente();
                    break;
                case 4:
                    int i;
                    for (i = 0; i <= fila.getI(); i++) {
                        System.out.println(fila.getCliente()[i].getNombre());
                    }
                    break;
                case 5:
                    System.out.println("El monto depositado es de $" + fila.getSuma());
                    break;
                case 6:
                    System.out.println("El monto mas alto  a depositar es de $" + fila.getMayor());
                    break;
                case 7:
                    System.out.println("La cantidad de depositos mayores a 3500 son: " + fila.mayores());
                    break;
                case 8:
                    System.out.println("El promedio de depositos es de $" + fila.getPromedio());
                    break;

            }

        } while (opc
                != 9);
    }

}
