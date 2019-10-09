
package barrio;


public class Residencial extends Barrio{
    
    private int numeroDeEdificios;
    private boolean calidadDeVida;
    private boolean ruido; 

    public Residencial(int numeroDeEdificios, boolean calidadDeVida, boolean ruido, int numeroDeCasas, boolean casetaComunal, String nombre, int numeroDeParques, boolean criminalidad) {
        super(numeroDeCasas, casetaComunal, nombre, numeroDeParques, criminalidad);
        this.numeroDeEdificios = numeroDeEdificios;
        this.calidadDeVida = calidadDeVida;
        this.ruido = ruido;
    }
    
    public void crecientePoblacional(){
        calidadDeVida = true;
    }
    
    public void crecientePoblacional(boolean aumento){
        this.calidadDeVida = true;
        this.ruido = aumento;
    }

    public int getNumeroDeEdificios() {
        return numeroDeEdificios;
    }

    public void setNumeroDeEdificios(int numeroDeEdificios) {
        this.numeroDeEdificios = numeroDeEdificios;
    }

    public boolean isCalidadDeVida() {
        return calidadDeVida;
    }

    public void setCalidadDeVida(boolean calidadDeVida) {
        this.calidadDeVida = calidadDeVida;
    }

    public boolean isRuido() {
        return ruido;
    }

    public void setRuido(boolean ruido) {
        this.ruido = ruido;
    }
    
 
}
