
package B_básicos_de_lenguaje;

/**
 *
 * @author ooku
 */
public class B4_Declaraciones_de_flujo_de_control {
    //Declaraciones de flujo de control "Control Flow Statements"
    
    /*Las declaraciones dentro de sus archivos de origen generalmente se ejecutan de arriba a abajo, 
    en el orden en que aparecen. Sin embargo, las declaraciones de flujo de control dividen el 
    flujo de ejecución al emplear la toma de decisiones, el bucle y la bifurcación, 
    lo que permite que su programa ejecute condicionalmente bloques de código. 
    Esta sección describe las declaraciones de toma de decisiones (if-then, if-then-else, switch), 
    las sentencias de bucle (for, while, do-while) y las sentencias de bifurcación (break, continue, return)
    admitidas por Java lenguaje de programación.*/
    
    
    //Las declaraciones if-then y if-then-else "The if-then and if-then-else Statements"
    
    //The if-then Statement
    
    /*La instrucción if-then es la más básica de todas las declaraciones de flujo de control. 
    Le dice a su programa que ejecute una determinada sección de código solo si una prueba en 
    particular se evalúa como verdadera. Por ejemplo, 
    la clase Bicicletas podría permitir que los frenos disminuyan la velocidad de la bicicleta 
    solo si la bicicleta ya está en movimiento. 
    Una posible implementación del método applyBrakes podría ser la siguiente:*/
    
    class a{
        void applyBrakes() {
            boolean isMoving = false;
    // the "if" clause: bicycle must be moving
        if (isMoving){ 
                int currentSpeed = 0;
        // the "then" clause: decrease current speed
        currentSpeed--;
    }
}
    }
    /*Si esta prueba se evalúa como falsa (lo que significa que la bicicleta no está en movimiento), 
    el control salta al final de la instrucción if-then.*/
    
    /*Además, las llaves de apertura y cierre son opcionales, siempre que la cláusula "entonces" contenga 
    solo una declaración:*/
    class ab{
        void applyBrakes() {
            boolean isMoving = false;
            int currentSpeed = 0;
        // same as above, but without braces 
        if (isMoving)
            currentSpeed--;
    }
    }
    /*Decidir cuándo omitir las llaves es una cuestión de gusto personal. 
    Omitirlos puede hacer que el código sea más frágil. 
    Si luego se agrega una segunda declaración a la cláusula "entonces", 
    un error común sería olvidar agregar las llaves recién requeridas. 
    El compilador no puede atrapar este tipo de error; simplemente obtendrás los resultados equivocados*/
    
    
    //The if-then-else Statement
    
    /*La instrucción if-then-else proporciona una ruta secundaria de ejecución 
    cuando una cláusula "if" se evalúa como falsa. 
    Puede usar una instrucción if-then-else en el método applyBrakes para realizar alguna acción 
    si se aplican los frenos cuando la bicicleta no está en movimiento. 
    En este caso, la acción es simplemente imprimir un mensaje de error que indica que la bicicleta 
    ya se ha detenido.*/
    
    class ac{
    
        void applyBrakes() {
            boolean isMoving = false;
    if (isMoving) {
                int currentSpeed = 0;
        currentSpeed--;
    } else {
        System.err.println("The bicycle has already stopped!");
    } 
}
    }
    
    /*El siguiente programa, IfElseDemo, asigna una calificación basada en el valor 
    de un puntaje de prueba: una A para un puntaje de 90% o más,
    una B para un puntaje de 80% o más, y así sucesivamente.*/
    
    class IfElseDemo {
    public  void main(String[] args) {
           
        
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
    }
    
    //La salida del programa es:
    //    Grade = C

    /*Es posible que haya notado que el valor de testscore puede satisfacer más de una 
    expresión en la declaración compuesta: 76> = 70 y 76> = 60. Sin embargo, 
    una vez que se cumple una condición, se ejecutan las declaraciones apropiadas (grado = 'C'; )
    y las condiciones restantes no son evaluadas.*/
    
    //La declaración de cambio "The switch Statement"
    
    /*A diferencia de las sentencias if-then y if-then-else, 
    la sentencia switch puede tener una cantidad de rutas de ejecución posibles. 
    Un conmutador funciona con los tipos de datos primarios byte, short, char e int.
    También funciona con los tipos enumerados (descritos en los Tipos Enum), 
    la clase String y algunas clases especiales que envuelven ciertos tipos primitivos: caracteres, 
    bytes, cortos y enteros (descritos en Números y cadenas).*/
    
