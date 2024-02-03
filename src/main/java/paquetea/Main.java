/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import javax.swing.JOptionPane;

/**
 *
 * @author danielnavasborjas
 */
public class Main {
    public static void main(String[] args) {
        //Comprobaremos todo lo creado en el traductor
        Traductor traductor = new Traductor();   
    
        JOptionPane.showMessageDialog(null, "Método para guardar traducciones");
        //Método para guardar traduccione
        traductor.guardarTraducciones(palabraEspañola(), palabraExtranjera());
        traductor.guardarTraducciones(palabraEspañola(), palabraExtranjera());
        traductor.guardarTraducciones(palabraEspañola(), palabraExtranjera());
        traductor.guardarTraducciones(palabraEspañola(), palabraExtranjera());
        traductor.guardarTraducciones(palabraEspañola(), palabraExtranjera());
        
        traductor.getTraductor().forEach((key, values) -> System.out.println("Español " + key + " Inglés " + values));
        
        JOptionPane.showMessageDialog(null, "Método para borrar una entrada");
        //Método para borrar entrada
        traductor.borrarEntrada(palabraEspañola());
        
        JOptionPane.showMessageDialog(null, "Método para traducir una palabra");
        //Método para traducir dada una palabra
        traductor.traduccionDadaUnaPalabra(palabraEspañola());
        
        JOptionPane.showMessageDialog(null, "Método para modificar entradas ya creadas");
        //Método para modificar entradas ya creadas
        traductor.modificarEntrada(palabraEspañola(), palabraExtranjera());
        
        traductor.getTraductor().forEach((key, value) -> System.out.println("Español " + key + " Inglés " + value));
    }
    
    //Método para pedir al usuario que ponga una palabra extranjera
    public static String palabraExtranjera() {
        return JOptionPane.showInputDialog(
                "Introduce la palabra extranjera");
    }
    //Método para pedir al usuario que ponga una palabra en español
    public static String palabraEspañola() {
        return JOptionPane.showInputDialog(
                "Introduce la palabra en Español");
    }
}
