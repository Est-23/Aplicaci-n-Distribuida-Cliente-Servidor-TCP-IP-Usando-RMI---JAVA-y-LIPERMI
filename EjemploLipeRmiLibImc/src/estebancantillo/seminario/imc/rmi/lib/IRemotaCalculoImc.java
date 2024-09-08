/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estebancantillo.seminario.imc.rmi.lib;

/**
 *
 * @author Usuario
 */

//Definimos "IRemotaCalculoImc" como interfaz para el servicio remoto que se encarga de realizar cálculos de IMC.
public interface IRemotaCalculoImc {
    
    public DatosImc calcularImc(DatosImc datos);
}
