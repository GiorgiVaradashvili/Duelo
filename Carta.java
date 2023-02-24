/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duelo;

/**
 *
 * @author admin
 */
public class Carta {

    private Palo palo;
    private Valor valor;

    public enum Palo {

        Treboles,
        Picas,
        Corazones,
        Diamantes;

    }

    public enum Valor {

        As,
        Dos,
        Tres,
        Cuatro,
        Cinco,
        Seis,
        Siete,
        Ocho,
        Nueve,
        Diez,
        Jota,
        Reina,
        Rey

    }

    public Carta() {

    }

    public Carta(Palo palo, Valor valor) {

        this.palo = palo;
        this.valor = valor;

    }

    public int GetPuntos() {

        return 0;

    }

    @Override
    public String toString() {

        return null;

    }

}
