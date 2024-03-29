package Modelo.Mazos;
/**AUTOR ALEXANDRA**/
import Modelo.Cartas.CartasInvestigador.CartasInvestigador;
import java.util.ArrayList;

public interface IMazoInvestigador {

    void añadirCarta(CartasInvestigador carta);

    ArrayList<CartasInvestigador> getListaCartasMazo();

    String getNombre();

    void setListaMazo(ArrayList<CartasInvestigador> listaCartasInvestigador);

    void setNombre(String nombre);

    String toString();
    
}
