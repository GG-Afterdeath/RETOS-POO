package Games;

public class Ejecutar {
        public static void main(String[] args){
//instanciamos objeto de la clase que queremos llamar
            ppt piedra=new ppt();
//Traemos lo métodos de la clase para que lo use el objeto
            piedra.inicio();
            piedra.juego();
            piedra.late();
        }
}
