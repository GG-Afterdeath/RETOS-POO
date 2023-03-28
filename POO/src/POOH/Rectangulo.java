package POOH;

public class Rectangulo extends Figu{

    
    
    private double altura;
    private double base;

    public Rectangulo(double altura, double base){
        this.altura=altura;
        this.base=base;
    }

    //Métodos accesores para los atributos de esta clase
        public double getAltura(){
            return altura;
        }

        public void setAltura(){
            this.altura=altura;
        }

        public double getBase(){
            return base;
        }

        public void setBase(){
            this.base=base;
        }
    
//Método heredado en esta sub clase

    public void calcularArea() {
        double area=0;
        area=(base*altura)/2;
        System.out.println("Ha ingresado que áltura es " +altura +" y que la base es " +base+ "\n"+ "El resultado de la operación es " +area);
    


}
}