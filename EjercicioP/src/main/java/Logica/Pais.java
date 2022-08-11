/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import com.mycompany.ejerciciop.Ciudad;

/**
 *
 * @author danie
 */
public class Pais {
    private String nombre;
    private int indice=-1;
    private Ciudad[] ciudades = new Ciudad[3];
    public Pais(String nombre){
        this.nombre=nombre;
    }

    public Pais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregarCiudad(Ciudad temporal){
        indice=indice+1;
        if(indice<3){
        ciudades[indice]=temporal;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getIndice() {
        return indice;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }
    
    
}
