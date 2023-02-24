/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duelo;

/**
 *
 * @author admin
 */
public class Amateur extends Jugador implements IDatos {

    private static int ratioPago = 3;

    public Amateur() {

        super();

    }

    public Amateur(String nombre, String alias, Carta[] cartas,
            double saldo, double apuesta, boolean activo) {

        super(nombre, alias, cartas, saldo, apuesta, activo);
        this.ratioPago = ratioPago;

    }

    @Override
    public boolean tieneManoPerdedora() {

        return false;

    }

    @Override
    public boolean tieneManoGanadora() {

        return false;

    }

    @Override
    public boolean alcanzaMinimo() {

        return false;

    }

    @Override
    public double resolverApuesta() {

        return 0;

    }

    @Override
    public void obtenerResultados() {

    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public void mostrarEstatus() {

    }

}
