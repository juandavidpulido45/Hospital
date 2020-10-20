package hospital;

public class DispositivoMedico {
    private int valor;
    private String referencia;
    
    public DispositivoMedico(int valor, String referencia){
        this.valor = valor;
        this.referencia = referencia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public static void main(String[] args) {
        DispositivoMedico dispositivoMedicoUno = new DispositivoMedico(10000000, "Olympus");
        DispositivoMedico dispositivoMedicoDos = new DispositivoMedico(23000000, "Siemens");
        
        System.out.println(dispositivoMedicoUno.getValor());
        System.out.println(dispositivoMedicoUno.getReferencia());
        
    }
    
    public boolean getCantidadDeHorasActivo() {
        throw new UnsupportedOperationException();
    }

    public boolean getDispositivoEnUso() {
        throw new UnsupportedOperationException();
    }

    public void registrarHoras() {
        throw new UnsupportedOperationException();
    }
}
