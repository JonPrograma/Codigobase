
package B_básicos_de_lenguaje;

/**
 *
 * @author ooku
 */
public class B2_Operadores {
    //Operadores 
    
    /*Ahora que ha aprendido cómo declarar e inicializar variables, 
    es probable que desee saber cómo hacer algo con ellas. 
    Aprender los operadores del lenguaje de programación Java es un buen lugar para comenzar. 
    Los operadores son símbolos especiales que realizan operaciones específicas en uno, 
    dos o tres operandos y luego devuelven un resultado.*/
    
    /*A medida que exploramos los operadores del lenguaje de programación Java, 
    puede ser útil para usted saber de antemano qué operadores tienen la mayor prioridad. 
    Los operadores de la siguiente tabla se enumeran según el orden de prioridad. 
    Cuanto más cerca de la parte superior de la tabla aparece un operador, 
    mayor es su prioridad. Los operadores con mayor prioridad se evalúan antes 
    que los operadores con una prioridad relativamente menor. 
    Los operadores en la misma línea tienen la misma prioridad. 
    Cuando los operadores de igual precedencia aparecen en la misma expresión,
    debe gobernar una regla que se evalúa primero. Todos los operadores binarios, 
    excepto los operadores de asignación, se evalúan de izquierda a derecha; 
    Los operadores de asignación se evalúan de derecha a izquierda.*/
    
    
    /*          Operator Precedence
        Operators           Precedence
        postfix             expr++ expr--
        unary               ++expr --expr +expr -expr ~ !
        multiplicative      * / %
        additive            + -
        shift               << >> >>>
        relational          < > <= >= instanceof
        equality            == !=
        bitwise AND         &
        bitwise exclusiveOR     ^
        bitwise inclusiveOR	|
        logical AND         &&
        logical OR          ||
        ternary             ? :
        assignment          = += -= *= /= %= &= ^= |= <<= >>= >>>=
    */
    
    /*En la programación de propósito general, ciertos operadores tienden a aparecer más 
    frecuentemente que otros; por ejemplo, el operador de asignación "=" es mucho más común 
    que el operador de desplazamiento a la derecha sin signo ">>>". Teniendo esto en cuenta,
    la siguiente discusión se enfoca primero en los operadores que es más probable que utilicen 
    de manera regular, y termina enfocándose en aquellos que son menos comunes.
    Cada discusión va acompañada de un código de ejemplo que puede compilar y ejecutar. 
    Estudiar su producción ayudará a reforzar lo que acaba de aprender.*/
    
    //Asignación, aritmética y operadores unarios. "Assignment, Arithmetic, and Unary Operators"
    
    //El operador de asignación simple "The Simple Assignment Operator"
    /*Uno de los operadores más comunes que encontrará es el operador de asignación simple "=". 
    Usted vio a este operador en la clase de bicicletas; 
    asigna el valor a su derecha al operando a su izquierda:*/
     int cadence = 0;
     int speed = 0;
     int gear = 1;
     
     //Este operador también se puede usar en objetos para asignar referencias a objetos, 
     //como se explica en Crear objetos.
     
     
     //Los operadores aritméticos "The Arithmetic Operators"
     
     /*El lenguaje de programación Java proporciona operadores que realizan sumas, 
     restas, multiplicaciones y divisiones. Hay una buena posibilidad de que los 
     reconozca por sus contrapartes en matemáticas básicas. El único símbolo que 
     podría parecerle nuevo es "%", que divide un operando por otro y devuelve el resto como resultado.*/
     
     /*
     Operator	Description
    +           Additive operator (also used for String concatenation)
    -           Subtraction operator
    *           Multiplication operator
    /           Division operator
    %           Remainder operator
     
     */
     
     //El siguiente programa, ArithmeticDemo, prueba los operadores aritméticos.

    public static void main (String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
    }

     //Este programa imprime lo siguiente:
    /*
    1 + 2 = 3
    3 - 1 = 2
    2 * 2 = 4
    4 / 2 = 2
    2 + 8 = 10
    10 % 7 = 3
    */
    /*También puede combinar los operadores aritméticos con el operador de asignación 
    simple para crear asignaciones compuestas. Por ejemplo, x + = 1; y x = x + 1; 
    ambos incrementan el valor de x en 1.*/
    
