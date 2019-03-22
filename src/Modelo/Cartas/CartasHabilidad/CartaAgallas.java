
package Modelo.Cartas.CartasHabilidad;
import Modelo.Acciones.uso_descarte_cartas;
import Modelo.Cartas.Carta;
import Modelo.Investigador;

public class CartaAgallas extends Carta{
    
    String nombre = "Agallas";
    String clase = "Neutral";
    String tipo = "Habilidad";
    String atributo = "Innato";
    int TestIcons = 2;
    String instruccionesA = "Máximo de 1 asignada por prueba de habilidad.";
    String instruccionesB = "Si esta prueba tiene éxito, roba 1 carta.";
    String descripción = "¡Atrás! Yo me ocupo de esto.";
    
    uso_descarte_cartas udc = new uso_descarte_cartas();
    
    public CartaAgallas(){
        super("Agallas", false,0);
    }
    
    public void instrucciones(){
        udc.robarCarta();
    }

    @Override
    public void Accion(Investigador investigador) {
    }
    
}
    