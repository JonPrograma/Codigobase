
package B_básicos_de_lenguaje;

/**
 *
 * @author ooku
 */
public class B3_Expresiones_Declaraciones_Bloques {
    //Expresiones, declaraciones y bloques  "Expressions, Statements, and Blocks"
    
    /*Ahora que comprende las variables y los operadores, es hora de aprender sobre expresiones, 
    declaraciones y bloques. Los operadores pueden usarse en la construcción de expresiones, 
    que computan valores; Las expresiones son los componentes centrales de las declaraciones;
    Las declaraciones se pueden agrupar en bloques.*/
    
    
    //Expressions

    /*Una expresión es un constructo compuesto de variables, operadores e invocaciones de métodos,
    que se construyen de acuerdo con la sintaxis del lenguaje, que se evalúa en un solo valor. 
    Ya has visto ejemplos de expresiones, ilustradas en negrita a continuación:*/
    
    class ejem1{
        void ka(){
            int cadence = 0;
            int[] anArray = null;
            
            anArray[0] = 100;
            System.out.println("Element 1 at index 0: " + anArray[0]);

            int result = 1 + 2; // result is now 3
            boolean value1 = false;
            boolean value2 = false;
            if (value1 == value2) 
            System.out.println("value1 == value2");
        }
    }
    /*El tipo de datos del valor devuelto por una expresión depende de los elementos utilizados 
    en la expresión. La expresión cadencia = 0 devuelve un int porque el operador de 
    asignación devuelve un valor del mismo tipo de datos que su operando de la izquierda; 
    En este caso, la cadencia es un int. Como puede ver en las otras expresiones, 
    una expresión también puede devolver otros tipos de valores, como boolean o String.*/
    
    /*El lenguaje de programación Java le permite construir expresiones compuestas de varias 
    expresiones más pequeñas siempre que el tipo de datos requerido por una parte de la expresión 
    coincida con el tipo de datos de la otra. Aquí hay un ejemplo de una expresión compuesta:*/
    
    //1 * 2 * 3
    
    /*En este ejemplo particular, el orden en que se evalúa la expresión no es importante 
    porque el resultado de la multiplicación es independiente del orden; 
    El resultado es siempre el mismo, no importa en qué orden apliques las multiplicaciones. 
    Sin embargo, esto no es cierto para todas las expresiones. Por ejemplo, 
    la siguiente expresión da resultados diferentes, dependiendo de si primero realiza la suma o 
    la operación de división:*/
    
    //x + y / 100    // ambiguous
    
    /*Puede especificar exactamente cómo se evaluará una expresión usando paréntesis equilibrados: (y). 
    Por ejemplo, para hacer que la expresión anterior sea inequívoca, puede escribir lo siguiente:*/
    
    //(x + y) / 100  // unambiguous, recommended
    
    /*Si no indica explícitamente el orden en el que se realizan las operaciones, 
    el orden está determinado por la prioridad asignada a los operadores en uso dentro de la expresión. 
    Los operadores que tienen una mayor prioridad son evaluados primero. 
    Por ejemplo, el operador de división tiene una prioridad más alta que el operador de suma. 
    Por lo tanto, las siguientes dos afirmaciones son equivalentes:*/
        
    //x + y / 100 
    //x + (y / 100) // unambiguous, recommended
    
    /*Al escribir expresiones compuestas, sea explícito e indique con paréntesis qué operadores 
    deben evaluarse primero. Esta práctica hace que el código sea más fácil de leer y mantener.*/

    //Declaraciones "Statements"
    /*Las declaraciones son aproximadamente equivalentes a oraciones en lenguajes naturales. 
    Una declaración forma una unidad completa de ejecución. 
    Los siguientes tipos de expresiones se pueden convertir en una declaración terminando la expresión 
    con un punto y coma (;).*/
    /*
    Assignment expressions
    Any use of ++ or --
    Method invocations
    Object creation expressions*/
    
    /*Tales declaraciones se llaman declaraciones de expresión. 
    Aquí hay algunos ejemplos de expresiones de expresión.*/
    class ab{
        void ka(){
            // assignment statement
            double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Bicycle myBike = new Bicycle();
        }
    }
    class Bicycle {}
    
    /*Además de las declaraciones de expresión, hay otros dos tipos de declaraciones: 
    declaraciones de declaración y declaraciones de flujo de control. 
    Una declaración de declaración declara una variable. 
    Ya has visto muchos ejemplos de declaraciones de declaración:*/
    
    class ac{
        void ka(){
            // declaration statement
            double aValue = 8933.234;
        }
    }
    /*Finalmente, las declaraciones de flujo de control regulan el orden en que se ejecutan las declaraciones. 
    Aprenderá sobre las declaraciones de flujo de control en la siguiente sección, 
    Declaraciones de flujo de control*/
    
    //Blocks
    
    /*Un bloque es un grupo de cero o más declaraciones entre llaves equilibradas y 
    se puede usar en cualquier lugar donde se permita una sola instrucción. 
    El siguiente ejemplo, BlockDemo, ilustra el uso de bloques:*/
    
    class BlockDemo {
     public  void main(String[] args) {
          boolean condition = true;
          if (condition) { // begin block 1
               System.out.println("Condition is true.");
          } // end block one
          else { // begin block 2
               System.out.println("Condition is false.");
          } // end block 2
     }
}
    
}
