/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import modelohabilidad_bloqueado.PruebaHabilidad;
import java.util.Scanner;
import modelohabilidad_bloqueado.PruebaVoluntad;
/**
 *
 * @author cristian
 */
public class Vista_Habilidad {
        
    PruebaHabilidad habilidad;
    
    public Vista_Habilidad(PruebaHabilidad h){
       this.habilidad=h;
    }
    
    public void pruebaHabilidad(int n){        
        System.out.println("Se inicia la prueba de habilidad de dificultad "+n);
        habilidad.prueba(n);
    }

    public void resultadoPruebaExito() {        
        System.out.println("Prueba superada con éxito.");
    }
//
    public void resultadoPruebaFracaso() {
        System.out.println("No has superado la prueba.");
    }
    
  

    
    
   
}
