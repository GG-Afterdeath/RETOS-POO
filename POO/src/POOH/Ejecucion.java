package POOH;
import java.util.Scanner;

public class Ejecucion {
 
    public static void main (String[] args){
        double altura;
        double base;
        double radio;
        String respuesta = "si";

        Scanner ingreso=new Scanner(System.in);
        
        while(respuesta.equals("si")) {
            //Pedir los atributos de la subclase
            System.out.println("Hola, ingrese el valor de la altura del triangulo: ");
            altura=ingreso.nextDouble();
            System.out.println("Y ahora el valor de la base del triangulo : ");
            base=ingreso.nextDouble();
            //Instanciar el objeto de la subclase TRIANGULO
            Triangulo tt=new Triangulo(altura, base);
            tt.calcularArea();
        
            //Se hace el mismo procedimiento para RECTANGULO
            System.out.println("Por favor ingrese el valor de la base del rectangulo: ");
            base=ingreso.nextDouble();
            System.out.println("Ingrese la altura de dicho rectangulo: ");
            altura=ingreso.nextDouble();
            Rectangulo erre=new Rectangulo(altura, base);
            erre.calcularArea();
            
            //Ingresamos el método de ejecucion para Círculo
            System.out.println("Por favor ingrese el valor de radio del círculo : ");
            radio=ingreso.nextDouble();
            Circulo sirculo=new Circulo(radio);
            sirculo.calcularArea();
            
            // Preguntar si quiere seguir jugando
            System.out.println("¿Quiere seguir jugando? (si/no)");
            respuesta = ingreso.next();
        }
        ingreso.close();
    }
}

