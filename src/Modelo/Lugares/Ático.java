
package Modelo.Lugares;

import Modelo.Investigador;

public class Ático extends Lugar{
    
    public Ático(){
        super("Ático",false,0);
        super.descripcionNR = "Al acercaros a las escaleras del ático, un olor a carne podrida os asalta las fosas nasales.";
        super.descripcionR = "El ensangrentado cadáver de una bestia deforme cuelga de un gancho para carne encadenado al techo. Del cuerpo gotea lentamente la sangre, que cae en un pequeño barril.";
        super.velo = 1;
        super.pistas = 2;
        super.obligado = "**Después de que entres en el Ático: Recibe 1 punto de horror.**";
    }

    @Override
    public void Accion(Investigador investigador) {
    }

    
}
