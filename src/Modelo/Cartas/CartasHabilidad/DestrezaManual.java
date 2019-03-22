/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasHabilidad;
import Modelo.Cartas.CartasInvestigador.Habilidad;
import Modelo.Mazos.MazoEncuentros;
import modelohabilidad_bloqueado.PruebaHabilidad;
import Modelo.Fases.Fase;
/**
 *
 * @author imanol
 */
public abstract class DestrezaManual extends Habilidad {
    
    PruebaHabilidad ph;
    MazoEncuentros m;

    
    
    public DestrezaManual(Fase fase){
        super(fase,"Destreza Manual",false,0,0, 0, 2, 0, 0);
    }
    
    
    public void usarCarta(){
        ph.iniciarPrueba(voluntad);
        if(ph.isX()==true);
        m.cogerCarta();
    }
    
}
