package hospital;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private Boolean profesional;
    private String enfasis;
    
    public Empleado (String nombre, String apellido, int edad, Boolean profesional, String enfasis){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesional = profesional;
        this.enfasis = enfasis;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getProfesional() {
        return profesional;
    }

    public void setProfesional(Boolean profesional) {
        this.profesional = profesional;
    }

    public String getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(String enfasis) {
        this.enfasis = enfasis;
    }
    
    
    
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado("Jorge", "Bermudez", 24, false, "dialisis");
        Empleado empleadoDos = new Empleado("Juancho", "Cacasas", 35, true, "dialisis");
        
        System.out.println(empleadoUno.getNombre());
        System.out.println(empleadoUno.getApellido());
        
    }
    
    public boolean getCantidadDeHorasTrabajadas() {
        throw new UnsupportedOperationException();
    }

    public boolean getEmpleadoEnServicio() {
        throw new UnsupportedOperationException();
    }

    public void registrarTiempo() {
        throw new UnsupportedOperationException();
    }
    
}
