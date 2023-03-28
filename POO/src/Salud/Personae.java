package Salud;

public class Personae {
   
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;


    public Personae(){

    }
  
    public Personae(String tipoDoc, String documento, String nombre, String apellido){
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos getter y setter para los atributos privados
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc =tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento =documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese el tipo de documento:");
        String tipoDoc = scanner.nextLine();
        setTipoDoc(tipoDoc);
    
        System.out.println("Ingrese el número de documento:");
        String documento = scanner.nextLine();
        setDocumento(documento);
    
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        setNombre(nombre);
    
        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();
        setApellido(apellido);
    }
    
}