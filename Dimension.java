
/**
 *  Representa una dimensión
 *  
 *  @author - 
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        return new Dimension(alto, ancho, largo);
        

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
         String alt = String.format("%20s%10.2f%s", "Alto: ", alto, "(cm)\n");
         String anc = String.format("%20s%10.2f%s", "Ancho: ", ancho, "(cm)\n");
         String lar = String.format("%20s%10.2f%s", "Largo: ", largo, "(cm)\n");
         String all = alt + anc + lar;
         
         return all;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