    /*El operador + también se puede utilizar para concatenar (unir) dos cadenas juntas, 
    como se muestra en el siguiente programa ConcatDemo:*/
    
    class ConcatDemo {
    public  void main(String[] args){
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
    }
}
    /*Al final de este programa, la variable thirdString contiene "Esta es una cadena concatenada", 
    que se imprime en la salida estándar.*/
    
    //Los Operadores Unarios "The Unary Operators"
    
    /*Los operadores unarios requieren solo un operando; realizan varias operaciones, 
    como aumentar / disminuir un valor en uno, negar una expresión o invertir el valor de un booleano.*/
    
    /*
    Operator	Description
    +           Unary plus operator; indicates positive value (numbers are positive without this, however)
    -           Unary minus operator; negates an expression
    ++          Increment operator; increments a value by 1
    --          Decrement operator; decrements a value by 1
    !           Logical complement operator; inverts the value of a boolean*/
    
    //El siguiente programa, UnaryDemo, prueba los operadores unarios:
    
    class UnaryDemo {

    public  void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}
     /*Los operadores de incremento / decremento pueden aplicarse antes (prefijo) o después 
    (postfix) del operando. El resultado del código ++; y ++ resultado; ambos terminarán 
    en un resultado incrementado en uno. La única diferencia es que la versión del prefijo 
    (resultado de ++) se evalúa al valor incrementado, mientras que la versión de postfix 
    (resultado ++) se evalúa al valor original. Si solo está realizando un incremento / decremento simple, 
    no importa qué versión elija. Pero si usa este operador en parte de una expresión más grande, 
    el que elija puede hacer una diferencia significativa.*/
    
    //El siguiente programa, PrePostDemo, ilustra el operador de incremento unario de prefijo / postfijo:
    
    class PrePostDemo {
    public  void main(String[] args){
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;			   
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
    }
}
    
    //Operadores de igualdad, relacionales y condicionales "Equality, Relational, and Conditional Operators"
    
    //La igualdad y los operadores relacionales "The Equality and Relational Operators"
    
    /*La igualdad y los operadores relacionales determinan si un operando es mayor que, 
    menor que, igual o no igual a otro operando. La mayoría de estos operadores probablemente 
    le resultarán familiares también. Tenga en cuenta que debe usar "==", no "=", 
    al probar si dos valores primitivos son iguales.*/
    
    /*
    ==      equal to
    !=      not equal to
    >       greater than
    >=      greater than or equal to
    <       less than
    <=      less than or equal to
    */
    
    //El siguiente programa, ComparisonDemo, prueba los operadores de comparación:
    class ComparisonDemo {

    public void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}
   //Salida:
    /*
    value1 != value2
    value1 <  value2
    value1 <= value2
    */
    //Los operadores condicionales "The Conditional Operators"
    
    /*El && y || los operadores realizan operaciones condicionales AND y condicionales OR en dos
    expresiones booleanas. Estos operadores muestran un comportamiento de "cortocircuito", 
    lo que significa que el segundo operando se evalúa solo si es necesario.*/
    
    /*
    && Conditional-AND
    || Conditional-OR
    */
    //El siguiente programa, ConditionalDemo1, prueba estos operadores:
    
    class ConditionalDemo1 {

    public  void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
    /*Otro operador condicional es?:, Que se puede considerar como una forma abreviada 
    de una sentencia if-then-else (que se describe en la sección Declaraciones de 
    flujo de control de esta lección). Este operador también se conoce como el operador 
    ternario porque utiliza tres operandos. En el siguiente ejemplo, 
    este operador debe leerse como: "Si alguna condición es verdadera, 
    asigne el valor de value1 al resultado. De lo contrario, 
    asigne el valor de value2 al resultado".*/
    
    //El siguiente programa, ConditionalDemo2, prueba el operador?:
    
    class ConditionalDemo2 {

    public  void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
    /*Debido a que alguna condición es cierta, este programa imprime "1" en la pantalla. 
    Use el operador?: En lugar de una instrucción if-then-else si hace que su código sea más legible; 
    por ejemplo, cuando las expresiones son compactas y sin efectos secundarios (como las asignaciones).*/
    
    //El operador de comparación de tipos "The Type Comparison Operator instanceof" 
    