    /*El siguiente ejemplo de código, SwitchDemo, declara un mes con nombre int cuyo valor representa un mes.
    El código muestra el nombre del mes, en función del valor del mes, utilizando la instrucción switch.*/
    
    public class SwitchDemo {
    public  void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}
    //En este caso, agosto se imprime a la salida estándar.
    
    /*El cuerpo de una instrucción switch se conoce como un bloque switch.
    Una declaración en el bloque de conmutación se puede etiquetar con una o más etiquetas 
    de caso o predeterminadas. La instrucción switch evalúa su expresión, 
    luego ejecuta todas las declaraciones que siguen la etiqueta de caso correspondiente.*/
    
    //También puede mostrar el nombre del mes con las declaraciones if-then-else:
    class abc{
    
        void a(){
        
            int month = 8;
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
}
        }
    }
    
    /*Decidir si usar sentencias if-then-else o una sentencia de cambio se basa en la
    legibilidad y la expresión que la sentencia está probando. 
    Una instrucción if-then-else puede probar expresiones basadas en rangos de valores o condiciones, 
    mientras que una instrucción switch evalúa expresiones basadas solo en un solo entero,
    valor enumerado u objeto String.*/
    
    /*Otro punto de interés es la declaración de ruptura.
    Cada instrucción de interrupción termina la instrucción de conmutación adjunta. 
    El flujo de control continúa con la primera instrucción que sigue al bloque de conmutación. 
    Las sentencias de ruptura son necesarias porque sin ellas, 
    las sentencias en bloques de conmutación no coinciden: todas las sentencias después 
    de la etiqueta de caso coincidente se ejecutan en secuencia,
    independientemente de la expresión de las etiquetas de caja subsiguientes, 
    hasta que se encuentra una sentencia de ruptura. 
    El programa SwitchDemoFallThrough muestra sentencias en un bloque de interruptores que se desploman. 
    El programa muestra el mes correspondiente al mes entero y los meses que siguen en el año:*/
    
    public class SwitchDemoFallThrough {

    public void main(String[] args) {
        java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    }
}
    //Esta es la salida del código:
    /*
    August
    September
    October
    November
    December
    */
    
    /*Técnicamente, la ruptura final no es necesaria porque el flujo cae fuera de 
    la declaración de conmutación. Se recomienda usar una pausa para que la modificación del 
    código sea más fácil y menos propensa a errores. 
    La sección predeterminada maneja todos los valores que no son manejados explícitamente por una de 
    las secciones de casos.*/
    
