/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.Cartas_Acto;
import Modelo.Cartas.Carta;
import Modelo.Fases.Fase;

/**
 *
 * @author pecorte
 */
public abstract class Carta_Acto extends Carta {
    int coste;
    boolean add;
    String pretexto;
    String accion;
    String objetivo;
    String texto;    

    public Carta_Acto(Fase fase, String nombreCarta, boolean preparada, int fichaPerdicion) {
        super(fase, nombreCarta, preparada, fichaPerdicion);
    }

    

    public String getPretexto() {
        return pretexto;
    }

    public String getAccion() {
        return accion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getTexto() {
        return texto;
    }
   
}
