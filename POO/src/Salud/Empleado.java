package Salud;
//REGLAS
//Nombre inicia en mayúscula y en singular
//Encapsulamiento
//Constructores
//Métodos

public class Empleado extends Persona {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    public Empleado() {
        super();
        this.cargo="";
        this.valorHora=0.0;
        this.horasTrabajadas=0;
        this.departamento="";
    }


    public Empleado(String tipoDoc, String documento, String nombre, String apellido,
                    String cargo, double valorHora, int horasTrabajadas, String departamento) {
        super (tipoDoc, documento, nombre, apellido);
        this.cargo= cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public double calcularHonorarios() {
        double total = valorHora * horasTrabajadas;
        // RETEICA es el 0.966% dividiendo total
        double retencion = total * 0.00966; 
        return total - retencion;
    }

    public void imprimirDatosEmpleado() {
        System.out.println("Tipo de documento: " +getTipoDoc());
        System.out.println("Número de documento: " +getDocumento());
        System.out.println("Nombres: " +getNombre());
        System.out.println("Apellidos: " +getApellido());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }
}