    class SwitchDemo2 {
    public  void main(String[] args) {

        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);
    }
}
    
    //This is the output from the code:

    //Number of Days = 29

    
    //Uso de cadenas en las instrucciones switch "Using Strings in switch Statements"
    
    /*En Java SE 7 y versiones posteriores, puede usar un objeto String 
    en la expresión de la instrucción switch. El siguiente ejemplo de código, 
    StringSwitchDemo, muestra el número del mes en función del valor del mes llamado String:*/

    
    public class StringSwitchDemo {

    public  int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default: 
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    
    
}

    
//    public  void main(String[] args) {
//
//        String month = "August";
//
//        //int returnedMonthNumber =
//           // StringSwitchDemo.getMonthNumber(month);
//
//        if (returnedMonthNumber == 0) {
//            System.out.println("Invalid month");
//        } else {
//            System.out.println(returnedMonthNumber);
//        }
//    }
    
    //La salida de este código es 8.
    
    /*La cadena en la expresión de cambio se compara con las expresiones asociadas con cada etiqueta 
    de caso como si se estuviera utilizando el método String.equals. 
    Para que el ejemplo de StringSwitchDemo acepte cualquier mes independientemente del caso, 
    el mes se convierte en minúsculas (con el método toLowerCase), 
    y todas las cadenas asociadas con las etiquetas de los casos están en minúsculas.*/
    
    /*Nota: este ejemplo comprueba si la expresión en la instrucción de cambio es nula.}
    Asegúrese de que la expresión en cualquier instrucción de cambio no sea nula para evitar que 
    se lance una NullPointerException.*/
    
    //Las declaraciones while y do-while "The while and do-while Statements"
    
    /*La instrucción while continuamente ejecuta un bloque de declaraciones mientras que una 
    condición particular es verdadera. Su sintaxis se puede expresar como:*/
    
    /*while (expression) {
     statement(s)
    }   */
    
    /*La instrucción while evalúa la expresión, que debe devolver un valor booleano. 
    Si la expresión se evalúa como verdadera, 
    la instrucción while ejecuta la (s) declaración (es) en el bloque while. 
    La instrucción while continúa probando la expresión y ejecutando su bloque hasta que 
    la expresión se evalúa como falsa. El uso de la instrucción while 
    para imprimir los valores del 1 al 10 se puede lograr como en el siguiente programa WhileDemo:*/
    
    class WhileDemo {
    public  void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
    
    //Puede implementar un bucle infinito utilizando la instrucción while de la siguiente manera:
    
    /*while (true){
    // your code goes here
}*/
    
    /*El lenguaje de programación Java también proporciona una declaración de do-while, 
    que se puede expresar de la siguiente manera:*/
    
    /*
    do {
     statement(s)
} while (expression);
    */
    
    /*La diferencia entre do-while y while es que do-while evalúa su expresión en 
    la parte inferior del bucle en lugar de la parte superior. 
    Por lo tanto, las declaraciones dentro del bloque do siempre se ejecutan al menos una vez, 
    como se muestra en el siguiente programa DoWhileDemo:*/
    
    
    class DoWhileDemo {
    public  void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
    //The for Statement
    
    /*La instrucción for proporciona una forma compacta de iterar sobre un rango de valores. 
    Los programadores a menudo se refieren a él como el "bucle for" debido a la forma en que 
    se repite repetidamente hasta que se cumple una condición particular. 
    La forma general de la declaración for se puede expresar de la siguiente manera:*/
    
    /*for (initialization; termination;
     increment) {
    statement(s)
}*/
    
    //Cuando use esta versión de la declaración for, tenga en cuenta que:
    
    /*
    La expresión de inicialización inicializa el bucle; Se ejecuta una vez, como comienza el bucle.
    Cuando la expresión de terminación se evalúa como falsa, el bucle termina.
    La expresión de incremento se invoca después de cada iteración a través del bucle; 
    es perfectamente aceptable que esta expresión incremente o disminuya un valor.*/
    
    /*El siguiente programa, ForDemo, usa la forma general de la declaración for para imprimir 
    los números del 1 al 10 en la salida estándar:*/
    
    class ForDemo {
    public  void main(String[] args){
         for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }
    }
}
    //La salida de este programa es:
    
    /*Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10*/
    
    /*Observe cómo el código declara una variable dentro de la expresión de inicialización. 
    El alcance de esta variable se extiende desde su declaración hasta el final del bloque gobernado 
    por la instrucción for, por lo que también se puede usar en las expresiones de terminación e incremento.
    Si la variable que controla una instrucción for no es necesaria fuera del bucle, 
    es mejor declarar la variable en la expresión de inicialización. 
    Los nombres i, j y k se usan a menudo para controlar los bucles; 
    declararlos dentro de la expresión de inicialización limita su vida útil y reduce los errores.*/
    
  //Las tres expresiones del bucle for son opcionales; Un bucle infinito se puede crear de la siguiente manera:
  
    
    
    /*// infinite loop
for ( ; ; ) {
    
    // your code goes here
}*/
    
    /*La declaración for también tiene otro formulario diseñado para iteración a 
    través de colecciones y matrices. 
    A este formulario a veces se le conoce como la declaración mejorada y se puede 
    usar para hacer que sus bucles sean más compactos y fáciles de leer. 
    Para demostrarlo, considere la siguiente matriz, que contiene los números del 1 al 10:*/
    
    class acb{
        void ka(){
            int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        }
    }
    
    /*El siguiente programa, EnhancedForDemo, usa el comando for mejorado para recorrer la matriz:*/
    
    class EnhancedForDemo {
    public  void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
}
    /*En este ejemplo, el elemento variable contiene el valor actual de la matriz de números.
    La salida de este programa es la misma que antes:*/
    
    /*Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10*/
    
    /*Recomendamos utilizar este formulario de la declaración for en lugar del formulario general 
    siempre que sea posible.*/
    
    
    
    //Branching Statements
    //The break Statement
    
    /*La declaración de ruptura tiene dos formas: etiquetada y sin etiqueta. 
    Usted vio la forma sin etiqueta en la discusión anterior de la declaración de cambio. 
    También puede usar un salto sin etiqueta para terminar un ciclo for, while o do-while, 
    como se muestra en el siguiente programa BreakDemo:*/
    
    class BreakDemo {
    public  void main(String[] args) {

        int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
    
    /*Este programa busca el número 12 en una matriz. La declaración de ruptura, 
    que se muestra en negrita, termina el bucle for cuando se encuentra ese valor. 
    El flujo de control luego se transfiere a la instrucción después del bucle for. 
    La salida de este programa es:*/
    //12 encontrados en el índice 4 //Found 12 at index 4
    
    /*Una instrucción break sin etiqueta termina el interruptor más interno, para, while o do-while, 
    pero una ruptura etiquetada termina con una declaración externa.
    El siguiente programa, BreakWithLabelDemo, es similar al programa anterior, 
    pero utiliza bucles anidados para buscar un valor en una matriz bidimensional. 
    Cuando se encuentra el valor, una ruptura etiquetada termina el bucle externo 
    (etiquetado como "búsqueda"):*/
    
    class BreakWithLabelDemo {
    public  void main(String[] args) {

        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

    search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
    //Esta es la salida del programa.
    //Encontrado 12 a 1, 0  //Found 12 at 1, 0

    /*La instrucción break termina la declaración etiquetada; No transfiere el flujo de control a la etiqueta. 
    El flujo de control se transfiere a la declaración inmediatamente después de la declaración etiquetada 
    (terminada).*/
    
    //The continue Statement
    
    /*La instrucción continue omite la iteración actual de un bucle for, while o do-while.
    La forma sin etiqueta salta al final del cuerpo del bucle más interno y evalúa 
    la expresión booleana que controla el bucle. 
    El siguiente programa, ContinueDemo, recorre una cadena, contando las ocurrencias de la letra "p". 
    Si el carácter actual no es una p, 
    la instrucción continue omite el resto del bucle y pasa al siguiente carácter. 
    Si es una "p", el programa incrementa el conteo de letras.*/
    
    class ContinueDemo {
    public  void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
    //Aquí está la salida de este programa:
    //Found 9 p's in the string.

    /*Para ver este efecto con mayor claridad, intente eliminar la instrucción continue y volver a compilar. 
    Cuando vuelva a ejecutar el programa, el conteo será incorrecto, diciendo que encontró 35 p en lugar de 9.*/
    
    /*Una instrucción de continuar etiquetada omite la iteración actual de 
    un bucle externo marcado con la etiqueta dada. 
    El siguiente programa de ejemplo, ContinueWithLabelDemo, 
    usa bucles anidados para buscar una subcadena dentro de otra cadena. 
    Se requieren dos bucles anidados: uno para iterar sobre la subcadena 
    y otro para iterar sobre la cadena que se está buscando. 
    El siguiente programa, ContinueWithLabelDemo, 
    usa la forma etiquetada de continuar para omitir una iteración en el bucle externo.*/
    
    class ContinueWithLabelDemo {
    public  void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
    //Aquí está la salida de este programa.
    //Found it

    //The return Statement
    
    /*La última de las declaraciones de ramificación es la declaración de retorno. 
    La instrucción de retorno sale del método actual y el flujo de control vuelve a donde se invocó el método. 
    La declaración de devolución tiene dos formas: una que devuelve un valor y otra que no.
    Para devolver un valor, simplemente coloque el valor (o una expresión que calcule el valor) 
    después de la palabra clave return.*/
    
    //return ++count;
    
    /*El tipo de datos del valor devuelto debe coincidir con el tipo del valor de retorno declarado del método. 
    Cuando un método se declara nulo, utilice la forma de devolución que no devuelve un valor.*/
    
    //return;

    /*La lección de Clases y Objetos cubrirá todo lo que necesita saber sobre los métodos de escritura.*/
    
    //Summary of Control Flow Statements

    /*La instrucción if-then es la más básica de todas las declaraciones de flujo de control. 
    Le dice a su programa que ejecute una determinada sección de código solo si una prueba en 
    particular se evalúa como verdadera. La instrucción if-then-else proporciona una ruta secundaria 
    de ejecución cuando una cláusula "if" se evalúa como falsa. A diferencia de if-then y if-then-else, 
    la instrucción switch permite cualquier número de rutas de ejecución posibles. 
    Las instrucciones while y do-while ejecutan continuamente un bloque de instrucciones 
    mientras que una condición particular es verdadera. 
    La diferencia entre do-while y while es que do-while evalúa su expresión en la parte 
    inferior del bucle en lugar de la parte superior. Por lo tanto, 
    las declaraciones dentro del bloque do siempre se ejecutan al menos una vez. 
    La instrucción for proporciona una forma compacta de iterar sobre un rango de valores. 
    Tiene dos formas, una de las cuales fue diseñada para recorrer en bucle colecciones y matrices.*/
    
    
    
    
    
}





