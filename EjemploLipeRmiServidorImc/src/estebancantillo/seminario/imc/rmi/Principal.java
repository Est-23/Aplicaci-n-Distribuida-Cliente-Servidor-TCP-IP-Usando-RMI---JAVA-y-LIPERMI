package estebancantillo.seminario.imc.rmi;

import estebancantillo.seminario.imc.rmi.net.Servidor;

/**
 *
 * @author Usuario
 */

//Creamos la clase para el punto de entrada de la aplicación del servidor RMI para el cálculo del IMC.
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    //Punto de entrada de la aplicación.
    public static void main(String[] args) { 
        Servidor servicio = new Servidor(); //Creamos un nuevo nuevo objeto 
        
        //Con el try intentamos iniciar el servicio del servidor
        try {
            servicio.iniciar();
            
        //Con el catch si ocurre alguna excepción durante el inicio, se muestra un mensaje de error en la consola.
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
