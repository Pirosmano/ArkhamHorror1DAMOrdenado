/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArkhamHorror;

import Modelo.Cartas.CartasApoyo.CartaDrMilanChristopher;
import Modelo.BolsaDelCaos.BolsaDelCaos;
import Modelo.Personajes.RolandBanks;
import java.util.ArrayList;
import Modelo.Cartas.CartasInvestigador.Apoyo;
import Modelo.*;
import Modelo.Enemigos.Enemigo;
import java.util.LinkedList;
import modelohabilidad_bloqueado.PruebaAgilidad;
import modelohabilidad_bloqueado.PruebaHabilidad;
import modelohabilidad_bloqueado.PruebaIntelecto;
import modelohabilidad_bloqueado.PruebaVoluntad;

/**
 *
 * @author cristian
 */
public class HabilidadMainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PROBANDO PRUEBA DE HABILIDAD
        RolandBanks Roland = new RolandBanks();        
        
        ArrayList<Apoyo> apoyosprueba = new ArrayList();

        CartaDrMilanChristopher apoyo1 = new CartaDrMilanChristopher();
        apoyosprueba.add(apoyo1);
        
        BolsaDelCaos bolsa = new BolsaDelCaos();
        
        PruebaHabilidad agilidad = new PruebaAgilidad(Roland, apoyosprueba, bolsa);
        PruebaHabilidad voluntad = new PruebaVoluntad(Roland, apoyosprueba, bolsa);
        PruebaHabilidad intelecto = new PruebaIntelecto(Roland, apoyosprueba, bolsa);
        
//        Algo manda iniciar prueba de agilidad de dificultad 2
        voluntad.iniciarPrueba(2);
        
  
        
        
        
    }
    
}
