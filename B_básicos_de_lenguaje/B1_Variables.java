
package B_básicos_de_lenguaje;


//variable
//   Primitive Data Types
//   Arrays
//   Summary of Variables

/**
 *
 * @author ooku
 */
public class B1_Variables {
    //--------------¿Que es una variable?---------------------------
    
    
    /*Como aprendió en la lección anterior, un objeto almacena su estado en campos.*/
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    /*¿Qué es un objeto? la discusión lo introdujo en los campos, 
    pero es probable que aún tenga algunas preguntas, tales como: 
    ¿Cuáles son las reglas y convenciones para nombrar un campo? Además de int, 
    ¿qué otros tipos de datos hay? ¿Deben inicializarse los campos cuando se declaran? 
    ¿Se asigna un valor predeterminado a los campos si no se inicializan explícitamente?
    Exploraremos las respuestas a estas preguntas en esta lección, pero antes de hacerlo, 
    hay algunas distinciones técnicas que debe conocer. En el lenguaje de programación Java, 
    se utilizan los términos "campo" y "variable"; 
    Esta es una fuente común de confusión entre los nuevos desarrolladores
    ,ya que ambos a menudo parecen referirse a lo mismo.*/ 
    
    /*El lenguaje de programación Java define los siguientes tipos de variables:

    -Variables de instancia (campos no estáticos) Técnicamente hablando, 
    los objetos almacenan sus estados individuales en "campos no estáticos",
    es decir, campos declarados sin la palabra clave estática. 
    Los campos no estáticos también se conocen como variables de instancia porque sus valores son
    únicos para cada instancia de una clase (para cada objeto, 
    en otras palabras); la velocidad actual de una bicicleta es independiente de 
    la velocidad actual de otra bicicleta.
    
    -Variables de clase (campos estáticos) Una variable de clase es cualquier campo declarado 
    con el modificador estático; esto le dice al compilador que existe exactamente una copia de 
    esta variable, independientemente de cuántas veces se haya instanciado la clase. 
    Un campo que define la cantidad de marchas para un tipo particular de bicicleta podría marcarse como 
    estático, ya que conceptualmente la misma cantidad de marchas se aplicará a todas las instancias. 
    El código static int numGears = 6; crearía tal campo estático. Además, 
    la palabra clave final podría agregarse para indicar que el número de engranajes nunca cambiará.
    
    -Variables locales Similar a cómo un objeto almacena su estado en campos, 
    un método a menudo almacenará su estado temporal en variables locales. 
    La sintaxis para declarar una variable local es similar a declarar un campo (por ejemplo, int count = 0;). 
    No hay una palabra clave especial que designe una variable como local; 
    esa determinación proviene completamente de la ubicación en la que se declara la variable, 
    que se encuentra entre las llaves de apertura y cierre de un método. Como tales, 
    las variables locales solo son visibles para los métodos en los que se declaran; 
    No son accesibles desde el resto de la clase.
    
    -Parámetros Ya ha visto ejemplos de parámetros, 
    tanto en la clase Bicicletas como en el método principal del "¡Hola mundo!" solicitud. 
    Recuerde que la firma del método main es public static void main (String [] args). 
    Aquí, la variable args es el parámetro de este método. 
    Lo importante a recordar es que los parámetros siempre se clasifican como "variables" y no "campos". 
    Esto se aplica también a otras construcciones que aceptan parámetros 
    (como constructores y controladores de excepciones) que aprenderá más adelante en el tutorial.
*/
    
    /*Dicho esto, el resto de este tutorial utiliza las siguientes pautas generales al analizar campos 
    y variables. Si estamos hablando de "campos en general" (excluyendo variables y parámetros locales), 
    simplemente podemos decir "campos". Si la discusión se aplica a "todo lo anterior",
    podemos decir simplemente "variables". Si el contexto requiere una distinción, 
    usaremos términos específicos (campo estático, variables locales, etc.) según corresponda. 
    También puede ver ocasionalmente el término "miembro". Los campos, métodos y tipos anidados 
    de un tipo se denominan colectivamente sus miembros.*/
    
