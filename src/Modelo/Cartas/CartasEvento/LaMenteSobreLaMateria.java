package Modelo.Cartas.CartasEvento;

import Modelo.Cartas.CartasInvestigador.Evento;
import Modelo.Fases.Fase;
import Modelo.Investigador;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LaMenteSobreLaMateria extends Evento {

    Controlador.Control investigar;

    public LaMenteSobreLaMateria(Fase fase) {
        super(fase,"La Mente Sobre La Materia", false, 0, 0, 0, 1, 1, 0, 1);

    }

    @Override
    public void verCarta() {
        System.out.println("Nombre: " + getNombreCarta()
                + "Preparada: " + isPreparada()
                + "Ficha de Perdicion: " + getFichaPerdicion()
                + "Voluntad " + getVoluntad()
                + " Intelecto " + getIntelecto()
                + " Habilidad " + getHabilidad()
                + " Combate " + getCombate()
                + " Comodin " + getComodin()
                + " Coste " + getCoste()
                + " Informacion de la carta: Rápido. Juega esta carta sólo durante tu turno.\n Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad. ");
    }

    public void Accion(Investigador investigador) {
        Investigador inv = investigador;

        if (investigar.getInvestigacion() == true) {
            setPreparada(true);
            usarCarta(inv);
        } else {
            System.out.println("No es posible hacer nada. No estas en Fase de Investigacion");
        }

    }//fin del accion

    public void usarCarta(Investigador investigador) {

        if (isPreparada() == true) {
            Investigador inv = investigador;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Rápido. Juega esta carta sólo durante tu turno.");
                System.out.println("");
                System.out.println("Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad.");
                System.out.println("1.Cambiar combate a intelecto \n2.Cambiar habilidad a intelecto \n3.Valor por defecto");
                int respuesta = sc.nextInt();

                switch (respuesta) {
                    case 1:
                        inv.setIntelecto(inv.getCombate());
                        inv.setCombate(0);

                        break;

                    case 2:
                        inv.setIntelecto(inv.getAgilidad());
                        inv.setAgilidad(0);

                        break;

                    case 3:
                        System.out.println("Usar valores por defecto");

                        break;

                    default:
                        System.out.println("Por favor introduzca correctamente los datos");
                        Accion(inv);
                        break;

                }//fin switch
            } //fin try
            
            catch (InputMismatchException e) {
                System.out.println("No se puede usar un caracter, vuelve a introducirlo bien");
                System.out.println("");
                Accion(inv);
            }

        } //fin del if
        else {
            System.out.println("La carta no esta preparada para usarse");
        }

    } //fin metodo usarCarta

    public void restablecerValoresRoland(Investigador investigador) {
        investigador.setAgilidad(2);
        investigador.setCombate(4);
        investigador.setIntelecto(3);
        System.out.println("Intelecto " + investigador.getIntelecto() + " Combate" + investigador.getCombate() + " Agilidad " + investigador.getAgilidad());
    }

}
