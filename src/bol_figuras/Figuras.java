/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_figuras;

/**
 *
 * @author Josemolamazo
 */
public class Figuras {

    public void Triangulo() {
        int max = 10;
        int base = 0, altura = 0;

        for (base = 1; base <= max; base++) {

            for (altura = 0; altura < base; altura++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
        public void Piramide(){
       
        int numFilas=10;
 
        for(int altura = 1; altura<=numFilas; altura++){

            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

