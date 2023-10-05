public class App {
    public static void main(String[] args) throws Exception {
        // Prueba para Punto
        Punto miObjeto = new Punto(2, 5);
        System.out.println(miObjeto.getX() + ", " + miObjeto.getY());

        miObjeto.setX(4);
        int x = miObjeto.getX();
        System.out.println(x);

        double d = miObjeto.modulo();
        System.out.println(d);

        miObjeto.setX(miObjeto.getX() + 1);
        int x1 = miObjeto.getX();
        System.out.println(x1);
        
        // Prueba para PuntoTiempo
        PuntoTiempo obPt = new PuntoTiempo();
        System.out.println(obPt.getX() + ", " + obPt.getY() + ", " + obPt.getT());
        System.out.println(obPt); //  referencia al objeto


        // Compatibilidad entre variables de clase
        Punto p = new PuntoTiempo(1,2,3);
        // p.setT(4); Error!
        // PuntoTiempo pt = new Punto(3,2); Error!
        ((PuntoTiempo)p).setT(4);
        System.out.println(((PuntoTiempo)p).getT());

        Punto p3d = new Punto3D(1, 2, 10, 0);
        System.out.println(p3d.modulo()); // se resuelve por sobreescritura de métodos

    }
}
