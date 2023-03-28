package Principal;
import java.util.Scanner;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args){

        Persona people=new Persona();

        people.pedirDAtos();
        people.mostrarPersona();
        people.calcularImc();
        people.mayorEdad();

    }   
}
