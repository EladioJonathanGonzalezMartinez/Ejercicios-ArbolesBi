
package Parte_2_ejercicio_13_12;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Parte213_1 {

    public static void main(String[] args) { 
     Arbol ar = null;
     Nodo nuevo = new  Nodo(32);
    ar.agregar(nuevo,ar.getRaiz());
        String Nom;
        Nom=JOptionPane.showInputDialog("Ingresa el Nombre: ");
        System.out.println("Los Datos ingresados son:"+"\n Nombre: "+Nom);
      int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato que deseas buscar"));
                if(ar.buscar(elemento)==null){
                    System.out.println("El nodo "+elemento+" no se encuentra");
                }else{
                    System.out.println("Nodo encontrado, dato: "+ar.buscar(elemento));
                }
}

    }