/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zbanco;

/**
 *
 * @author danie
 */
public class Lista {

    private Persona[] datos;
    private int indice; //indice lleva la cuenta de las personas agregadas
    public float totalDepositado;

    public Lista() {
        datos = new Persona[4];
    }

    public void agregar(Persona temporal) {
        if (indice < 4) {
            datos[indice] = temporal;
            indice++;
        }
    }

    public void atender() {
        int i;
        if (datos[0].getMonto() != 0) {
            totalDepositado = totalDepositado + datos[0].getMonto();
            indice=indice-1;
            for (i = 0; i < indice + 1; i++) {
                datos[i] = null;
                datos[i] = datos[i + 1];
            }
        }
    }

    public void ordena() {
        int i, j;
        Persona aux;
        if (indice > 1) {
            for (i = 0; i < indice-1; i++) { // se posiciona en el vector
                for (j = 0; j < indice-1 - i; j++) { // comparar posicion 0 con las demas posiciones
                    if (datos[j + 1].getEdad() > datos[j].getEdad()) {
                        aux = datos[j + 1];
                        datos[j + 1] = datos[j];
                        datos[j] = aux;
                    }
                }
            }
        }
    }

    public float mayor() {
        int i;
        float monto;
        monto = 0;
        if (datos[0].getMonto() != 0) {
            monto = datos[0].getMonto();
        }
        if (indice >= 1) {
            for (i = 1; i < indice; i++) {
                if (datos[i].getMonto() > monto) {
                    monto = datos[i].getMonto();
                }
            }
        }
        return monto;
    }

    public float promedio() {
        int i;
        float promedio;
        promedio = 0;
        if (datos[0].getMonto() != 0) {
            promedio = datos[0].getMonto();
        }
        if (indice >= 2) {
            for (i = 1; i < indice; i++) {
                promedio = promedio + datos[i].getMonto();
            }
        }
        return promedio / indice;
    }

    public int mayores() {
        int contador = 0, i;
        if (datos[0].getMonto() != 0) {
            for (i = 0; i < indice; i++) {
                if (datos[i].getMonto() > 3500) {
                    contador = contador + 1;
                }
            }
        }
        return contador;

    }

    public void setDatos(Persona[] datos) {
        this.datos = datos;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setTotalDepositado(float totalDepositado) {
        this.totalDepositado = totalDepositado;
    }

    public Persona[] getDatos() {
        return datos;
    }

    public int getIndice() {
        return indice;
    }

    public float getTotalDepositado() {
        return totalDepositado;
    }

}