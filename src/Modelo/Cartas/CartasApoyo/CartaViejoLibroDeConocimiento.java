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
 * @author Cristian
 */
public class CartaViejoLibroDeConocimiento extends Apoyo{
    
    
    Fase fase;

    
    public CartaViejoLibroDeConocimiento(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada){
        super(fase, "Viejo Libro de Conocimiento",false, 0, 1, 0, 0, 0, 0, 0, 0, 3, 0, false);
    }
    
    @Override
    public void Accion(Investigador inv){
        System.out.println("Agota el Viejo libro de conocimiento: Elige un investigador "
                + "que esté en tu Lugar. Ese investigador busca 1 carta entre las 3 primeras "
                + "cartas de su mazo, la roba, devuelve las cartas restantes a su mazo y lo baraja.");
    }

    @Override
    public void verCarta() {
        System.out.println("Agota el Viejo libro de conocimiento: Elige un investigador "
                + "que esté en tu Lugar. Ese investigador busca 1 carta entre las 3 primeras "
                + "cartas de su mazo, la roba, devuelve las cartas restantes a su mazo y lo baraja.");
    }
    
    //MÉTODO RESTABLECER
    public void restablecerValoresRoland(Investigador investigador){
        investigador.setAgilidad(2);
        investigador.setCombate(4);
        investigador.setIntelecto(3);
        System.out.println("Valores restablecidos.");
    }  
}
