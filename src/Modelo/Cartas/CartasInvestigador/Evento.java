
package Modelo.Cartas.CartasInvestigador;

import Modelo.Fases.Fase;
import Modelo.Investigador;


public abstract class Evento extends CartasInvestigador{
    
    public Evento(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion,int voluntad, int intelecto, int habilidad, int combate, int comodin, int coste) {
        super( fase,nombreCarta,preparada,fichaPerdicion,voluntad, intelecto, habilidad, combate, comodin, coste);
    }
    
    @Override
    public abstract void verCarta() ;
    
    @Override
    public abstract void Accion(Investigador investigador);

    public int getVoluntad() {
        return voluntad;
    }

    public void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        this.combate = combate;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getComodin() {
        return comodin;
    }

    public void setComodin(int comodin) {
        this.comodin = comodin;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    
    
}
