/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import com.mycompany.ejerciciop.Ciudad;
import java.util.Scanner;

/**
 *
 * @author danie
 */

public class asigna {
    public  Ciudad agrega(){
        Scanner s= new Scanner(System.in);
        Ciudad temporal= new Ciudad();
        System.out.println("Ingresa nombre de ciudad 1");
        temporal.setNombre(s.next());
        System.out.println("Ingresa capital de ciudad 1");
        temporal.setCapital(s.next());
        System.out.println("Ingresa clima de ciudad 1");
        temporal.setClima(s.next());
        System.out.println("Ingresa superficie de ciudad 1");
        temporal.setSuperficie(s.next());
        System.out.println("Ingresa poblacion de ciudad 1");
        temporal.setPoblacion(s.nextInt());
        return temporal;
    }
    public Pais crea(String nombre){
    Scanner s = new Scanner(System.in);
        Pais temporal = new Pais(nombre);
        System.out.println(temporal.getNombre());
        temporal.agregarCiudad(agrega());
        temporal.agregarCiudad(agrega());
        temporal.agregarCiudad(agrega());
        return temporal;
    }
    
    
}
