/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasApoyo;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Fases.Fase;
import Modelo.Investigador;

/**
 *
 * @author pecorte
 */
public class CartaSiguiendoUnaCorazonda extends Apoyo {

    public CartaSiguiendoUnaCorazonda(Fase fase) {
        super(fase, "Siguiendo una Corazonada", false, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, false);
    }

    @Override
    public void verCarta() {
        System.out.println("Rápido. Juega esta carta sólo durante tu turno.\n" +
                            "\n" +
                            "Descubre 1 pista en tu Lugar.");
    }

    @Override
    public void Accion(Investigador inv) {
        inv.setNumeroPistas(inv.getNumeroPistas()+1);
    }
    
}
