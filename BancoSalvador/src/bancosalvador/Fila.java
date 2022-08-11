/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancosalvador;

/**
 *
 * @author danie
 */
public class Fila {

    private Cliente[] cliente;
    private int i, totalCliente, largo;
    private float suma, mayor, promedio;

    public Fila(int largo) {
        cliente = new Cliente[largo];
        this.largo = largo;
        i = -1;
    }

    public Fila() {
        cliente = new Cliente[3];
        largo = 3;
        i = -1;
    }

    public void agregaCliente(Cliente auxiliar) {
        i++;
        if (i < largo) {

            cliente[i] = auxiliar;
        }
    }

    public void deposito() {
        int j;
        Cliente aux;
        if (i > -1) {
            suma = suma + cliente[0].getMonto();
            totalCliente++;
            if (cliente[0].getMonto() > mayor) {
                mayor = cliente[0].getMonto();
            }
            
            i--;
            for (j = 0; j < i + 1; j++) {
                cliente[i] = cliente[i + 1];
            }

        }
    }

    public void OrdenaCliente() {
        int j, k;
        Cliente aux;
        if (i >= 1) {
            for (j = 0; j < i; j++) {
                for (k = 0; k < i - j; k++) {
                    if (cliente[k + 1].getEdad() > cliente[j].getEdad()) {
                        aux = cliente[k + 1];
                        cliente[k + 1] = cliente[k];
                        cliente[k] = aux;
                    }
                }
            }
        }
    }

    public int mayores() {
        int cuenta = 0, j;
        for (j = 0; j <= i; j++) {
            if (cliente[i].getMonto() > 3500) {
                cuenta = cuenta + 1;
            }
        }
        return cuenta;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public int getLargo() {
        return largo;
    }

    public int getI() {
        return i;
    }

    public int getTotalCliente() {
        return totalCliente;
    }

    public float getSuma() {
        return suma;
    }

    public float getMayor() {
        return mayor;
    }

    public float getPromedio() {
        promedio = suma / totalCliente;
        return promedio;
    }

}
