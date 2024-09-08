
package estebancantillo.seminario.imc.rmi.net;

import java.io.IOException;
import estebancantillo.seminario.imc.rmi.lib.IRemotaCalculoImc;
import net.sf.lipermi.exception.LipeRMIException;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Server;


/**
 *
 * @author Usuario
 */

//Creamos la calse representativa de un servidor RMI, esta se encarga del servicio remoto para calcular el IMC.
public class Servidor {
    
    //Atributos
    private int puerto = 9007; //Puerto del servidor.
    private CallHandler invocador; //Se encarga de manejar las llamadas remotas.
    private Server servidor; //Objeto que representa el servidor RMI.
    private CalculoRmiImcImplem calculoImc; //Implementación local del servicio de cálculo de IMC.
    private IRemotaCalculoImc calculoImcRemoto; //Referencia al objeto remoto que representa el servicio de cálculo de IMC.
    
    //Creamos el constructor que inicializa los objetos invocador, servidor y calculoImc.
    public Servidor() {
       invocador = new CallHandler();
       servidor = new Server();
       calculoImc = new CalculoRmiImcImplem();
    }
    
    //Creamos el método que inicia el servidor RMI.
    public void iniciar() throws Exception {
        try {
            invocador.registerGlobal(IRemotaCalculoImc.class, calculoImc);
            servidor.bind(puerto, invocador);
        } catch (LipeRMIException ex) {
            throw new Exception("Error: No es posible invocar metodos remotos");
        } catch (IOException ex) {
            throw new Exception("Error: I/O");
        }
    }
    
    //Creamos el método que detiene el servidor RMI.
    public void detener() {
        servidor.close();
    }
}
