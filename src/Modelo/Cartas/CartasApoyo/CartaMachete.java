package Modelo.Cartas.CartasApoyo;

import Modelo.RolandBanks;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Investigador;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class CartaMachete  extends Apoyo{
    Scanner sn=new Scanner(System.in);
    boolean descarte=false;
    RolandBanks roland;

    // He creado la carta Machete mediante una herencia de la clase apoyo
    // la carta machete es una carta de apoyo, que cuesta tres recursos
    // con la que Recibes +1  para este ataque. 
    // Si el Enemigo atacado es el único Enemigo enfrentado a ti, este ataque recibe +1 de daño.
    
    public CartaMachete() {
        super("Machete",false,0,0, 0, 1, 0, 0, 0, 0, 1, 0, false);
    }
     public void verCarta(){
         System.out.println("Objeto. Arma. Cuerpo a cuerpo.\n" +
          "\n" +
          "Coste: 3.\n" +
          ": Combatir. Recibes +1  para este ataque.\n" +
          "\n" +
          "Descarta el Cuchillo: Combatir. Recibes +2  para este ataque. Este ataque inflige +1 de daño.");
     }
    
    public void Accion(Investigador investigador){
        System.out.println("Arma cuerpo a cuerpo");
        System.out.println("Elige una opcion:");
        System.out.println("1-Combatir. Recibes +1 de combate para este ataque");
        System.out.println("2-Si el Enemigo atacado es el único Enemigo enfrentado a ti, este ataque recibe +2 de daño.");
       try{
           int opcion=sn.nextInt();
           switch (opcion){
               case 1:
                   if(descarte==false){
                        investigador.setCombate(investigador.getCombate()+1);
                        System.out.println("Combate actual: " +investigador.getCombate());
                    }
                   
                break;
               case 2: 
                    descarte=true;
                    investigador.setCombate(investigador.getCombate()+1);
                    System.out.println("Combate actual: " +investigador.getCombate());
                    investigador.setDaño(investigador.getDaño()+2);
                    System.out.println("Daño actual: " +investigador.getDaño());
                    break;
                       
           }
           
       }
        
        catch(Exception e){
            System.err.println("Se ha producido un error.Introduzca una opcion valida");
    }
    }
    
}