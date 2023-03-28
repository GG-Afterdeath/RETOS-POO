package Games;
import java.util.Scanner;

public class ppt implements Jueguitos{

    //Declarar atributos
    private String name;
    private int jugador;
    private int bot;

    Scanner titi= new Scanner(System.in);

    public void inicio(){
        System.out.println("Hola ingresa tu nombre: ");
        name=titi.next();
    }

    public void juego(){

        System.out.println("El bot ya eligió");
        int bot=(int)(Math.random()*3)+1;

        System.out.println(name +" Haz tu eleccion\n 1.PAPEL 2.PIEDRA 3.TIJERA");

        jugador=titi.nextInt();

        switch(jugador){
            case 1:
                System.out.println("Mi socio juega papel...");
                switch (bot){
                    case 1: System.out.println("Y.. El bot saca papel, Entonces hay un empate");
                        break;
                    case 2: System.out.println("Y.. Su papel se come la piedra del bot, enhorabuena");
                        break;
                    case 3: System.out.println("El bot contraataca con unas tijeras y le gana a su papelito");
                        break;
                }
                break;
            case 2:
                System.out.println("El master lanza una piedra... ");
                switch (bot){
                    case 1: System.out.println(".. A la cual el bot la atrapa usando un papel. perdiste XD");
                        break;
                    case 2: System.out.println(".. El bot le responde tirando una piedra, se chocan en el aire y PUM!!, Empate");
                        break;
                    case 3: System.out.println(".. El bot trata de defenderse usando unas tijeras que se rompen por la piedra, congrats, le ganó al bot y lo descalabró, que grande");
                        break;
                }
                break;
            case 3:
                System.out.println("Se puso peleón con las tijeras ");
                switch (bot) {
                    case 1: System.out.println(".. Ganas ya que las tijeras hacen añicos el escudo de papel del bot");
                        break;
                    case 2: System.out.println(".. Tus tijeretas las rompe el rocazo que le dio el bot, Pierdes por que fuiste descalabrado");
                        break;
                    case 3: System.out.println(".. Quedan en empate ya que el bot mando unas tijeras a hacer un duelo");
                        break;
                }
                break;
        }
    }

    public void late(){
        
        System.out.println("Gracias por jugar "+ name + " Puedes seguir jugando si quieres");
      String continuar = "si";
        while (continuar.equals("si")) {
            System.out.println("¡Juguemos a piedra, papel o tijera!");
            System.out.println("Ingresa tu jugada\n 1. PAPEL 2. PIEDRA 3. TIJERA");
            jugador = titi.nextInt();
            juego();
            System.out.println("¿Quieres volver a jugar? (s/n)");
            continuar = titi.next();
        }
    }


       
    }

