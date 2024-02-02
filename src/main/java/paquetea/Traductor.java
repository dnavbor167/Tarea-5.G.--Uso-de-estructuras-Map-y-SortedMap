/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetea;

import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Traductor {

    private SortedMap<String, String> traductor;

    //insertamos constructor
    public Traductor() {
        this.traductor = new TreeMap<>();
    }
    
    //Insertamos getter y setter
    public SortedMap<String, String> getTraductor() {
        return traductor;
    }

    public void setTraductor(SortedMap<String, String> traductor) {
        this.traductor = traductor;
    }
    
    //insertamos toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("traductor=").append(traductor);
        sb.append('}');
        return sb.toString();
    }
    
    //Introducimos equal y hashcode porque para el uso del map son obligatorios
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.traductor, other.traductor);
    }
    
    
    //método para guardar traducciones
    public void guardarTraducciones (String palabraExtranjera, String palabraEspañol) {
        this.traductor.put(palabraEspañol, palabraExtranjera);
    }
    
    //Método para borrar una entrada
    public void borrarEntrada(String palabraEspañola) {
        this.traductor.remove(palabraEspañola);
    }
    
    //Método para realizar la traducción de una palbra dada
    public void traduccionUnaPalabra(String palabraEspañol) {
        String palabraNuevaEspañola = palabraEspañol;
        this.borrarEntrada(palabraEspañol);
        String nuevaTraduccion = JOptionPane.showInputDialog(
                "Introduce la traducción en Ingles de " + palabraNuevaEspañola);
        this.traductor.put(palabraNuevaEspañola, nuevaTraduccion);
    }
    
    //Modificar entradas ya creadas
    public void modificarEntrada (String palabraEspañol, String nuevaTraduccion) {
        Set<String> conjuntoPalabrasEspañolas = traductor.keySet();
        if (conjuntoPalabrasEspañolas.contains(palabraEspañol)) {
            String nuevaPalabraEspañol = palabraEspañol;
            this.borrarEntrada(palabraEspañol);
            this.guardarTraducciones(nuevaTraduccion, nuevaPalabraEspañol);
        }
    }
    
    //
}
