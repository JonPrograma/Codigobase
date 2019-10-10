
package C_Clases_y_objetos;

/**
 *
 * @author ooku
 */
public class C1_Clases {
    
    //Classes

    /*La introducción a los conceptos orientados a objetos en la lección titulada Conceptos 
    orientados a objetos de programación utilizó una clase de bicicleta como ejemplo, 
    con bicicletas de carrera, bicicletas de montaña y bicicletas tándem como subclases. 
    Aquí hay un código de ejemplo para una posible implementación de una clase de Bicicletas, 
    para darle una visión general de una declaración de clase. 
    Las secciones subsiguientes de esta lección realizarán una copia de seguridad y explicarán las 
    declaraciones de la clase paso a paso. Por el momento, no te preocupes por los detalles.*/
    
    public class Bicycle {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}
    /*Una declaración de clase para una clase de MountainBike que es una subclase de Bicycle podría 
    tener este aspecto:*/
    
    public class MountainBike extends Bicycle {
        
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}
    
    /*MountainBike hereda todos los campos y métodos de Bicycle y agrega el field seatHeight y 
    un método para configurarlo (las bicicletas de montaña tienen asientos que pueden moverse hacia 
    arriba y hacia abajo según lo exija el terreno).*/
    
    //Declaring Classes

    //Has visto clases definidas de la siguiente manera:
    class MyClass {
    // field, constructor, and 
    // method declarations
}
    /*Esta es una declaración de clase. El cuerpo de la clase (el área entre llaves) 
    contiene todo el código que proporciona el ciclo de vida de los objetos creados a 
    partir de la clase: constructores para inicializar nuevos objetos, declaraciones para los campos 
    que proporcionan el estado de la clase y sus objetos, y Métodos para implementar el comportamiento 
    de la clase y sus objetos.*/
    
    /*La declaración de clase precedente es mínima. 
    Contiene solo aquellos componentes de una declaración de clase que son requeridos.
    Puede proporcionar más información sobre la clase, como el nombre de su superclase, 
    si implementa alguna interfaz, etc., al comienzo de la declaración de la clase. Por ejemplo,*/
    /*
    class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}*/
    
    //significa que MyClass es una subclase de MySuperClass y que implementa la interfaz YourInterface.
    
    /*También puede agregar modificadores como público o privado desde el principio, 
    por lo que puede ver que la línea de apertura de una declaración de clase puede ser bastante complicada. 
    Los modificadores públicos y privados, que determinan qué otras clases pueden acceder a MyClass,
    se explican más adelante en esta lección. La lección sobre interfaces y herencia explicará cómo 
    y por qué usaría las palabras clave extendidas e implementadas en una declaración de clase. 
    Por el momento no necesita preocuparse por estas complicaciones adicionales.*/
    
    //En general, las declaraciones de clase pueden incluir estos componentes, en orden:
    
    /*
    Modificadores tales como público, privado y otros que encontrará más adelante.
    El nombre de la clase, con la letra inicial en mayúscula por convención.
    El nombre de la clase principal (superclase), si existe, precedido por la palabra clave se extiende. 
    Una clase solo puede extender (subclase) un padre.
    Una lista separada por comas de las interfaces implementadas por la clase, si las hubiera, 
    precedidas por los implementos de palabras clave. Una clase puede implementar más de una interfaz.
    El cuerpo de clase, rodeado de tirantes, {}.*/

    
    //Declaring Member Variables
    
    /*  
    
    Hay varios tipos de variables:

Variables de miembros en una clase: estos se llaman campos.
Variables en un método o bloque de código: se denominan variables locales.
Variables en las declaraciones de métodos: se denominan parámetros.
La clase Bicycle usa las siguientes líneas de código para definir sus campos:
    
    public int cadence;
    public int gear;
    public int speed;
   
    */
    
    //Las declaraciones de campo se componen de tres componentes, en orden:
    /*
    Cero o más modificadores, como públicos o privados.
    El tipo de campo.
    El nombre del campo.
    */
    
    /*Los campos de Bicicletas se denominan cadencia, velocidad y velocidad y son todos de 
    tipo de datos integer (int). La palabra clave pública identifica estos campos como miembros públicos, 
    a los que puede acceder cualquier objeto que pueda acceder a la clase.*/
    
