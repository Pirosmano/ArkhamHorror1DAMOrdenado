/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasApoyo;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import modelohabilidad_bloqueado.PruebaHabilidad;


/**
 *
 * @author Cristian
 */
public class CartaTextosMedicos extends Apoyo{
    
    PruebaHabilidad prueba;
    Fase fase;

    public CartaTextosMedicos(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada){
        super(fase,"Textos Medicos",false, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, false);
    }
    
    
    @Override
    public void Accion(Investigador inv){
        prueba.iniciarPrueba(2);
        if(prueba.isX() == true){
            inv.setDaño(inv.getDaño()+1);
        }else{
            inv.setDaño(inv.getDaño()-1);
        }
    }

    @Override
    public void verCarta() {
        System.out.println("Elige un investigador que esté en tu Lugar y realiza "
                + "una prueba de intelecto(2). Si tienes éxito, cúrale 1 punto de daño a "
                + "ese investigador. Si fracasas, inflígele 1 punto de daño a ese "
                + "investigador.");
    }
    
    //MÉTODO RESTABLECER
    public void restablecerValoresRoland(Investigador investigador){
        investigador.setAgilidad(2);
        investigador.setCombate(4);
        investigador.setIntelecto(3);
        System.out.println("Valores restablecidos.");
    }  


    
}
