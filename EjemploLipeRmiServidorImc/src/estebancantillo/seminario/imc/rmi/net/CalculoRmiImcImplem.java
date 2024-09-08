package estebancantillo.seminario.imc.rmi.net;

import estebancantillo.seminario.imc.rmi.lib.DatosImc;
import estebancantillo.seminario.imc.rmi.lib.IRemotaCalculoImc;

/**
 *
 * @author Usuario
 */
public class CalculoRmiImcImplem implements IRemotaCalculoImc {
    
    private DatosImc datos;
    
    //Creamos el constructor por defecto.
    public CalculoRmiImcImplem() {
    }
    
   @Override
   //Creamos el metodo que recibe un objeto DatosImc que contiene el peso y la altura de una persona y devuelve el mismo objeto DatosImc con el valor del IMC calculado.
   public DatosImc calcularImc(DatosImc datos) {
       
       float resultado = 0;
       if (datos.getPeso() <= 0 || datos.getAltura() <= 0) {
           datos.setInterpretación("ERROR: El peso y la altura deben ser mayor que 0");
           return datos;
       } else {
           resultado = datos.getPeso() / (datos.getAltura() * datos.getAltura());
           datos.setResultado(resultado);
           if (resultado < 18.5) {
               datos.setInterpretación("Debes consultar un Medico, tu peso es muy bajo");
           } else if (resultado >= 18.5 && resultado <= 24.9) {
               datos.setInterpretación("Estas bien de peso");
           } else if (resultado > 24.9 && resultado <= 29.9) {
               datos.setInterpretación("Debes bajar un poco de peso");
           } else {
               datos.setInterpretación("Debes consultar un Medico, tu peso es muy alto");
           }
           return datos;
       }
   }
}