    /*Nombrar = naming
    Cada lenguaje de programación tiene su propio conjunto de reglas y convenciones para 
    los tipos de nombres que puede usar, y el lenguaje de programación Java no es diferente. 
    Las reglas y convenciones para nombrar sus variables se pueden resumir de la siguiente manera:

    Los nombres de las variables distinguen entre mayúsculas y minúsculas. El nombre de una variable 
    puede ser cualquier identificador legal: una secuencia de longitud ilimitada de letras y dígitos 
    de Unicode, que comienza con una letra, el signo de dólar "$" o el carácter de subrayado "_". 
    La convención, sin embargo, es comenzar siempre los nombres de sus variables con una letra, no "$" o "_". 
    Además, el carácter de signo de dólar, por convención, nunca se utiliza en absoluto. 
    Puede encontrar algunas situaciones en las que los nombres 
    generados automáticamente contengan el signo de dólar, pero los nombres de sus variables 
    siempre deben evitar su uso. Existe una convención similar para el carácter de subrayado; 
    Si bien es técnicamente legal comenzar el nombre de su variable con "_", se desaconseja esta práctica. 
    No se permite el espacio en blanco.
    Los caracteres subsiguientes pueden ser letras, dígitos, signos de dólar o caracteres de subrayado. 
    Las convenciones (y el sentido común) también se aplican a esta regla.
    Al elegir un nombre para sus variables, use palabras completas en lugar de abreviaturas crípticas. 
    Hacerlo hará que su código sea más fácil de leer y entender. 
    En muchos casos también hará que su código se autodocumente; los campos denominados cadencia, 
    velocidad y engranaje, por ejemplo, son mucho más intuitivos que las versiones abreviadas
    , como s, c y g. También tenga en cuenta que el nombre que elija no debe 
    ser una palabra clave o una palabra reservada.
    Si el nombre que elige consta de una sola palabra, deletree esa palabra en todas las letras minúsculas. 
    Si consta de más de una palabra, escribe con mayúscula la primera letra de cada palabra subsiguiente. 
    Los nombres gearRatio y currentGear son ejemplos principales de esta convención. 
    Si su variable almacena un valor constante, como static final int NUM_GEARS = 6, 
    la convención cambia ligeramente, mayúscula cada letra y separa las palabras subsiguientes 
    con el carácter de subrayado. Por convención, el carácter de subrayado nunca se utiliza en otros lugares.*/
    
    class Tipos_de_datos_primitivos{
        
