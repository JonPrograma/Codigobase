
package C_Clases_y_objetos;

/**
 *
 * @author ooku
 */
public class C2_Objetos {
     // obects
    
    
    /*Objetos
    
    Un programa Java típico crea muchos objetos que, como saben, interactúan invocando métodos. 
    A través de estas interacciones de objetos, un programa puede realizar varias tareas, 
    como implementar una GUI, ejecutar una animación o enviar y recibir información a través de una red.
    Una vez que un objeto ha completado el trabajo para el que fue creado, 
    sus recursos se reciclan para ser utilizados por otros objetos.

    Aquí hay un pequeño programa, llamado CreateObjectDemo, que crea tres objetos: 
    un objeto Point y dos objetos Rectangle. 
    Necesitarás los tres archivos fuente para compilar este programa.*/
  
    public static void main(String[] args) {
		
        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
	
        
        
        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());
		
        // set rectTwo's position
        rectTwo.origin = originOne;
		
        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
		
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
    
    //Este programa crea, manipula y muestra información sobre varios objetos. Aquí está la salida:

/*
    Width of rectOne: 100
Height of rectOne: 200
Area of rectOne: 20000
X Position of rectTwo: 23
Y Position of rectTwo: 94
X Position of rectTwo: 40
Y Position of rectTwo: 72*/
  
    /*Las siguientes tres secciones usan el ejemplo anterior para describir el ciclo de vida de un objeto 
    dentro de un programa. A partir de ellos, aprenderá a escribir código que crea y utiliza objetos en sus propios programas. 
    También aprenderá cómo se limpia el sistema después de un objeto cuando su vida ha terminado.*/
    
}
