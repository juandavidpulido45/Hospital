package hospital;

import java.util.Date;


public class Hospital {

    private String nombre;
    private int cantidadDeEnfermeros;
    private Date fechaDeCreacion;
    private String especialidad;
    private Boolean capacidadParaAltoRiesgo;

    public Hospital(String nombre, int cantidadDeEnfermeros, Date fechaDeCreacion, String especialidad, Boolean capacidadParaAltoRiesgo) {
        this.nombre = nombre;
        this.cantidadDeEnfermeros = cantidadDeEnfermeros;
        this.fechaDeCreacion = fechaDeCreacion;
        this.especialidad = especialidad;
        this.capacidadParaAltoRiesgo = capacidadParaAltoRiesgo;
    }
    
    /**
     * Este método incrementa nuestra cantidad de enfermeros del hospital
     * Y tambien lo vuelve un hospital con mayor capacidad para situaciones de alto riesgo
     */
    public void agregarEmpleados(){
        this.cantidadDeEnfermeros += 10;
        this.capacidadParaAltoRiesgo = true;
    }
    
    /**
     * Este método facilita la eleccion de la especialidad del hospital y tambien su nombre
     */
    public void nuevoComienzo(String nuevoNombre, String nuevaEspecialidad){
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad;
        this.cantidadDeEnfermeros += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeEnfermeros() {
        return cantidadDeEnfermeros;
    }

    public void setCantidadDeEnfermeros(int cantidadDeEnfermeros) {
        this.cantidadDeEnfermeros = cantidadDeEnfermeros;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getCapacidadParaAltoRiesgo() {
        return capacidadParaAltoRiesgo;
    }

    public void setCapacidadParaAltoRiesgo(Boolean capacidadParaAltoRiesgo) {
        this.capacidadParaAltoRiesgo = capacidadParaAltoRiesgo;
    }
    
    public static void main(String[] args) {
        Hospital hospitalUno = new Hospital("Super Salud",85,new Date(),"Atencion al publico de todo tipo",false);
        Hospital hospitalDos = new Hospital("Maxi Salud",35,new Date(),"Urgencias y Citas prioritarias",true);
        
        System.out.println(hospitalUno.getNombre());
        System.out.println(hospitalUno.getCantidadDeEnfermeros());
        System.out.println(hospitalUno.getCapacidadParaAltoRiesgo());
        
        hospitalUno.agregarEmpleados();
        
        System.out.println(hospitalUno.getNombre());
        System.out.println(hospitalUno.getCantidadDeEnfermeros());
        System.out.println(hospitalUno.getCapacidadParaAltoRiesgo());
    }

    public boolean getCantidadDeMedicamentosExistentes() {
        throw new UnsupportedOperationException();
    }

    public boolean getHospitalEnServicio() {
        throw new UnsupportedOperationException();
    }

    public void almacenarMedicamentos() {
        throw new UnsupportedOperationException();
    }

}
