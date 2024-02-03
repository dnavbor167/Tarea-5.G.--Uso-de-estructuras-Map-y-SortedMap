/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetea;

import java.util.ArrayList;
import java.util.List;
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
    public void guardarTraducciones (String palabraEspañol, String palabraExtranjera) {
        this.traductor.put(palabraEspañol, palabraExtranjera);
    }
    
    //Método para borrar una entrada
    public void borrarEntrada(String palabraEspañola) {
        this.traductor.remove(palabraEspañola);
    }
    
    //Método para realizar la traducción de una palbra dada
    public void traduccionDadaUnaPalabra(String palabraEspañol) {
        String nuevaTraduccion = JOptionPane.showInputDialog(
                "Introduce la traducción en Inglés de " + palabraEspañol);
        this.traductor.put(palabraEspañol, nuevaTraduccion);
    }
    
    //Modificar entradas ya creadas
    public void modificarEntrada (String palabraEspañol, String nuevaTraduccion) {
        Set<String> conjuntoPalabrasEspañolas = traductor.keySet();
        if (conjuntoPalabrasEspañolas.contains(palabraEspañol)) {
            String nuevaPalabraEspañol = palabraEspañol;
            this.borrarEntrada(palabraEspañol);
            this.guardarTraducciones(nuevaPalabraEspañol, nuevaTraduccion);
        }
    }
    
    //Método para crear una lista con las palabras no españolas que hay en el
    //traductor
    public List<String> listaNoEspañolas() {
        return new ArrayList<String>(this.traductor.values());
    }
    
    //Método para crear una lista con las palabras españolas que hay en el
    //traductor
    public List<String> listaEspañolas() {
        return new ArrayList<String>(this.traductor.keySet());
    }
}