        //Tipos de datos primitivos
        /*El lenguaje de programación de Java es de tipo estático, 
        lo que significa que todas las variables se deben declarar antes de poder utilizarlas. 
        Esto implica indicar el tipo y el nombre de la variable, como ya ha visto:*/
        int gear = 1;
        /*Al hacerlo, le indica a su programa que existe un campo llamado "engranaje", 
        contiene datos numéricos y tiene un valor inicial de "1". 
        El tipo de datos de una variable determina los valores que puede contener, 
        más las operaciones que se pueden realizar en ella. Además de int,
        el lenguaje de programación Java admite otros siete tipos de datos primitivos. 
        Un tipo primitivo está predefinido por el idioma y es nombrado por una palabra clave reservada. 
        Los valores primitivos no comparten el estado con otros valores primitivos. 
        Los ocho tipos de datos primitivos soportados por el lenguaje de programación Java son:*/
        /*
        
        byte: el tipo de datos de byte es un entero de complemento de dos bits con signo de 8 bits.
        Tiene un valor mínimo de -128 y un valor máximo de 127 (inclusive). 
        El tipo de datos de bytes puede ser útil para guardar memoria en arreglos grandes, 
        donde el ahorro de memoria realmente importa. 
        También se pueden usar en lugar de int donde sus límites ayudan a aclarar su código; 
        el hecho de que el rango de una variable sea limitado puede servir como una forma de documentación.

        short: el tipo de datos short es un entero de complemento de dos bits con signo de 16 bits. 
        Tiene un valor mínimo de -32,768 y un valor máximo de 32,767 (inclusive). Al igual que con el byte, 
        se aplican las mismas pautas: puede utilizar un corto para guardar la memoria en arreglos grandes,
        en situaciones donde el ahorro de memoria realmente importa.

        int: De forma predeterminada, el tipo de datos int es un entero de complemento a 
        dos con signo de 32 bits, que tiene un valor mínimo de -231 y un valor máximo de 231-1.
        En Java SE 8 y versiones posteriores, puede usar el tipo de datos int para representar 
        un entero de 32 bits sin signo, que tiene un valor mínimo de 0 y un valor máximo de 232-1. 
        Use la clase Integer para usar el tipo de datos int como un entero sin signo. 
        Vea la sección Las clases de números para más información. Se han agregado métodos 
        estáticos como compareUnsigned, divideUnsigned, etc. a la clase Integer para admitir 
        las operaciones aritméticas para enteros sin signo.

        long: el tipo de datos long es un entero de complemento de dos bits de 64 bits. 
        El largo firmado tiene un valor mínimo de -263 y un valor máximo de 263-1. 
        En Java SE 8 y versiones posteriores, puede usar el tipo de datos largos para representar 
        un largo sin firmar de 64 bits, que tiene un valor mínimo de 0 y un valor máximo de 264-1.
        Utilice este tipo de datos cuando necesite un rango de valores más 
        amplio que los proporcionados por int. La clase Long también contiene métodos como compareUnsigned, 
        divideUnsigned, etc. para admitir operaciones aritméticas durante largos sin signo.

        flotante: el tipo de datos flotante es un punto flotante IEEE 754 de 32 bits de precisión simple. 
        Su rango de valores está fuera del alcance de esta discusión, pero se especifica en la sección de Tipos,
        Formatos y Valores de Punto Flotante de la Especificación del Lenguaje Java. 
        Al igual que con las recomendaciones de byte y corto, use una coma flotante 
        (en lugar de doble) si necesita ahorrar memoria en grandes conjuntos de números de punto flotante. 
        Este tipo de datos nunca debe utilizarse para valores precisos, como la moneda. 
        Para eso, necesitarás usar la clase java.math.BigDecimal en su lugar. 
        Numbers and Strings cubre BigDecimal y otras clases útiles proporcionadas por la plataforma Java.

        doble: el tipo de datos doble es un punto flotante IEEE 754 de doble precisión de 64 bits. 
        Su rango de valores está fuera del alcance de esta discusión, 
        pero se especifica en la sección de Tipos, Formatos y Valores de Punto Flotante 
        de la Especificación del Lenguaje Java. Para valores decimales, 
        este tipo de datos es generalmente la opción predeterminada. 
        Como se mencionó anteriormente, este tipo de datos nunca debe usarse para valores precisos, 
        como la moneda.

        booleano: el tipo de datos booleano tiene solo dos valores posibles: verdadero y falso. 
        Utilice este tipo de datos para indicadores simples que rastrean condiciones de verdadero / falso. 
        Este tipo de datos representa un bit de información, pero su "tamaño" no es algo que esté definido 
        con precisión.

        char: El tipo de datos char es un único carácter Unicode de 16 bits. 
        Tiene un valor mínimo de '\ u0000' (o 0) y un valor máximo de '\ uffff' (o 65,535 inclusive).*/
        
        
        /*Además de los ocho tipos de datos primitivos enumerados anteriormente, 
        el lenguaje de programación Java también proporciona soporte especial para cadenas 
        de caracteres a través de la clase java.lang.String. 
        Si se incluye la cadena de caracteres entre comillas dobles, se creará automáticamente 
        un nuevo objeto de cadena; por ejemplo, String s = "esto es una cadena" ;. 
        Los objetos de cadena son inmutables, lo que significa que una vez creados,
        sus valores no se pueden cambiar. La clase String no es técnicamente un tipo de datos primitivo, 
        pero considerando el soporte especial que le da el lenguaje, 
        probablemente tenderá a pensar en ello como tal. 
        Aprenderás más sobre la clase String en Objetos de datos simples
*/
      //Valores predeterminados "default values"
        
