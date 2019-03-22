package Modelo.Cartas.CartasMitos;

import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.Cartas.CartasInvestigador.CartasInvestigador;
import Modelo.Cartas.CartasInvestigador.Evento;
import Modelo.Personaje;
import Modelo.Cartas.CartasMitos.Traicion;
import Modelo.Acciones.uso_descarte_cartas;
import Modelo.Investigador;
import java.util.LinkedList;

public class VocesDisonantes extends Traicion {

    LinkedList<CartasInvestigador> cartasmano;

    public VocesDisonantes() {
        super("Voces Disonantes", false, 0);
    }
    
    
    @Override
    public void verCarta() {
         System.out.println("Nombre: "+getNombreCarta()
                 + "Ficha de Perdicion: " +getFichaPerdicion()
                 +" Informacion de la carta: No puedes jugar Apoyos ni Eventos. Al final de la ronda: Descarta las Voces disonantes. ");
    }
    

    

    @Override
    public void Accion(Investigador investigador) {
      for (int i = 0; i < cartasmano.size(); i++) {
            if ((cartasmano.get(i) instanceof Apoyo) || (cartasmano.get(i) instanceof Evento)) {
                cartasmano.get(i).setPreparada(false);
            }
        }

    }//fin del accion

    
    
    public void restablecerCartas() {
        for (int i = 0; i < cartasmano.size(); i++) {
            if ((cartasmano.get(i) instanceof Apoyo) || (cartasmano.get(i) instanceof Evento)) {
                cartasmano.get(i).setPreparada(true);
            }

        }

    }

    
    
}
