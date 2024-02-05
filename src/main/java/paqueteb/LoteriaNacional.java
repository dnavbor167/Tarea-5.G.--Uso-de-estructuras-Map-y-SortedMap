/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author danielnavasborjas
 */
public class LoteriaNacional {

    //añadimos el atributo encapsulado de tipo map
    private Map<String, Integer> loteria = new HashMap<>();

    //Insertamos el constructor de lotería
    public LoteriaNacional() {
        Random r = new Random();
        //Hacemos premios aleatorios
        ArrayList<Integer> premiosAleatorios = new ArrayList<>();
        premiosAleatorios.add(0);
        premiosAleatorios.add(100);
        premiosAleatorios.add(1000);
        premiosAleatorios.add(10000);
        premiosAleatorios.add(100000);
        premiosAleatorios.add(1000000);
        
        //Hacemos un while para que no pare hasta que sean 1000 registros
        while (this.loteria.size() < 1000) {
            //Creamos la variable para guardar aquí el número de lotería aleatorio
            int numDecimo = r.nextInt(0, 100000);
            //Dependiendo del número le añadirá tantos ceros a la izquierda para 
            //que haya 5 posiciones
            String resultadoDecimo = String.format("%05d", numDecimo);

            //hacemos que elija entre los premios anteriores de forma aleatoria
            Integer indice = premiosAleatorios.get(r.nextInt(premiosAleatorios.size()));

            this.loteria.put(resultadoDecimo, indice);
        }

    }

    //insertamos getter y setter
    public Map<String, Integer> getLoteria() {
        return loteria;
    }

    public void setLoteria(Map<String, Integer> loteria) {
        this.loteria = loteria;
    }

    //Insertamos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoteriaNacional{");
        sb.append("loteria=").append(loteria);
        sb.append('}');
        return sb.toString();
    }

    //Insertamos el equal y hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.loteria);
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
        final LoteriaNacional other = (LoteriaNacional) obj;
        return Objects.equals(this.loteria, other.loteria);
    }

    //Método para consultar por número de décimo el premio obtenido
    public Integer consultarNumDecimo() {
        String consultarDecimo = JOptionPane.showInputDialog(
                "Introduce el décimo a buscar");
        Set<String> conjuntoNumDecimo = loteria.keySet();
        if (conjuntoNumDecimo.contains(consultarDecimo)) {
            return this.loteria.get(consultarDecimo);

        } else {
            return null;
        }
    }
}
