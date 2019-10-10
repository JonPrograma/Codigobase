/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Orientada_a_objetos;

/**
 *
 * @author ooku
 */
public  interface A4_Interface {
    /*
    Como ya aprendió, los objetos definen su interacción con el mundo exterior a 
    través de los métodos que exponen. Los métodos forman la interfaz del objeto con el 
    mundo exterior; Los botones en la parte frontal de su televisor, por ejemplo, 
    son la interfaz entre usted y el cableado eléctrico en el otro lado de su carcasa de plástico. 
    Presiona el botón "Encendido" para encender y apagar el televisor.*/
    /*En su forma más común, una interfaz es un grupo de métodos relacionados con cuerpos vacíos.
    El comportamiento de una bicicleta, si se especifica como una interfaz, puede aparecer como sigue:*/
    
    interface Bicycle {
        
    // revoluciones de la rueda por minuto
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
    }
 /*Para implementar esta interfaz, el nombre de su clase cambiaría (a una marca particular de bicicleta,
    por ejemplo, como ACMEBicycle), y usaría la palabra clave implementa en la declaración de la clase:*/
   public class ACMEBicycle implements  A4_Interface{

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    /* El compilador ahora requerirá que los métodos
     changeCadence, changeGear, speedUp, y applyBrakes
     todos serán implementados. La compilación fallará si esos
     faltan métodos de esta clase.*/

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
    
    /*implementar una interfaz permite que una clase se vuelva más formal sobre el comportamiento que 
    promete proporcionar. Las interfaces forman un contrato entre la clase y el mundo exterior, 
    y este contrato se aplica en el momento de la compilación por parte del compilador. 
    Si tu clase pretende implementar una interfaz, Todos los métodos.*/
    
   
    
}
    