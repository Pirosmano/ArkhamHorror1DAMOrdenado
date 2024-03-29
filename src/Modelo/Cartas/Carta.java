
package Modelo.Cartas;

import Modelo.Fases.Fase;
import Modelo.Investigador;




public abstract  class Carta {
    
    
    private String nombreCarta;
    private boolean preparada;
    private int fichaPerdicion;
    private Fase fase;
    
    public Carta(Fase fase,String nombreCarta, boolean preparada,int fichaPerdicion){
        this.nombreCarta = nombreCarta;
        this.preparada = preparada;
        this.fichaPerdicion = fichaPerdicion;
        this.fase=fase;
    }

   
    public abstract void Accion(Investigador investigador);

    
    
    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public boolean isPreparada() {
        return preparada;
    }

    public void setPreparada(boolean preparada) {
        this.preparada = preparada;
    }

    public int getFichaPerdicion() {
        return fichaPerdicion;
    }

    public void setFichaPerdicion(int fichaPerdicion) {
        this.fichaPerdicion = fichaPerdicion;
    }
    
     public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }
    
    
    
    
}
