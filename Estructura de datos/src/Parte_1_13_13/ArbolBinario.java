package Parte_1_13_13;

public class ArbolBinario {

    public static void main(String[] args) {
        // TODO code application logic here
    Arbol ar=new Arbol(23);
    Nodo nuevo=new Nodo(14);
    ar.agregar(nuevo,ar.getRaiz());
    ar.recorrerPreorden(ar.getRaiz());
    }
    
}
