/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasApoyo;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import Vista.Vista;
import Modelo.PruebasHabilidad.PruebaCombate;
/**
 *
 * @author miguel
 */
public class CartaTrentaYOchoEspecialRoland extends Apoyo{
        Exception exception;
        Vista mensaje=new Vista();
        PruebaCombate prueba=new PruebaCombate();
// public Apoyo(String nombreCarta,boolean preparada,
//      int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro,
//      boolean comprada

    public CartaTrentaYOchoEspecialRoland(Fase fase,boolean preparada, boolean comprada) {
        super(fase,".38 Especial De Roland", true, 0, 0, 0, 1, 1, 1, 0, 0, 3, 4, false);
        
    }
   
    
    @Override
    public void verCarta() {
        mensaje.muestraMensaje("Gasta 1 munición: "
                + "Combatir. Recibe +1  para este ataque, o bien recibe +3  "
                + "si hay 1 o más pistas en tu Lugar. Este ataque inflige +1 de daño.");
    }
    public void restablecerValoresRoland(Investigador investigador){
        investigador.setAgilidad(2);
        investigador.setCombate(4);
        investigador.setIntelecto(3);
        System.out.println("Valores restablecidos.");
    }  

    @Override
    public void Accion(Investigador investigador) {
        
        if(investigador.getLugar().getPistas()>0&&this.getSuministro()>0){
            
            investigador.setCombate(investigador.getCombate()+3);
            investigador.setDaño(investigador.getDaño()+1);
            this.setSuministro(this.getSuministro()-1);
            
        }else if(investigador.getLugar().getPistas()<=0&&this.getSuministro()>0){
            
            investigador.setCombate(investigador.getCombate()+1);
            investigador.setDaño(investigador.getDaño()+1);
            this.setSuministro(this.getSuministro()-1);
            
        }else{
            mensaje.muestraMensaje("No te quedan municiones");
        }
        
        
        
    }
    
    
}

