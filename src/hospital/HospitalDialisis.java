package hospital;

import java.util.Date;

public class HospitalDialisis extends Hospital{
    
    private String nombre;
    private int cantidadDeMedicamentosExistentes;
    private Date fechaDeCreacion;
    private String especialidad;
    private Boolean hospitalEnServicio;
    
    public HospitalDialisis(String nombre, int cantidadDeMedicamentosExistentes, Date fechaDeCreacion, String especialidad, Boolean hospitalEnServicio) {
        super(nombre, cantidadDeMedicamentosExistentes, fechaDeCreacion, especialidad, hospitalEnServicio);
    }
    
    /**
     * Este método incrementa nuestra cantidad de medicamentos existentes en el hospital
     * Y tambien lo convierte en un hospital en servicio
     */
    public void almacenarMedicamentos(){
        this.cantidadDeMedicamentosExistentes += 30;
        this.hospitalEnServicio = true;
    }
    
    /**
     * Este método facilita la entrega de medicamentos
     */
    public void entregaDeMedicamentos(){
        this.cantidadDeMedicamentosExistentes -= 20;
        this.hospitalEnServicio = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidadDeMedicamentosExistentes(int cantidadDeMedicamentosExistentes) {
        this.cantidadDeMedicamentosExistentes = cantidadDeMedicamentosExistentes;
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

    public Boolean hospitalEnServicio() {
        return hospitalEnServicio;
    }

    public void sethospitalEnServicio(Boolean hospitalEnServicio) {
        this.hospitalEnServicio = hospitalEnServicio;
    }
    
    public static void main(String[] args) {
        Hospital hospitalDialisisUno = new Hospital("H.D. SEDE 1",460,new Date(),"Dialisis Tipo 1",false);
        Hospital hospitalDialisisDos = new Hospital("H.D. SEDE 2",272,new Date(),"Dialisis Tipo 2",true);
        
        System.out.println(hospitalDialisisUno.getNombre());
        System.out.println(hospitalDialisisUno.getCantidadDeMedicamentosExistentes());
        System.out.println(hospitalDialisisUno.getHospitalEnServicio());
        
        hospitalDialisisUno.almacenarMedicamentos();
        
        System.out.println(hospitalDialisisUno.getNombre());
        System.out.println(hospitalDialisisUno.getCantidadDeMedicamentosExistentes());
        System.out.println(hospitalDialisisUno.getHospitalEnServicio());
    }
    
}
