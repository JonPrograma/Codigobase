/*

 */
package A_Orientada_a_objetos;


/**
 *
 * @author ooku
 */

import java.lang.Object;



 public class A2_Clases {
  //que es una clase 
     
     /*En el mundo real, a menudo encontrarás muchos objetos individuales del mismo tipo. 
     Puede haber miles de otras bicicletas en existencia, todas de la misma marca y modelo. 
     Cada bicicleta se construyó a partir del mismo conjunto de planos y, por lo tanto, 
     contiene los mismos componentes. En términos orientados a objetos, decimos que su bicicleta 
     es una instancia de la clase de objetos conocidos como bicicletas. 
     Una clase es el plano a partir del cual se crean los objetos individuales.*/
     class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
     /*La sintaxis del lenguaje de programación Java le parecerá nueva,
     pero el diseño de esta clase se basa en el análisis anterior de los objetos de bicicleta. 
     Los campos cadencia, velocidad y engranaje representan el estado del objeto, y los métodos 
     (changeCadence, changeGear, speedUp, etc.) definen su interacción con el mundo exterior.

    Es posible que hayas notado que la clase de Bicicletas no contiene un método principal.
     Eso es porque no es una aplicación completa; es solo el modelo para las bicicletas 
     que se pueden usar en una aplicación. La responsabilidad de crear y utilizar nuevos objetos 
     de Bicycle pertenece a alguna otra clase en su aplicación.

    Aquí hay una clase BicycleDemo que crea dos objetos Bicycle separados e invoca sus métodos:
     
     */
   // Ver ejemplos en la archivo Bicycledemo
     
     
 }


