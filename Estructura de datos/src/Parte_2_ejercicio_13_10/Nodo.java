
package Parte_2_ejercicio_13_10;

public class Nodo {

    int dato;
    private Nodo izdo;
    private Nodo dcho;

    public Nodo(int dato) {
        this.dato = dato;
        this.izdo = null;
        this.dcho = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }

}
