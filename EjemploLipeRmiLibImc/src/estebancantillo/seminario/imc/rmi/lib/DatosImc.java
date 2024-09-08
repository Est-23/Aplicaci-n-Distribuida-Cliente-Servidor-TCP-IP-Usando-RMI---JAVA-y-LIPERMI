/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estebancantillo.seminario.imc.rmi.lib;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */

//Creamos la clase principal para capturar los datos necesarios para representar el cálculo de IMC.
public class DatosImc  implements Serializable{
    
    //Atributos
    private float peso;
    private float altura;
    private float resultado;
    private String interpretación;
    
    //Creamos los constructores
    public DatosImc(){
    }
    
    public DatosImc(float peso, float altura) { //Constructor que inicializa los atributos peso y altura con los valores que se proporcionan.
        this.peso = peso;
        this.altura = altura;
    }
    
    //Metodo set y get para obtener y establecer los valores de los atributos de la clase.
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getInterpretación() {
        return interpretación;
    }

    public void setInterpretación(String interpretación) {
        this.interpretación = interpretación;
    }
    
}

