/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_TALLAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int talla;
      Scanner input = new Scanner(System.in);
      System.out.println("escriba su talla ");
      talla = input.nextInt();
      
      switch (talla){
         case 30:
                 System.out.println("Pequeña");
            break;
         case 43:
                 System.out.println("Mediana");  
            break;
         case 45:
                 System.out.println("Largo");  
            break;  
         case 49:
                 System.out.println("xlargo");  
            break;
         default:
            System.out.println("la talla " + talla + " no es valida");
         
        
      }
   }
   
}
