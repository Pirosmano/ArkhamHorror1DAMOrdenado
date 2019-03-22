package Modelo.Cartas.CartasMitos;

import Modelo.Cartas.Carta;
import Modelo.Fases.Fase;
import Modelo.Investigador;


public abstract class Traicion extends Carta {

    public Traicion(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion) {
        super( fase,nombreCarta,preparada, fichaPerdicion);

    }

    public abstract void Accion(Investigador investigador);
     public abstract void verCarta();
    

}
