/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mazos;


import Modelo.Cartas.Carta;
import Modelo.Cartas.CartasMitos.*;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jose
 */

public class MazoEncuentros {

  private LinkedList<Carta> Mazo;
 Investigador Roland;
  
  
    public MazoEncuentros(Investigador Roland, Fase fase){
    this.Mazo = new LinkedList();
    this.Roland=Roland;
    AntiguosMales AntiguosMales = new AntiguosMales(fase);
    ManosAferradoras  ManosAferradoras = new ManosAferradoras(fase, true, 0);
    ParalizadoPorElMiedo ParalizadoPorElMiedo = new ParalizadoPorElMiedo(fase);
    RestosEnDescomposicion RestosEnDescomposicion = new RestosEnDescomposicion("RestosEnDescomposicion", false, 0);
            
            
    getMazo().add(AntiguosMales);
    getMazo().add(ManosAferradoras);
    getMazo().add(ParalizadoPorElMiedo);
    getMazo().add(RestosEnDescomposicion);
    
    
    }
    
    

    
    
    public Carta cogerCarta(){
   
        
        System.out.println("cojo la primera carta");
  
  
        return getMazo().getFirst();
        
      
    }
 
    public Carta cogerNCartas(int x){
  
       
      
      
        try {
             if (x>3 || x <1){
    
     System.out.println("Numero inválido");
    
    }else for (int i=0; i<x; i++){
        System.out.println("cojo una carta");
        return getMazo().getFirst();
        
      }
      
        } catch (Exception e) {
            
            System.out.println("Introduce un número por favor");
           
            
        }
      return null;
      
      
   }
    
    public Carta buscaCarta(int x){
       
    
    
        for (int i = 0; i < getMazo().size(); i++) {
            getMazo().get(i).getNombreCarta();
          
        }
        Scanner sc=new Scanner(System.in);
          String nombre= sc.next();
          
            for (int i = 0; i < getMazo().size(); i++) {
            if (getMazo().get(i).getNombreCarta().equals(nombre)){
            return getMazo().get(i);
            }else System.out.println("Esa carta no existe");
         
        }
      return null;
          
          
    }
    
    public void introducirCartaAleatoria(Carta card){
  
    
        getMazo().addLast(card);
    Collections.shuffle(getMazo());
   System.out.println("he introducido una carta");
    
    }
    
  public void barajar(){

   Collections.shuffle(getMazo());
   System.out.println("barajo");
  
  }
    
    
    public boolean mazoVacio(){
       
    if (getMazo().isEmpty()){
        System.out.println("mazo vacio");
    return true;
    
    
    }
    System.out.println("mazo con cartas");
    return false;
    
    }
    
    
    /**
     * @return the Mazo
     */
    public LinkedList<Carta> getMazo() {
        return Mazo;
    }

    /**
     * @param Mazo the Mazo to set
     */
    public void setMazo(LinkedList<Carta> Mazo) {
        this.Mazo = Mazo;
    }
    
    
    
    
}


