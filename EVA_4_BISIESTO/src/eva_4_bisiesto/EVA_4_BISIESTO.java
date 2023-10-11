/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_4_bisiesto;

/**
 *
 * @author invitado
 */
public class EVA_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        
        Scaner input = new Scaner(System.in);
        System.out.println("Introduce el año a evaluar");
        year = input.nextInt();
        
        residuo = year % 4;
        if (residuo == 0){//verdad: el año es divisible entre 4
            residuo = year % 100;
            if(residuo == 0) {//verdad: el año es divisible entre 100
                residuo = year % 400;
                if(residuo == 0)//verdad:el año es disible entre 400
                    System.out.println("es año bisiesto");
               
            }
            }else System.out.println("NO ES AÑO BISIESTO");
    }
    
}
