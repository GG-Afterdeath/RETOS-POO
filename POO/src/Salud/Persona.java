package Salud;
import java.util.Scanner;

public class Persona {
    //Declarar los atributos de la clase Persona
Scanner wasd = new Scanner(System.in);

    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public String sexo;

    //Creación de métodos

    public void pedirDAtos(){
        System.out.println("Ingrese su tipo de documento: ");
            tipoDoc=wasd.next();
        System.out.println("Ingrese su número de documento: ");
            documento=wasd.nextInt();
        System.out.println("Ingrese su nombre: ");
            nombre=wasd.next();
        System.out.println("Ingrese su apellido: ");
            apellido=wasd.next();
        System.out.println("Digíte su peso corporal : ");
            peso=wasd.nextDouble();
        System.out.println("Digíte su estatura en : ");
            estatura=wasd.nextDouble();
        System.out.println("Ingrese su edad: ");
            edad=wasd.nextInt();
        System.out.println("Escriba su sexo");
            sexo=wasd.next();
    }

    public void mostrarPersona(){
        System.out.println("Datos ingresados:\n" +tipoDoc+
        "\n"+documento+"\n"+nombre+"\n"+apellido+"\n"+peso+"\n"
        +estatura+"\n"+sexo);
    }

           public double calcularImc(){
            //Math.pow es una función que eleva al cuadrado el dato 
            double pesoActual=peso/Math.pow(estatura, 2);

            if (pesoActual <20){
                System.out.println("La persona se encuentra en infrapeso");
            }else if(pesoActual >25){
                System.out.println("La persona tiene sobrepeso");
            } else {
                System.out.println("La persona se encuentra en normopeso");
            }
            return pesoActual;
        }
    
    public void mayorEdad(){
        if(edad>18){
            System.out.println("Usted es mayor de edad\n " +"Su edad: "+edad);
        } else{
            System.out.println("Usted es menor de edad \n" +"Su edad: "+edad);
        }

        

    }


}