        /*No siempre es necesario asignar un valor cuando se declara un campo.
        Los campos que se declaran pero no se inicializan se establecerán en un 
        valor predeterminado razonable por parte del compilador. 
        En términos generales, este valor predeterminado será cero o nulo, 
        según el tipo de datos. Sin embargo, confiar en dichos valores predeterminados 
        generalmente se considera un estilo de programación inadecuado.
*/
        /*
        Data Type	Default Value (for fields)
        byte            0
        short           0
        int             0
        long            0L
        float           0.0f
        double          0.0d
        char            '\u0000'
        String   	null
        boolean         false
*/
        /*Las variables locales son ligeramente diferentes; 
        
        el compilador nunca asigna un valor predeterminado a una variable local sin inicializar. 
        Si no puede inicializar su variable local donde se declara, 
        asegúrese de asignarle un valor antes de intentar usarlo. 
        El acceso a una variable local sin inicializar dará como resultado un error en tiempo de compilación.*/
        

        //Literales = literals
        /*Es posible que haya notado que la nueva palabra clave no se usa al inicializar una 
        variable de un tipo primitivo. Los tipos primitivos son tipos de datos especiales 
        incorporados en el lenguaje; no son objetos creados a partir de una clase. 
        Un literal es la representación del código fuente de un valor fijo; 
        Los literales se representan directamente en su código sin necesidad de cálculo. 
        Como se muestra a continuación, es posible asignar un literal a una variable de un tipo primitivo:*/
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        
        //Literales enteros "Integer Literals"
        
        /*Un literal entero es de tipo long si termina con la letra L o l;
        De lo contrario es de tipo int. Se recomienda que use la letra L mayúscula 
        porque la letra l minúscula es difícil de distinguir del dígito 1.*/
        
        /*Los valores de los tipos integrales byte, short, 
        int y long se pueden crear a partir de int literales. 
        Los valores de tipo long que exceden el rango de int se pueden crear a partir de literales largos. 
        Los literales enteros se pueden expresar mediante estos sistemas numéricos:*/
        
        /*
        Decimal: Base 10, cuyos dígitos están formados por los números del 0 al 9; 
        Este es el sistema numérico que usas todos los días.
        Hexadecimal: Base 16, cuyos dígitos consisten en los números del 0 al 9 y las letras de la A a la F
        Binario: Base 2, cuyos dígitos están formados por los números 0 y 1 
        (puede crear literales binarios en Java SE 7 y versiones posteriores)*/
        
        /*Para la programación de propósito general, es probable que el sistema 
        decimal sea el único sistema numérico que jamás utilizará. Sin embargo, 
        si necesita usar otro sistema numérico, el siguiente ejemplo muestra la sintaxis correcta. 
        El prefijo 0x indica hexadecimal y 0b indica binario:*/
        
        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;
        
        //Literales de punto flotante "Floating-Point Literals"
        /*Un literal de punto flotante es de tipo float si termina con la letra F o f; 
        de lo contrario, su tipo es doble y, opcionalmente, puede terminar con la letra D o d.*/
        
        /*Los tipos de punto flotante (flotante y doble) 
        también se pueden expresar utilizando E o e (para notación científica), 
        F o f (literal flotante de 32 bits) y D o d (doble literal de 64 bits; este es el valor predeterminado y se omite la convención).*/
        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;
        
        //Literales de caracteres y cuerdas "Character and String Literals"
        
        /*Los literales de los tipos char y String pueden contener cualquier carácter Unicode (UTF-16). 
        Si su editor y sistema de archivos lo permiten, puede usar dichos caracteres directamente en su código. 
        Si no, puede usar un "escape Unicode" como '\ u0108' 
        (mayúscula C con circunflejo), o "S \ u00ED Se \ u00F1or" 
        (Sí Señor en español). Siempre use 'comillas simples' 
        para los literales de caracteres y las 'comillas dobles' 
        para los literales de cadenas. Las secuencias de escape de Unicode se pueden 
        usar en cualquier parte de un programa (como en los nombres de campo, por ejemplo), 
        no solo en caracteres literales o de cadena.

        El lenguaje de programación Java también admite algunas secuencias de escape especiales 
        para los literales char y String: \ b (retroceso), \ t (pestaña), \ n (avance de línea),
        \ f (avance de página), \ r (retorno de carro), \ "(comillas dobles), \ '(comillas simples) 
        y \\ (barra invertida).

        También hay un literal nulo especial que se puede usar como valor para cualquier tipo de referencia. 
        Se puede asignar nulo a cualquier variable, excepto las variables de tipos primitivos. 
        Hay poco que puedas hacer con un valor nulo más allá de la prueba de su presencia. 
        Por lo tanto, nulo se usa a menudo en programas como un marcador para indicar 
        que algún objeto no está disponible.

        Finalmente, también hay un tipo especial de literal llamado literal de clase,
        formado al tomar un nombre de tipo y agregar ".class"; por ejemplo, String.class. 
        Esto se refiere al objeto (de tipo Clase) que representa el tipo en sí.*/
        
