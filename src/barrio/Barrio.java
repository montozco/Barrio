
package barrio;

public class Barrio {
    private int numeroDeCasas;
    private boolean casetaComunal;
    private String nombre;
    private int numeroDeParques;
    private boolean criminalidad;

    public Barrio(int numeroDeCasas, boolean casetaComunal, String nombre, int numeroDeParques, boolean criminalidad) {
        this.numeroDeCasas = numeroDeCasas;
        this.casetaComunal = casetaComunal;
        this.nombre = nombre;
        this.numeroDeParques = numeroDeParques;
        this.criminalidad = criminalidad;
    }
    
    public void ampliarZonasVerdes(){
        numeroDeParques += 5;
    }
    
    public void aumentoCasas(){
        numeroDeCasas += 10;
    }
    
    public void juntaDeAccionComunal(){
        casetaComunal = true;
    }
    
    public void seguridadPolicial(){
        criminalidad = true;
    }
    
    public void nombreDelBarrio(String nBarrio){
        nombre = nBarrio;
    }
    
    public void aumentoCasas(int cantidadDeCasasNuevas){
        if(cantidadDeCasasNuevas<=this.numeroDeCasas){
            System.out.println("No se han construido más casas nuevas");
        }else{
            this.numeroDeCasas = cantidadDeCasasNuevas;
            System.out.println("La cantidad de casas actuales son: " + 
                    String.valueOf(cantidadDeCasasNuevas));
        }
    }
 
    
}