    /*El operador instanceof compara un objeto con un tipo especificado.  
    Puede usarlo para probar si un objeto es una instancia de una clase, 
    una instancia de una subclase o una instancia de una clase que implementa una interfaz particular.*/
    
    /*El siguiente programa, InstanceofDemo, define una clase principal (denominada principal), 
    una interfaz simple (denominada MyInterface) y una clase secundaria 
    (denominada secundaria) que hereda de la principal e implementa la interfaz.*/
    
    class InstanceofDemo {
    public  void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}


//salida:
/*
obj1 instanceof Parent: true
obj1 instanceof Child: false
obj1 instanceof MyInterface: false
obj2 instanceof Parent: true
obj2 instanceof Child: true
obj2 instanceof MyInterface: true*/

    //Cuando utilice el operador instanceof, tenga en cuenta que null no es una instancia de nada.
    //Operadores Bitwise y Bit Shift "Bitwise and Bit Shift Operators"
    
    /*El lenguaje de programación Java también proporciona operadores que 
    realizan operaciones de cambio de bits y bits en tipos integrales. 
    Los operadores discutidos en esta sección son menos utilizados. 
    Por lo tanto, su cobertura es breve; 
    la intención es simplemente hacerle saber que estos operadores existen.*/
    
    /*El operador de complemento de bit a bit unario "~" invierte un patrón de bits; 
    se puede aplicar a cualquiera de los tipos integrales, haciendo que cada "0" 
    sea un "1" y cada "1" un "0". Por ejemplo, un byte contiene 8 bits; 
    la aplicación de este operador a un valor cuyo patrón de bits es "00000000" 
    cambiaría su patrón a "11111111".
    */
    
    /*El operador de desplazamiento a la izquierda con signo "<<" desplaza un patrón de bits a la izquierda, 
    y el operador de desplazamiento a la derecha con signo ">>" desplaza un patrón de bits a la derecha. 
    El patrón de bits viene dado por el operando de la izquierda, 
    y el número de posiciones a desplazar por el operando de la derecha. 
    El operador de cambio a la derecha sin signo ">>>" desplaza un cero a la posición más a la izquierda, 
    mientras que la posición más a la izquierda después de ">>" depende de la extensión de la señal.
    */
    
    /*El operador bitwise & realiza una operación AND bitwise.

El operador bitwise ^ realiza una operación OR exclusiva bitwise.

El bitwise | el operador realiza una operación OR inclusiva a nivel de bits.

El siguiente programa, BitDemo, utiliza el operador AND a nivel de bits para imprimir 
el número "2" en la salida estándar.*/

class BitDemo {
    public  void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}
        //Resumen de los operadores "Summary of Operators"
    
    /*La siguiente referencia rápida resume los operadores admitidos por el lenguaje de programación Java*/
    
    /*
    Operador de Asignación Simple "Simple Assignment Operator "
    =       Simple assignment operator
    
    Operadores aritméticos "Arithmetic Operators"
    +       Additive operator (also used for String concatenation)
    -       Subtraction operator
    *       Multiplication operator
    /       Division operator
    %       Remainder operator
    
    Operadores Unarios "Unary Operators"
    +       Unary plus operator; indicates positive value (numbers are positive without this, however)
    -       Unary minus operator; negates an expression
    ++      Increment operator; increments a value by 1
    --      Decrement operator; decrements a value by 1
    !       Logical complement operator; inverts the value of a boolean
    
    Operadores de igualdad y relacionales "Equality and Relational Operators"
    ==      Equal to
    !=      Not equal to
    >       Greater than
    >=      Greater than or equal to
    <       Less than
    <=      Less than or equal to
    
    
    Operadores Condicionales"Conditional Operators"
    &&      Conditional-AND
    ||      Conditional-OR
    ?:      Ternary (shorthand for if-then-else statement)
    
    
    Operador de comparación de tipos "Type Comparison Operator"
    instanceof      Compares an object to a specified type 
    
    
    Operadores Bitwise y Bit Shift "Bitwise and Bit Shift Operators"
    ~       Unary bitwise complement
    <<      Signed left shift
    >>      Signed right shift
    >>>     Unsigned right shift
    &       Bitwise AND
    ^       Bitwise exclusive OR
    |       Bitwise inclusive OR
    */
    
    

}
