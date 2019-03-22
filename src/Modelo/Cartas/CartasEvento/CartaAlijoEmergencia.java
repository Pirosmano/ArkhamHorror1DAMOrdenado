package Modelo.Cartas.CartasEvento;

import Modelo.Personajes.RolandBanks;
import Modelo.Cartas.CartasInvestigador.Evento;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import java.util.Scanner;

/**AUTOR ALEXANDRA**/
public class CartaAlijoEmergencia extends Evento{
    
    //listaCartas.add(new Carta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
    // Obtén 3 recursos.
    RolandBanks roland;
    int numVeces=2; //Ya que tiene 2 veces la carta en el mazo
    Scanner sc=new Scanner(System.in);

    public CartaAlijoEmergencia(Fase fase){
        super(fase,"Alijo de Emergencia",false,0,0,0,0,0,0,0);
    }

    
    
    public void Accion(Investigador investigador){ // Ya que la carta aparecía 2 veces en el drive de tareas, entendí que el jugador puede utlizar la carta 1, o 2 veces
        System.out.println("Escribe 1 para utilizar solo 1 carta o 2 para utilizar las 2 cartas de alijo de emergencia que tienes en tu mano.");
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1: 
                investigador.setNumeroRecursos(investigador.getNumeroRecursos()+3);
            break;
            
            case 2:
                investigador.setNumeroRecursos(investigador.getNumeroRecursos()+6);
            break;
                
            default:
                System.out.println("No has escrito un número válido.");
            break;
            }
    }

    @Override
    public void verCarta() {
        System.out.println("Uno nunca está demasiado preparado. Coste 0. Obtén 3 recursos. El investigador tiene 2 cartas de este tipo.");
    }
}
