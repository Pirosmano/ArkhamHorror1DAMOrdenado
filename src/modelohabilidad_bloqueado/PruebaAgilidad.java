/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad_bloqueado;

import Modelo.BolsaDelCaos.BolsaDelCaos;
import Modelo.Cartas.Carta;
import Modelo.Cartas.BDCarta;
import Modelo.RolandBanks;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author cristian
 */
public class PruebaAgilidad extends PruebaHabilidad{
    
    private boolean x;
    
    public PruebaAgilidad(RolandBanks inv, ArrayList<Modelo.Cartas.CartasInvestigador.Apoyo> apoyos, BolsaDelCaos bolsa) {
        super(inv, apoyos, bolsa);        
    }    

    public boolean prueba(int a) {
        x = false;
        System.out.println("Agilidad del investigador: "+this.inv.getAgilidad());
        int n = this.inv.getAgilidad() + seleccionaApoyo() + seleccionaCaos();
        if (n >= a){
            resultadoPruebaExito();
            return x;
        }
        else{
            resultadoPruebaFracaso();
            return x = true;
        }
    }
    
    public int seleccionaApoyo(){
        //Seleccionar apoyo de las cartas disponibles. Hay que implementarlo.
        //Tengo que mostrar las cartas de la mano y seleccionar las que quiero usar.
        //Luego tengo que descartarlas.
        //Finalmente sumamos el número de apoyos a la habilidad del investigador.
//        mostrarCartasMano();
        
        //Método para elegir cartas y obtener un array de cartas que luego es el que 
        //se pasa por parámetros en sumaApoyos.
        
        
        return sumaApoyosAgilidad(apoyos);
    }
    
    
}
