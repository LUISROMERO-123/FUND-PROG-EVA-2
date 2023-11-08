/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_27_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_27_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaramos un arreglo que almacena 10 enteros 
        //acceso a los arreglos es aleatorio
        //se accede a los valores a través de un INDICE
        //los valores almacenados tienen una dirección;
        //el primer elemento esta en la posición 0
        // el ultio en la posicion n - 1, donde N es el tamaño del arreglo
        int[] arregloEnteros = new int[10];
        //acceder valores en un arreglo;
        arregloEnteros[0] = 100;
        arregloEnteros[1] = 200;
        arregloEnteros[2] = 300;
        arregloEnteros[3] = 400;
        arregloEnteros[4] = 500;
        arregloEnteros[5] = 600;
        arregloEnteros[6] = 700;
        arregloEnteros[7] = 800;
        arregloEnteros[8] = 900;
        arregloEnteros[9] = 1000;
        
        System.out.println("Valor en posición 0; " + arregloEnteros[0]);
        
        String[] arregloCade = new String[5];
        arregloCade[0] = "Hola";
        arregloCade[1] = " ";
        arregloCade[2] = "Mundo";
        arregloCade[3] = " ";
        arregloCade[4] = "bonito";
        
        
        int[] arreglo = {5, 4, 3, 2, 1};
        System.out.println("posición de arreglo[4]:" + arreglo[3]);
      
        
    }
    
}
