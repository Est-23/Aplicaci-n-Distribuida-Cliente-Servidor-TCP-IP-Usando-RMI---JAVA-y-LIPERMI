package estebancantillo.seminario.imc.rmi;

import estebancantillo.seminario.imc.rmi.vistas.VentanaPrincipal;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       VentanaPrincipal v = new VentanaPrincipal(); //Creacion del objeto de la clase VentanaPrincipal y lo almacena en la variable V.
       v.setLocationRelativeTo(null); //Centra la ventana en la pantalla.
       v.setVisible(true); //Hace que la ventana sea visible para el usuario.
    }
    
}
