public class PuntoTiempo extends Punto {
    private int t;
    /*
     * Sobrecarga de métodos -- polimorfismo estático.
     * Los métodos constructores llevan el mismo nombre pero difieren en cantidad de parámetros.
     */
    public PuntoTiempo(int x, int y, int t){
        super(x, y); // referencia al método constructor de la superclase
        this.setT(t);
    }
    public PuntoTiempo(){
        this(0, 0, 0);
    }
    /*
     * Métodos de modificación y acceso
     */
    public int getT(){
        return this.t;
    }
    public final void setT(int t){
        this.t = t;
    }
    public double velocidad(){
        return this.modulo() / this.getT(); // modulo método heredado de la clase padre
    }
}
