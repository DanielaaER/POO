/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentitulo2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class ExamenTitulo2 {

    /**
     * @param args the command line arguments
     */
    public static Persona agregar() {
        Persona temporal = new Persona();

        Scanner s = new Scanner(System.in);
        System.out.println("Nombre");
        temporal.setNombre(s.next());
        System.out.println("Edad");
        temporal.setEdad(s.nextInt());
        System.out.println("Peso");
        temporal.setPeso(s.nextDouble());

        return temporal;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        zonaHabitacional z1, z2, z3;
        System.out.println("Zona 1");
        z1 = new zonaHabitacional(1, "zona1");
        for (i = 0; i < 5; i = i + 1) {
            z1.agregar(agregar());
        }
        System.out.println("Zona 2");
        z2 = new zonaHabitacional(2, "zona2");
        for (i = 0; i < 5; i = i + 1) {
            z2.agregar(agregar());
        }
        System.out.println("Zona 3");
        z3 = new zonaHabitacional(3, "zona3");
        for (i = 0; i < 5; i = i + 1) {
            z3.agregar(agregar());
        }

        System.out.println(z1.getZonaHabitacional());
        System.out.println(z1.getNumero());
        System.out.println("Pesonas del muestreo");
        for (i = 0; i < 5; i = i + 1) {
            System.out.println("Nombre: " + z1.getLista()[i].getNombre());
            System.out.println("Peso: " + z1.getLista()[i].getPeso());
            System.out.println("Edad: " + z1.getLista()[i].getEdad());
        }
        System.out.print("Promedio de edades: ");
        z1.promedioc();
        System.out.println(z1.promedioz());
        System.out.println("Promedio geneal de peso: "+ z1.promedioz());
        
        
        System.out.println(z2.getZonaHabitacional());
        System.out.println(z2.getNumero());
        System.out.println("Pesonas del muestreo");
        for (i = 0; i < 5; i = i + 1) {
            System.out.println("Nombre: " + z2.getLista()[i].getNombre());
            System.out.println("Peso: " + z2.getLista()[i].getPeso());
            System.out.println("Edad: " + z2.getLista()[i].getEdad());
        }
        System.out.print("Promedio de edades: ");
        z2.promedioc();
        System.out.println(z2.promedioz());
        System.out.println("Promedio geneal de peso: "+ z2.promedioz());
        
        
        System.out.println(z3.getZonaHabitacional());
        System.out.println(z3.getNumero());
        System.out.println("Pesonas del muestreo");
        for (i = 0; i < 5; i = i + 1) {
            System.out.println("Nombre: " + z3.getLista()[i].getNombre());
            System.out.println("Peso: " + z3.getLista()[i].getPeso());
            System.out.println("Edad: " + z3.getLista()[i].getEdad());
        }
        System.out.print("Promedio de edades: ");
        z3.promedioc();
        System.out.println(z3.promedioz());
        System.out.println("Promedio geneal de peso: "+ z3.promedioz());
    }
}
