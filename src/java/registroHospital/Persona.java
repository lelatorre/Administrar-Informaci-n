package registroHospital;


/**
 * Clase Java para implementar una superclase padre que maneja los datos de un
 * objeto de tipo persona de forma genérica
 */
public class Persona {

    //Atributos de la clase
    protected String nombres;
    protected String apellidos;
    protected double codigo;
    protected String sexo;

    //Constructor de la clase
    public Persona() {

    }

    //Constructor sobrecargado
    public Persona(String nombres, String apellidos, double codigo, String sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.sexo = sexo;

    }

    //Métodos de encapsulamiento
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;

    }

}
