package hospital;

public class EmpleadoDelMes extends Empleado{
    private String areaDestacada;
    private int cantidadDeHorasTrabajadas;
    private String permanencia;
    private Boolean empleadoEnServicio;
    
    public EmpleadoDelMes(String nombre, String apellido, int cantidadDeHorasTrabajadas, String areaDestacada, String permanencia, Boolean empleadoEnServicio){
        super(nombre, apellido, cantidadDeHorasTrabajadas, empleadoEnServicio, nombre);
        this.areaDestacada = areaDestacada;
        this.permanencia = permanencia;
    }
    
    public void registrarTiempo(){
        this.cantidadDeHorasTrabajadas += 12;
        this.empleadoEnServicio = true;
    }

    public String getAreaDestacada() {
        return areaDestacada;
    }

    public void setAreaDestacada(String areaDestacada) {
        this.areaDestacada = areaDestacada;
    }

    public String getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(String permanencia) {
        this.permanencia = permanencia;
    }
    
    
}
