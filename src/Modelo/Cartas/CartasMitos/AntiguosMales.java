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
public class AntiguosMales extends Traicion {
    public AntiguosMales(Fase fase) {
        super(fase, "Antiguos Males", false, 1);
    }

    @Override
    public void Accion(Investigador inv) {
        //No esta Soportado Todabia
    }
    @Override
    public void verCarta() {
        System.out.println("Coloca 1 ficha de Perdición sobre el plan en curso. Este efecto puede hacer que el plan en curso avance.");
    }
    
}
