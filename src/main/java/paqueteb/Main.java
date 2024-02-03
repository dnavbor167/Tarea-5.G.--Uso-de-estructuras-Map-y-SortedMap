/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

/**
 *
 * @author danielnavasborjas
 */
public class Main {
    public static void main(String[] args) {
        LoteriaNacional loteriaNacional = new LoteriaNacional();
        loteriaNacional.getLoteria().forEach((key, value) -> System.out.println("Número de lotería: " + key + " Premio: " + value));
        
        //Método para buscar si has sido premiado o no con tu boleto
        System.out.println(loteriaNacional.consultarNumDecimo());
    }
}