      //Uso de caracteres de subrayado en literales numéricos "Using Underscore Characters in Numeric Literals"
        
        /*En Java SE 7 y versiones posteriores, cualquier número de caracteres de subrayado (_) 
        puede aparecer en cualquier lugar entre los dígitos en un literal numérico. 
        Esta característica le permite, por ejemplo. para separar grupos de dígitos en literales numéricos, 
        lo que puede mejorar la legibilidad de su código.

        Por ejemplo, si su código contiene números con muchos dígitos,
        puede usar un carácter de subrayado para separar los dígitos en grupos de tres,
        de manera similar a como usaría un signo de puntuación como una coma, o un espacio, como separador.*/
        
        //El siguiente ejemplo muestra otras formas en que puede usar el guión bajo en literales numéricos:
        
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        //Puede colocar guiones bajos solo entre dígitos; 
        
        //No puedes colocar guiones bajos en los siguientes lugares:
        /*Al principio o al final de un número
        Adyacente a un punto decimal en un literal de punto flotante
        Antes de un sufijo F o L
        En posiciones donde se espera una cadena de dígitos*/
        
        /*Los siguientes ejemplos demuestran ubicaciones de subrayado válidas e inválidas
        (que están resaltadas) en literales numéricos:*/
       
        
        // Invalid: cannot put underscores
        // adjacent to a decimal point
        //float pi1 = 3_.1415F;
        // Invalid: cannot put underscores 
        // adjacent to a decimal point
        //float pi2 = 3._1415F;
        // Invalid: cannot put underscores 
        // prior to an L suffix
        //long socialSecurityNumber1 = 999_99_9999_L;

        // OK (decimal literal)
        //int x1 = 5_2;
        // Invalid: cannot put underscores
        // At the end of a literal
        //int x2 = 52_;
        // OK (decimal literal)
        //int x3 = 5_______2;

        // Invalid: cannot put underscores
        // in the 0x radix prefix
        //int x4 = 0_x52;
        // Invalid: cannot put underscores
        // at the beginning of a number
        //int x5 = 0x_52;
        // OK (hexadecimal literal)
        //int x6 = 0x5_2; 
        // Invalid: cannot put underscores
        // at the end of a number
        //int x7 = 0x52_;
    
        
    
    }
    
    class Arrays{
        /*Una matriz es un objeto contenedor que contiene un número fijo de valores de un solo tipo. 
        La longitud de una matriz se establece cuando se crea la matriz.
        Después de la creación, su longitud es fija. Ya has visto un ejemplo de matrices, 
        en el método principal del "¡Hola mundo!" solicitud. 
        Esta sección discute las matrices en mayor detalle.*/
        //imagen de prueba verla
        //https://docs.oracle.com/javase/tutorial/figures/java/objects-tenElementArray.gif
        /*El siguiente programa, ArrayDemo, crea una matriz de enteros, 
        coloca algunos valores en la matriz e imprime cada valor en la salida estándar.*/
        
        
    }  
}
class ArrayDemo {
    public  void maing(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
             
        
        
        
        
    }
}
      /*En una situación de programación en el mundo real, 
    probablemente utilice una de las construcciones de bucle admitidas para recorrer en iteración cada 
    elemento de la matriz, en lugar de escribir cada línea individualmente como en el ejemplo anterior. 
    Sin embargo, el ejemplo ilustra claramente la sintaxis de la matriz. 
    Aprenderá sobre las diversas construcciones de bucle (para, 
    while y do-while) en la sección Flujo de control.*/


        //Declarar una variable para referirse a una matriz "Declaring a Variable to Refer to an Array"
        // declares an array of integers
       // int[] = anArray;