    //Access Modifiers

    /*El primer modificador (el más a la izquierda) utilizado le permite controlar qué otras clases 
    tienen acceso a un campo miembro. Por el momento, considérese solo público y privado. 
    Otros modificadores de acceso serán discutidos más adelante.*/
    
    //public modifier—the field is accessible from all classes.
    //private modifier—the field is accessible only within its own class.
    
    /*En el espíritu de la encapsulación, es común hacer que los campos sean privados. 
    Esto significa que solo se puede acceder directamente desde la clase Bicicletas. 
    Todavía necesitamos acceso a estos valores, sin embargo. 
    Esto se puede hacer indirectamente agregando métodos públicos que obtengan los valores de 
    campo para nosotros:*/
    
    public class BicycleA {
        
    private int cadence;
    private int gear;
    private int speed;
        
    public BicycleA(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
    //Types
    
    /*Todas las variables deben tener un tipo. Puede usar tipos primitivos como int, float, boolean, etc. 
    O puede usar tipos de referencia, como cadenas, matrices u objetos.*/
    
    //Variable Names

    /*Todas las variables, ya sean campos, variables locales o parámetros, 
    siguen las mismas reglas y convenciones de nomenclatura que se trataron en la 
    lección Conceptos básicos del idioma, Variables: denominación.*/
    
    /*
    En esta lección, tenga en cuenta que las mismas reglas de nomenclatura y convenciones se 
    utilizan para los nombres de métodos y clases, excepto que

    la primera letra del nombre de una clase debe estar en mayúscula, y
    la primera (o única) palabra en el nombre de un método debe ser un verbo.*/
    
    //Defining Methods

    //Aquí hay un ejemplo de una declaración de método típico:
    
  /**  public double calculateAnswer(double wingSpan, int numberOfEngines,
                              double length, double grossTons) {
    //do the calculation here
}*/
    
    /*Los únicos elementos requeridos de una declaración de método son el tipo de retorno del método, 
    el nombre, un par de paréntesis, (), y un cuerpo entre llaves, {}.*/
    
    //Más generalmente, las declaraciones de métodos tienen seis componentes, en orden:
    
    /*
    Modificadores, como públicos, privados y otros, sobre los que aprenderá más adelante.
    El tipo de retorno: el tipo de datos del valor devuelto por el método o anulado si el método no 
    devuelve un valor.
    El nombre del método: las reglas para los nombres de los campos también se aplican a los nombres de 
    los métodos, pero la convención es un poco diferente.
    La lista de parámetros entre paréntesis: una lista de parámetros de entrada delimitada por comas, 
    precedida por sus tipos de datos, entre paréntesis, (). 
    Si no hay parámetros, debe usar paréntesis vacíos.
    Una lista de excepciones, que se discutirá más adelante.
    El cuerpo del método, incluido entre llaves: el código del método,
    incluida la declaración de variables locales, va aquí.*/
    
    /*Los modificadores, los tipos de retorno y los parámetros se tratarán más adelante en esta lección. 
    Las excepciones se discuten en una lección posterior.*/
    
    /*Definición: Dos de los componentes de una declaración de método comprenden la firma del método: 
    el nombre del método y los tipos de parámetros.*/
    
    //La firma del método declarado anteriormente es:
    //calculateAnswer(double, int, double, double)
    
    //Naming a Method
    
    /*Aunque el nombre de un método puede ser cualquier identificador legal, 
    las convenciones de código restringen los nombres de los métodos.
    Por convención, los nombres de los métodos deben ser un verbo en minúscula 
    o un nombre de varias palabras que comience con un verbo en minúsculas, 
    seguido de adjetivos, sustantivos, etc. En los nombres de varias palabras, 
    la primera letra de cada una de las palabras del segundo y siguientes debe ser capitalizado. 
    Aquí hay unos ejemplos:*/
    
    /*
    run
    runFast
    getBackground
    getFinalData
    compareTo
    setX
    isEmpty
    
    */
    
    /*Normalmente, un método tiene un nombre único dentro de su clase. Sin embargo, 
    un método puede tener el mismo nombre que otros métodos debido a la sobrecarga de métodos.*/
    
    //Overloading Methods

    /*El lenguaje de programación de Java admite métodos de sobrecarga, 
    y Java puede distinguir entre métodos con diferentes firmas de métodos. 
    Esto significa que los métodos dentro de una clase pueden tener el mismo nombre 
    si tienen diferentes listas de parámetros (hay algunos requisitos para esto que se tratarán 
    en la lección titulada "Interfaces y herencia").
    */
    
    /*Supongamos que tiene una clase que puede usar la caligrafía para dibujar varios tipos de datos 
    (cadenas, enteros, etc.) y que contiene un método para dibujar cada tipo de datos. 
    Es incómodo utilizar un nuevo nombre para cada método, 
    por ejemplo, drawString, drawInteger, drawFloat, etc. En el lenguaje de programación Java, 
    puede usar el mismo nombre para todos los métodos de dibujo, 
    pero pase una lista de argumentos diferente a cada método. Por lo tanto, 
    la clase de dibujo de datos podría declarar cuatro métodos llamados draw, 
    cada uno de los cuales tiene una lista de parámetros diferente.*/
    
    public class DataArtist {
  
    public void draw(String s) {
        
    }
    public void draw(int i) {
        
    }
    public void draw(double f) {
        
    }
    public void draw(int i, double f) {
        
    }
    public void draw(double f,int i){
        
    }
}
    
    
    /*Los métodos sobrecargados se diferencian por el número y el tipo de los argumentos pasados al método. 
    En el ejemplo de código, draw (String s) y draw (int i) son métodos distintos y únicos porque requieren 
    diferentes tipos de argumentos.*/
    
    /*No puede declarar más de un método con el mismo nombre y el mismo número y tipo de argumentos, 
    porque el compilador no puede diferenciarlos.*/
    
    /*El compilador no considera el tipo de retorno al diferenciar métodos, 
    por lo que no puede declarar dos métodos con la misma firma, 
    incluso si tienen un tipo de retorno diferente.*/
    
    //Nota: los métodos sobrecargados se deben usar con moderación, 
    //ya que pueden hacer que el código sea mucho menos legible.
    
    /*Providing Constructors for Your Classes*/
    
    /*Proporcionar constructores para sus clases
    Una clase contiene constructores que se invocan para crear objetos a partir del plano de la clase. 
    Las declaraciones de constructores se parecen a las declaraciones de métodos,
    excepto que usan el nombre de la clase y no tienen ningún tipo de retorno. 
    Por ejemplo, Bicycle tiene un constructor:*/
    /*
    public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}*/
    //Para crear un nuevo objeto Bicycle llamado myBike, el operador nuevo llama a un constructor:
    Bicycle myBike = new Bicycle(30, 0, 8);
    //new Bicycle(30, 0, 8) crea espacio en la memoria para el objeto e inicializa sus campos.
    
    /*Aunque Bicycle solo tiene un constructor, podría tener otros, incluido un constructor sin argumentos:*/
    /*public Bicycle() {
    gear = 1;
    cadence = 10;
    speed = 0;
}*/
//Bicycle yourBike = new Bicycle(); invokes the no-argument 
  //constructor to create a new Bicycle object called yourBike.
    
    /*Ambos constructores podrían haber sido declarados en Bicycle porque tienen listas 
    de argumentos diferentes. Al igual que con los métodos, 
    la plataforma Java diferencia a los constructores en base al número de argumentos en 
    la lista y sus tipos. No puede escribir dos constructores que tengan el mismo número y 
    tipo de argumentos para la misma clase, porque la plataforma no podría distinguirlos. 
    Hacerlo causa un error en tiempo de compilación.*/
    
    /*No tiene que proporcionar ningún constructor para su clase, pero debe tener cuidado al hacer esto. 
    El compilador proporciona automáticamente un constructor predeterminado sin argumentos para cualquier 
    clase sin constructores. Este constructor predeterminado llamará al 
    constructor sin argumentos de la superclase. En esta situación, 
    el compilador se quejará si la superclase no tiene un constructor sin argumentos, 
    por lo que debe verificar que así sea. Si su clase no tiene una superclase explícita, 
    entonces tiene una superclase implícita de Object, que tiene un constructor sin argumentos.*/
    
    /*Puede utilizar un constructor de superclase usted mismo. 
    La clase MountainBike al comienzo de esta lección hizo justamente eso. 
    Esto se discutirá más adelante, en la lección sobre interfaces y herencia.*/
    
    /*Puede usar modificadores de acceso en una declaración del constructor 
    para controlar qué otras clases pueden llamar al constructor.*/

    
    //Nota: si otra clase no puede llamar a un constructor MyClass, no puede crear directamente objetos MyClass.
    
    /*La declaración para un método o un constructor declara el número y el tipo de los 
    argumentos para ese método o constructor. Por ejemplo, 
    el siguiente es un método que calcula los pagos mensuales de un préstamo hipotecario, 
    según el monto del préstamo, la tasa de interés, la duración del préstamo (el número de períodos)
    y el valor futuro del préstamo:*/
    
    public double computePayment(
          double loanAmt,
          double rate,
          double futureValue,
      int numPeriods) {
    double interest = rate / 100.0;
    double partial1 = Math.pow((1 + interest), 
                    - numPeriods);
    double denominator = (1 - partial1) / interest;
    double answer = (-loanAmt / denominator)
                    - ((futureValue * partial1) / denominator);
    return answer;
}   
    
    /*Este método tiene cuatro parámetros: el monto del préstamo, la tasa de interés, 
    el valor futuro y el número de períodos. Los tres primeros son números de punto 
    flotante de doble precisión y el cuarto es un número entero.
    Los parámetros se utilizan en el cuerpo del método y en el tiempo de ejecución 
    tomarán los valores de los argumentos que se pasan.*/
    
    /*Nota: los parámetros se refieren a la lista de variables en una declaración de método. 
    Los argumentos son los valores reales que se pasan cuando se invoca el método. Cuando invoca un método, 
    los argumentos utilizados deben coincidir con los parámetros de la declaración en tipo y orden.*/
    
    //Parameter Types
    
    /*Puede utilizar cualquier tipo de datos para un parámetro de un método o un constructor. 
    Esto incluye tipos de datos primitivos, como dobles, flotantes y enteros, 
    como se vio en el método computePayment, y tipos de datos de referencia, como objetos y matrices.*/
    
    /*Aquí hay un ejemplo de un método que acepta una matriz como argumento. En este ejemplo, 
    el método crea un nuevo objeto Polygon y lo inicializa desde una matriz de objetos Point 
    (asumiendo que Point es una clase que representa una coordenada x, y):*/
    /*
    public Polygon polygonFrom(Point[] corners) {
    // method body goes here
}*/
    
    /*Nota: Si desea pasar un método a un método, use una expresión lambda o una referencia de método.*/
    
    //Arbitrary Number of Arguments
    
    /*Puede usar una construcción llamada varargs para pasar un número arbitrario de valores a un método. 
    Utiliza varargs cuando no sabe cuántos de un tipo particular de argumento se pasarán al método.
    Es un método abreviado para crear una matriz manualmente 
    (el método anterior podría haber utilizado varargs en lugar de una matriz).*/
    
    /*Para usar varargs, siga el tipo del último parámetro con puntos suspensivos (tres puntos, ...), 
    luego un espacio y el nombre del parámetro. 
    El método puede entonces ser llamado con cualquier número de ese parámetro, incluyendo ninguno.*/
    /*
    public Polygon polygonFrom(Point... corners) {
    int numberOfSides = corners.length;
    double squareOfSide1, lengthOfSide1;
    squareOfSide1 = (corners[1].x - corners[0].x)
                     * (corners[1].x - corners[0].x) 
                     + (corners[1].y - corners[0].y)
                     * (corners[1].y - corners[0].y);
    lengthOfSide1 = Math.sqrt(squareOfSide1);

    // more method body code follows that creates and returns a 
    // polygon connecting the Points
}*/
    
    /*Se puede ver que, dentro del método, las esquinas se tratan como una matriz. 
    El método se puede llamar con una matriz o con una secuencia de argumentos. 
    El código en el cuerpo del método tratará el parámetro como una matriz en cualquier caso.*/
    
    //Lo más común es ver varargs con los métodos de impresión; por ejemplo, este método printf:
    //public PrintStream printf(String format, Object... args)

    /*le permite imprimir un número arbitrario de objetos. Se puede llamar así:*/
    //System.out.printf("%s: %d, %s%n", name, idnum, address);

    //o así
    //System.out.printf("%s: %d, %s, %s, %s%n", name, idnum, address, phone, email);

    //o con aún un número diferente de argumentos.
    
    //Parameter Names

    /*Cuando declara un parámetro a un método o un constructor, 
    proporciona un nombre para ese parámetro. 
    Este nombre se usa dentro del cuerpo del método para referirse al argumento pasado.*/
    
    /*El nombre de un parámetro debe ser único en su alcance. 
    No puede ser el mismo que el nombre de otro parámetro para el mismo método o constructor, 
    y no puede ser el nombre de una variable local dentro del método o constructor.*/

    
    /*Un parámetro puede tener el mismo nombre que uno de los campos de la clase. 
    Si este es el caso, se dice que el parámetro sombrea el campo. 
    Los campos de sombreado pueden hacer que su código sea difícil de leer y se 
    usa convencionalmente solo en constructores y métodos que establecen un campo en particular. 
    Por ejemplo, considere la siguiente clase de círculo y su método setOrigin:*/
    
    public class Circle {
    private int x, y, radius;
    public void setOrigin(int x, int y) {
        
    }
}
    /*La clase Círculo tiene tres campos: x, y y radio. 
    El método setOrigin tiene dos parámetros, 
    cada uno de los cuales tiene el mismo nombre que uno de los campos. 
    Cada parámetro del método sombrea el campo que comparte su nombre. 
    Por lo tanto, utilizar los nombres simples x o y dentro del cuerpo del método se 
    refiere al parámetro, no al campo. Para acceder al campo, debe utilizar un nombre calificado. 
    Esto se tratará más adelante en esta lección en la sección titulada "Uso de esta palabra clave".*/
    
    //Passing Primitive Data Type Arguments

    /*Los argumentos primitivos, como un int o un double, se pasan a los métodos por valor. 
    Esto significa que cualquier cambio en los valores de los parámetros existe solo dentro 
    del alcance del método. Cuando el método vuelve, los parámetros desaparecen y cualquier 
    cambio en ellos se pierde. Aquí hay un ejemplo:*/
    
    public class PassPrimitiveByValue {

    public  void main(String[] args) {
           
        int x = 3;
           
        // invoke passMethod() with 
        // x as argument
        passMethod(x);
           
        // print x to see if its 
        // value has changed
        System.out.println("After invoking passMethod, x = " + x);
           
    }
        
    // change parameter in passMethod()
    public void passMethod(int p) {
        p = 10;
    }
}
    //Cuando ejecutas este programa, la salida es:
    //After invoking passMethod, x = 3

    //Passing Reference Data Type Arguments

    /*Los parámetros de tipo de datos de referencia, como los objetos, 
    también se pasan a los métodos por valor. Esto significa que cuando el método vuelve, 
    la referencia pasada sigue haciendo referencia al mismo objeto que antes. 
    Sin embargo, los valores de los campos del objeto se pueden cambiar en el método, 
    si tienen el nivel de acceso adecuado.*/
    
    //Por ejemplo, considere un método en una clase arbitraria que mueve objetos de círculo:
    /**public void moveCircle(Circle circle, int deltaX, int deltaY) {
    // code to move origin of circle to x+deltaX, y+deltaY
    circle.setX(circle.getX() + deltaX);
    circle.setY(circle.getY() + deltaY);
        
    // code to assign a new reference to circle
    circle = new Circle(0, 0);
}*/
    //Deja que el método sea invocado con estos argumentos:
    
    //moveCircle(myCircle, 23, 56)

    /*Dentro del método, el círculo inicialmente se refiere a myCircle. 
    El método cambia las coordenadas x e y del objeto que el círculo hace referencia 
    (es decir, myCircle) en 23 y 56, respectivamente. 
    Estos cambios persistirán cuando el método regrese. 
    Luego, se asigna una referencia a un nuevo objeto Circle con x = y = 0. Esta reasignación 
    no tiene permanencia, sin embargo, porque la referencia se pasó por valor y no puede cambiar. 
    Dentro del método, el objeto al que apunta el círculo ha cambiado, pero cuando el método vuelve, 
    myCircle todavía hace referencia al mismo objeto Círculo que antes de que se llamara el método.*/
   
    
    
   
    
}
