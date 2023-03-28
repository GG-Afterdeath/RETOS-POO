package POOH;

public class Circulo extends Figu{

    private double pi=3.1415;    
    private double radio;

//Método constructor
    public Circulo(double radio){
        this.radio=radio;
    };
    //Setters % Getters
    public double getPi(){
        return pi;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(){
        this.radio=radio;
    }
//Ahora llenamos el método que heredamos
    public void calcularArea() {
        double area=0;
        area=pi*(radio*radio);
            System.out.println("El área de su círculo es "+area);
        
    }
    
}
