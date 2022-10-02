package registroHospital;

public class Paciente extends Persona{
    
     //Atributos de la subclase
    private String direccion;
    private String lugarAtendido;
    private String motivoConsulta;
    private String atendMedico;
    private String fechaConsulta;
    
    //Constructor de la clase
    public Paciente() {
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Usamos el operador super para establecer el constructor de la superclase (constructor sobrecargado)
    public Paciente(String nombres, String apellidos, double codigo, String sexo, String direccion, String lugarAtendido, String motivoConsulta, String atendMedico, String fechaConsulta) {
        super(nombres, apellidos, codigo, sexo);
        this.direccion = direccion;
        this.lugarAtendido = lugarAtendido;
        this.motivoConsulta = motivoConsulta;
        this.atendMedico = atendMedico;
        this.fechaConsulta = fechaConsulta;
    }

    
    
    //Métodos de encapsulamiento

    public String getLugarAtendido() {
        return lugarAtendido;
    }

    public void setLugarAtendido(String lugarAtendido) {
        this.lugarAtendido = lugarAtendido;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getAtendMedico() {
        return atendMedico;
    }

    public void setAtendMedico(String atendMedico) {
        this.atendMedico = atendMedico;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
    
    
    //Métodos propios de Paciente
    
    public Paciente ingresarDatosPaciente() {
        Paciente nuevoPaciente = new Paciente();
        String nombres = "";
        String apellidos = "";
        int codigo = 0;
        String sexo="";
        String direccion ="";
        String motivoConsulta="";
        String medico="";
        String fechaCons="";
        String lugarAtencion ="";
        
        
        //Definimos los datos para el constructor
        
        nuevoPaciente.setNombres(nombres);
        nuevoPaciente.setApellidos(apellidos);
        nuevoPaciente.setSexo(sexo);
        nuevoPaciente.setCodigo(codigo);
        nuevoPaciente.setDireccion(direccion);
        nuevoPaciente.setMotivoConsulta(motivoConsulta);
        nuevoPaciente.setAtendMedico(medico);
        nuevoPaciente.setFechaConsulta(fechaCons);
        nuevoPaciente.setLugarAtendido(lugarAtencion);
        
        return (nuevoPaciente);
    }
}
    
   
