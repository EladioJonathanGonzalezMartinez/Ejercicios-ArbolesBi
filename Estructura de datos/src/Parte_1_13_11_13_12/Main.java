
package Parte_1_13_11_13_12;

public class Main {

    public static void main(String[] args) {
        
       int[] a=new int[10];
       for(int i=0;i<=9;i++)
           a[i]=(int)(Math.random()*50);
       Arbol x = new Arbol();
       for(int i=0;i<10;i++)
           x.alta(a[i]);
       System.out.println("Los datos son: ");
       x.imprimir();
       System.out.println("\nEl numero mayor es: ");
       x.mayor();
       
       //EJERCICIO 13.11
       
       System.out.println("La suma de los numeros de la Izquierda es: ");
       x.sumaizquierda();
       System.out.println("La suma de los numeros de la Derecha es: ");
       x.sumaderecha();
   
       //EJERCICIO 13.12
          System.out.println("Cantidad de nodos hoja: "+x.cantidadNodosHoja());
    }
    
}
