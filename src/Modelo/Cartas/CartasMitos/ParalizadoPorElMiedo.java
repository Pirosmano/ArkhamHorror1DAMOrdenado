/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasMitos;
import Modelo.Fases.Fase;
import Modelo.Investigador;

/**
 *
 * @author pecorte
 */
public class ParalizadoPorElMiedo extends Traicion {
    boolean activo=false;

    public ParalizadoPorElMiedo(Fase fase) {
        super(fase,"Paralizado por el miedo", false, 0);
    }
    
    public void activarCarta(){
        this.activo=true;
    }
    
    public void usarCarta(){
        
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verCarta() {
        System.out.println("La primera vez que realices una de las siguientes acciones (moverte, combatir o evitar) cada ronda, te cuesta 1 acción adicional.\n" +
                    "\n" +
                    "Obligado - Al final de tu turno: Realiza una prueba de  (3). Si tienes éxito, descarta Paralizado por el miedo.");
    }
    
}
