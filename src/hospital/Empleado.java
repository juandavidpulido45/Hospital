package hospital;

public class Empleado {
    private String nombre;
    private String apellido;
    
    public Empleado (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado("Jorge", "Bermudez");
        Empleado empleadoDos = new Empleado("Juancho", "Cacasas");
        
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
