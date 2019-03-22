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
 * @author cristian
 */
public class CartaDrMilanChristopher extends Apoyo{
    
    Fase fase;
   
    
    public CartaDrMilanChristopher(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        super(fase, "Dr Milan Christopher",false,0, 0, 1, 0, 0, 0, 1, 2, 4, 0, false);
    }
      
    
    @Override
    public void verCarta() {
        System.out.println("Después de que investigues con éxito: Obtén 1 recurso.");
    }

    @Override
    public void Accion(Investigador inv) {
        System.out.println("Después de que investigues con éxito: Obtén 1 recurso.");
        //Hacer si investigar tiene éxito.
//        inv.setNumeroRecursos(inv.getNumeroRecursos()+1);    }
    
    } 
    
}
