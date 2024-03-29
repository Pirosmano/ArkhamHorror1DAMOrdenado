package Vista;
/**AUTOR ALEXANDRA**/
import Controlador.Control;
import Controlador.ControlFaseInvestigacion;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Mazos.MazoInvestigador;

public class VistaFaseInvestigacion {
    Control control;
    Scanner sc=new Scanner(System.in);
    int numRonda=1;
    int decisionesRestantes=3;
    
    public VistaFaseInvestigacion(Control control){
        this.control=control;
    }
    
    public int MenuPrincipal(){

           System.out.println("RONDA "+numRonda);
           System.out.println(decisionesRestantes+" deciciones restantes. Elige una:");
           
           
           if(decisionesRestantes<=0){
               System.out.println("FASE DE INVESTIGACIÓN ACABADA");
           }
           else{
           System.out.println("1. Robar una carta.");
           System.out.println("2. Obtener un recurso.");
           System.out.println("3. Activar una capacidad de alguna carta.");
           System.out.println("4. Enfrentarse a un enemigo que esté en el lugar.");
           System.out.println("5. Investigar el lugar.");
           System.out.println("6. Moverse.");
           System.out.println("7. Jugar una carta de apoyo o evento (pagando su precio en recursos).");
           System.out.println("8. Evitar a un enemigo.");
           System.out.println("9. Combatir a un enemigo. Si un enemigo no toma la iniciativa contra el enemigo. Este le atacará en lo que se llama un ataque de oportunidad.");
           decisionesRestantes--;
           }
           int opcion=sc.nextInt();

          return opcion;
    }
    
    public void mostrarMazos(ArrayList<MazoInvestigador> mazo){
        for(MazoInvestigador m: mazo){
            System.out.println(m.getNombre());
        }
    }
}
