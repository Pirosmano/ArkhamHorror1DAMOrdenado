
import Modelo.Fases.Fase;
import Modelo.Lugares.Pasillo;
import Modelo.Cartas.CartasEvento.CartaExplosionDeDInamita;
import Modelo.Investigador;
import Modelo.Personajes.RolandBanks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class PruebasMiguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pasillo pasillo=new Pasillo();
        Investigador investigador=new RolandBanks();
        investigador.setLugar(pasillo);
        Fase fase=new Fase();
        CartaExplosionDeDInamita tnt=new CartaExplosionDeDInamita(fase, "Explosion de dinamita", true, 0, 0, 0, 0, 0, 0, 0);
        tnt.Accion(investigador);
    }
    
}
