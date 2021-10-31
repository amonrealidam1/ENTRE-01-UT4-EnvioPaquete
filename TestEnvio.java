
/**
 * Write a description of class TestEnvio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestEnvio
{
    public static void main(String[] args){
    
        Paquete paquete1;
        Paquete paquete2;
        Paquete paquete3;
        Paquete copia;
        Envio envio;
        Dimension dimension;
        
        paquete1 = new Paquete();
        paquete2 = new Paquete(40, 60, 40);
        envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        
        dimension = new Dimension(50, 50, 70);
        paquete3 = new Paquete(dimension, 13);
        envio.addPaquete(paquete3);
        envio.print();
        
        copia = paquete2.obtenerCopia(); 
        envio.addPaquete(copia);
        
        
    }
    
}
