/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String carrera;
      Scanner input = new Scanner(System.in);
      System.out.println("Introduce las iniciales de las carrera en la que te encuentras");
      carrera = input.nextLine();
      switch(carrera){
         case "ISC":
            System.out.println("Ingenieria en sistemas computacionales");
            break;
         case "INF":
            System.out.println("Informatica");
            break;
         case "LA":
            System.out.println("licenciatura en administración");
            break;
         case "ARQ":
            System.out.println("Arquitectura");
            break;
         case "IND":
            System.out.println("Ingenieria industrial");
            break;
         case "IDI":
            System.out.println("Ingenieria en diseño industrial");
            break;
         case "IGE":
            System.out.println("Ingenieria en gestion empresarial");
            break;
         default:
            System.out.println("LAS INICIALES " + carrera + " NO SON VALIDAS");
      }
      
   }
   
}
