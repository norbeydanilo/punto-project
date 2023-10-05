public class Punto3D extends PuntoTiempo {
    private int z;

    // Método constructor
    public Punto3D(int x, int y, int z, int t){
        super(x, y, t); // referencia al método constructor de la superclase
        this.z = z;
    }

    /*
     * Sobreescritura (redefinición) de método -- polimorfismo dinámico
     */
    @Override
    public double modulo(){
        return Math.sqrt(this.getX()*this.getX() + this.getY()*this.getY() + 
        this.z*this.z);
    }
}
