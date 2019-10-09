
package barrio;


public class Comercial extends Barrio{
    
    private int numeroDeNegocios;
    private Boolean consumoElectrico ;
    private boolean trabajo;

    public Comercial(int numeroDeNegocios, Boolean consumoElectrico, boolean empleo, int numeroDeCasas, boolean casetaComunal, String nombre, int numeroDeParques, boolean criminalidad) {
        super(numeroDeCasas, casetaComunal, nombre, numeroDeParques, criminalidad);
        this.numeroDeNegocios = numeroDeNegocios;
        this.consumoElectrico = consumoElectrico;
        this.trabajo = empleo;
    }
    
    public void aumentoComercial(){
        numeroDeNegocios += 10;
    }
    
    public void aumentoComercial(boolean empleo){
        this.numeroDeNegocios += 10 ;
        this.trabajo = empleo ;
    }

    public int getNumeroDeNegocios() {
        return numeroDeNegocios;
    }

    public void setNumeroDeNegocios(int numeroDeNegocios) {
        this.numeroDeNegocios = numeroDeNegocios;
    }

    public Boolean getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(Boolean consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public boolean isEmpleo() {
        return trabajo;
    }

    public void setEmpleo(boolean empleo) {
        this.trabajo = empleo;
    }
    
    
    
}
