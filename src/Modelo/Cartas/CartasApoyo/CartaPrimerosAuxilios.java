package Modelo.Cartas.CartasApoyo;

import Modelo.RolandBanks;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import java.util.Scanner;

/**AUTOR ALEXANDRA**/
public class CartaPrimerosAuxilios extends Apoyo{
    //new Carta("Primeros auxilios.","Guardián",2,"Apoyo",0,1,0,0, false, "Talento. Ciencia");
    // Usos (3 suministros). Si los Primeros auxilios no tienen suministros, descártalos.
    // Gasta 1 suministro: Cura 1 punto de daño o de horror de un investigador que esté en tu Lugar
    private int suministros=3;
    RolandBanks roland;
    Scanner sc = new Scanner(System.in);
    
    public CartaPrimerosAuxilios(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada){
        super(fase,"Primeros Auxilios",false,0,1, 0, 0, 0, 0, 0, 0, 2, 3, false);
    }
    
    public void Accion(Investigador investigador){
        while(suministros>0){
            // Prueba de habilidad para voluntad

            investigador.setNumeroRecursos(investigador.getNumeroRecursos()-2);

            System.out.println("Escribe 1 para curarte un punto de daño o 2 para curarte un punto de horror.");
            int respuesta=sc.nextInt();
            switch(respuesta){
                case 1: 
                    investigador.setVida(vida+1);
                    suministros--;
                break;
                case 2:
                    investigador.setVida(vida-1);
                    suministros--;
                break;
                
                default:
                    System.out.println("No has escrito un número válido.");
                break;
            }
            
        }

    }

    @Override
    public void verCarta() {
        System.out.println("Usos (3 suministros). Si los Primeros auxilios no tienen suministros, descártalos.\n" +
        "\n" + " Gasta 1 suministro: Cura 1 punto de daño o de horror de un investigador que esté en tu Lugar.");
    }

}
