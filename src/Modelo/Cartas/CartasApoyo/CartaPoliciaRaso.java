/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasApoyo;
import Modelo.Enemigos.Enemigo;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Investigador;
import Modelo.Fases.Fase;
/**
 *
 * @author Jacinto
 */
public class CartaPoliciaRaso extends Apoyo {
    Enemigo enemigo;
    Investigador investigador;
    

    public CartaPoliciaRaso(Fase fase, String nombreCarta, boolean preparada, int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        super(fase, "Policia Raso",false,0, 0, 1, 0, 0, 2, 2, 4, 0,0, false);
    }

    @Override
    public void Accion(Investigador investigador){
        int x ;
        x = investigador.getCombate() +1;
        investigador.setCombate(x);
        
    }
    
    public void Habilidad(){
        //Si hay un enemigo en el lugar, se le inflige un punto de daño y se descarta
        if (investigador.getLugar()== enemigo.getLugar()){
            enemigo.setVida(enemigo.getVida()- 1);
        }
    else{
    
        System.out.println(" No había ningún enemigo cerca...");
    
        
    }
}

    @Override
    public void verCarta() {
        System.out.println("Recibes +1 de combate. Descarta el Policía raso: Inflige 1 punto de daño a un Enemigo que esté en tu Lugar.");
    }
}