class declaraling{
    int[] anArray;
    
    /*Al igual que las declaraciones de variables de otros tipos,
    una declaración de matriz tiene dos componentes: el tipo de matriz y el nombre de la matriz. 
    El tipo de una matriz se escribe como tipo [], donde tipo es el tipo de datos de los elementos contenidos;
    los corchetes son símbolos especiales que indican que esta variable contiene una matriz. 
    El tamaño de la matriz no es parte de su tipo (por lo que los corchetes están vacíos). 
    El nombre de una matriz puede ser lo que desee, siempre que cumpla con las reglas y 
    convenciones que se analizaron anteriormente en la sección de nombres. 
    Al igual que con las variables de otros tipos, la declaración no crea realmente una matriz; 
    simplemente le dice al compilador que esta variable mantendrá una matriz del tipo especificado.*/
    
    //Del mismo modo, puede declarar matrices de otros tipos:
    
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;
    
    //También puede colocar los corchetes después del nombre de la matriz:
    // this form is discouraged
    //float anArrayOfFloats[];
    
    //Sin embargo, la convención desalienta esta forma; 
    //los corchetes identifican el tipo de matriz y deben aparecer con la designación de tipo.
    
    
    //Creación, inicialización y acceso a una matriz "Creating, Initializing, and Accessing an Array"
    /*Una forma de crear una matriz es con el nuevo operador. 
    La siguiente declaración en el programa ArrayDemo asigna una 
    matriz con suficiente memoria para 10 elementos enteros y asigna la matriz a la variable anArray.*/
    // create an array of integers
    //anArray = new int[10];
    
    //Si falta esta declaración, el compilador imprime un error como el siguiente, y la compilación falla:
    //ArrayDemo.java:4: la variable anArray puede no haberse inicializado.
    
    //Las siguientes líneas asignan valores a cada elemento de la matriz:
    //anArray[0] = 100; // initialize first element
    //anArray[1] = 200; // initialize second element
    //anArray[2] = 300; // and so forth
    
    //A cada elemento de la matriz se accede por su índice numérico:
    void ejem(){
        
        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);

    }
   //Alternativamente, puede usar la sintaxis de acceso directo para crear e inicializar una matriz:
    void ejm(){

        int[] anArray = { 
    100, 200, 300,
    400, 500, 600, 
    700, 800, 900, 1000
};
    
    }
    /*Aquí la longitud de la matriz está determinada por el número de valores provistos entre 
    llaves y separados por comas.*/
    
    /*También puede declarar una matriz de matrices (también conocida como matriz multidimensional) 
    utilizando dos o más conjuntos de corchetes, como los nombres de String [] []. 
    Cada elemento, por lo tanto, debe ser accedido por un número correspondiente de valores de índice.*/
    
    /*En el lenguaje de programación Java, una matriz multidimensional es una matriz cuyos 
    componentes son ellos mismos matrices. Esto es a diferencia de matrices en C o Fortran. 
    Una consecuencia de esto es que las filas pueden variar en longitud, 
    como se muestra en el siguiente programa MultiDimArrayDemo:*/
    

    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
    //La salida de este programa es:
    //Mr. Smith
    //Ms. Jones
    
    /*Finalmente, puede usar la propiedad de longitud incorporada para determinar el tamaño de cualquier matriz. 
    El siguiente código imprime el tamaño de la matriz en la salida estándar:*/
    
