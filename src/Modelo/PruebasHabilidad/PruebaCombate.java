/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.PruebasHabilidad;

import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Enemigos.Enemigo;
import Modelo.Investigador;
import Vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class PruebaCombate {
    Vista mensaje=new Vista();
    public PruebaCombate() {
    }
    
    //
    public boolean enfrenta(Enemigo enemigo ,Investigador investigador,ArrayList<Apoyo> apoyo,int fichaCaos){
        //Si gana el investigador el resultado es true y le resta la vida al enemigo, si es el enemigo el resultado es false y le resta vida al investigador
        boolean victoria=false;
        int puntosApoyo=0;
        for(Apoyo elem:apoyo){
            puntosApoyo=elem.getCombate();
        }
        
        if(investigador.getCombate()+puntosApoyo>enemigo.getCombate()+fichaCaos){
            victoria=true;
        }
        
        return victoria;
    }
    
    //devuelve el daño que el monstruo le hace al investigador
    public int calculaDañoInvestigador(Enemigo enemigo ){
      return enemigo.getDaño();
      
    }
    //devuelve el daño del investigador
    
   public int calculaDañoEnemigo(Investigador investigador){
        
      return investigador.getDaño();
    }
 
    
    
    
}