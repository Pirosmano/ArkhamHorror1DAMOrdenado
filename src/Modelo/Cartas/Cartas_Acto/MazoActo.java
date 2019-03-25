/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.Cartas_Acto;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import java.util.ArrayList;
/**
 *
 * @author pecorte
 */
public class MazoActo {
    ArrayList <Carta_Acto> mazo = new ArrayList();
    ArrayList <Carta_Acto> cartasused = new ArrayList();

    public MazoActo(Fase fase) {
        Carta_Acto c;
        mazo.add(c=new LaBarrera(fase));
        mazo.add(c=new Atrapados(fase));
        mazo.add(c=new QueHabeisHecho(fase));
    }
    
    public ArrayList <Carta_Acto> verCartas(){
        return mazo;
    }
    
    public ArrayList <Carta_Acto> verCartasUsadas(){
        return cartasused;
    }
    
    public void usarCarta(Carta_Acto c, Investigador inv){
        c.Accion(inv);
        int i=mazo.indexOf(c);
        cartasused.add(mazo.remove(i));
    }
    
    public Carta_Acto getCarta(int x){
        return mazo.get(x);
    }
}
