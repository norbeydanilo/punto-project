public class Punto3D extends PuntoTiempo {
    private int z;

    // Método constructor
    public Punto3D(int x, int y, int z, int t){
        super(x, y, t); // referencia al método constructor de la superclase
        this.z = z;
    }

    /*
     * Sobreescritura (redefinición) de método -- polimorfismo dinámico
     * La anotación @Override se utiliza para indicar que este método está redefiniendo un método de la clase padre.
     * Esto es parte del polimorfismo dinámico, que permite que el método modulo() de Punto3D sea llamado en lugar 
     * del método modulo() de la clase padre cuando se trabaja con objetos de tipo Punto3D.
     */
    @Override
    public double modulo(){
        return Math.sqrt(this.getX()*this.getX() + this.getY()*this.getY() + 
        this.z*this.z);
    }
}
