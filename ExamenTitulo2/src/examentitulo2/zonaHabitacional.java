/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentitulo2;

/**
 *
 * @author danie
 */
public class zonaHabitacional {

    private int numero, cantidad = 0;
    private String zonaHabitacional;
    private double promediog;
    private Persona[] lista = new Persona[5];

    public zonaHabitacional(int numero, String zonaHabitacional) {
        this.numero = numero;
        this.zonaHabitacional = zonaHabitacional;
    }

    zonaHabitacional() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void agregar(Persona temporal) {
        lista[cantidad] = temporal;
        cantidad = cantidad + 1;
    }

    public void promedioc() {
        double pn=0, pj=0, pa=0, pv=0;
        int cn = 0, cj = 0, ca = 0, cv = 0;
        int i;
        String op;
        for (i = 0; i <cantidad; i = i + 1) {
            op = lista[i].asignar();
            switch (op) {
                case "Niño":
                    cn = cn + 1;
                    pn = pn+lista[i].getEdad();
                    break;
                case "Joven":
                    cj = cj + 1;
                    pj = pj+lista[i].getEdad();
                    break;
                case "Adulto":
                    ca = ca + 1;
                    pa = pa+lista[i].getEdad();
                    break;
                case "Viejo":
                    cv = cv + 1;
                    pv =pv+ lista[i].getEdad();
                    break;
            }
        }
        pn=pn/cn;
        pa=pa/ca;
        pj=pj/cj;
        pv=pv/cv;
        System.out.println("El promedio de edad de Niños es "+ pn);
        System.out.println("El promedio de edad de Jovenes es "+ pj);
        System.out.println("El promedio de edad de Adultos es "+ pa);
        System.out.println("El promedio de edad de Viejos es "+ pv);
    }

    public double promedioz(){
        
        double p = 0, a = 0;
        int i;
        if (cantidad >= 0) {
            for (i = 0; i < cantidad; i = i + 1) {
                a = a+lista[i].getPeso();
            }
            p = a / cantidad;
        }
        return p;
    }
    public int getNumero() {
        return numero;
    }

    public String getZonaHabitacional() {
        return zonaHabitacional;
    }

    public Persona[] getLista() {
        return lista;
    }

    public double getPromediog() {
        double p = 0, a = 0;
        int i;
        if (cantidad >= 0) {
            for (i = 0; i < cantidad; i = i + 1) {
                a = a+lista[i].getEdad();
            }
            p = a / cantidad;
        }
        return p;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setZonaHabitacional(String zonaHabitacional) {
        this.zonaHabitacional = zonaHabitacional;
    }

    public void setLista(Persona[] lista) {
        this.lista = lista;
    }

}