// System.out.println(anArray.length);

    
    //Copiando Arrays "Copying Arrays"
    
    /*La clase Sistema tiene un método de copia de matriz que puede utilizar para 
    copiar de manera eficiente los datos de una matriz a otra:*/
    
    public static void arraycopy(Object src, int srcPos,Object dest, int destPos, int length){
        
    
    }
    /*Los dos argumentos de Objeto especifican la matriz de la que se va a copiar y 
    la matriz a la que se debe copiar. Los tres argumentos int especifican la posición 
    inicial en la matriz de origen, la posición inicial en la matriz de destino y 
    el número de elementos de la matriz para copiar.*/
    
    /*El siguiente programa, ArrayCopyDemo, declara una serie de elementos char, 
    que deletrean la palabra "descafeinado". Utiliza el método System.arraycopy 
    para copiar una subsecuencia de componentes de matriz en una segunda matriz:*/
    class ArrayCopyDemo {
    public  void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
    //La salida de este programa es:
    //caffein
    
    //Manipulaciones de Arreglos "Array Manipulations"
    
    /*Las matrices son un concepto poderoso y útil utilizado en la programación. 
    Java SE proporciona métodos para realizar algunas de las manipulaciones más comunes 
    relacionadas con matrices. Por ejemplo, el ejemplo de ArrayCopyDemo utiliza el método 
    de copia de la matriz de la clase Sistema en lugar de iterar manualmente los elementos 
    de la matriz de origen y colocar cada uno en la matriz de destino. Esto se realiza entre bambalinas, 
    lo que permite al desarrollador usar solo una línea de código para llamar al método.*/
    
    /*Para su comodidad, Java SE proporciona varios métodos para realizar manipulaciones de matriz 
    (tareas comunes, como copiar, ordenar y buscar matrices) en la clase java.util.Arrays. 
    Por ejemplo, el ejemplo anterior se puede modificar para usar el método 
    copyOfRange de la clase java.util.Arrays, como se puede ver en el ejemplo de ArrayCopyOfDemo. 
    La diferencia es que usar el método copyOfRange no requiere que crees la matriz de destino 
    antes de llamar al método, porque la matriz de destino es devuelta por el método:*/
    
    
    class ArrayCopyOfDemo {
    public void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo));
    }
}
    /*Como puede ver, la salida de este programa es la misma (cafeína), 
    aunque requiere menos líneas de código. Tenga en cuenta que el segundo parámetro del método 
    copyOfRange es el índice inicial del rango a copiar, inclusive, 
    mientras que el tercer parámetro es el índice final del rango a copiar, 
    exclusivamente. En este ejemplo, el rango a copiar no incluye el elemento 
    de matriz en el índice 9 (que contiene el carácter a).*/
    
    //Algunas otras operaciones útiles proporcionadas por los métodos en la clase java.util.Arrays son:
    
    /*
   -Buscando en una matriz un valor específico para obtener el índice en el que se coloca 
    (el método binarySearch).
    -Comparando dos matrices para determinar si son iguales o no 
    (el método de iguales).
    -Rellenar una matriz para colocar un valor específico en cada índice 
    (el método de relleno).
    -Ordenar una matriz en orden ascendente. 
    Esto se puede hacer de forma secuencial, utilizando el método de clasificación, 
    o al mismo tiempo, utilizando el método parallelSort introducido en Java SE 8. 
    La clasificación paralela de matrices grandes en sistemas multiprocesador es más rápida que 
    la clasificación secuencial de matrices.*/
    
    //Resumen de variables "Summary of Variables"
    
    /*El lenguaje de programación Java utiliza tanto "campos" como "variables" como parte de su terminología. 
    Las variables de instancia (campos no estáticos) son únicas para cada instancia de una clase. 
    Las variables de clase (campos estáticos) son campos declarados con el modificador estático; 
    hay exactamente una copia de una variable de clase, independientemente de cuántas veces 
    se haya instanciado la clase. Las variables locales almacenan el estado temporal dentro de un método. 
    Los parámetros son variables que proporcionan información adicional a un método; 
    Tanto las variables locales como los parámetros siempre se clasifican como "variables" (no "campos"). 
    Al nombrar sus campos o variables, hay reglas y convenciones que debe (o debe) seguir.*/
    
    /*Los ocho tipos de datos primitivos son: byte, short, int, long, float, double, boolean y char. 
    La clase java.lang.String representa cadenas de caracteres. 
    El compilador asignará un valor predeterminado razonable para los campos de los tipos anteriores; 
    para las variables locales, un valor predeterminado nunca se asigna. 
    Un literal es la representación del código fuente de un valor fijo. 
    Una matriz es un objeto contenedor que contiene un número fijo de valores de un solo tipo. 
    La longitud de una matriz se establece cuando se crea la matriz. 
    Después de la creación, su longitud es fija.*/
    
    

}