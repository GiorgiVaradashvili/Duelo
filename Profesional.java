/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duelo;

/**
 *
 * @author admin
 */
public class Profesional extends Jugador implements IDatos {

    private static int apuestaMinima = 100;

    public Profesional() {

        super();

    }

    public Profesional(String nombre, String alias, Carta[] cartas,
            double saldo, double apuesta, boolean activo, int apuestaMinima) {

        super(nombre, alias, cartas, saldo, apuesta, activo);
        this.apuestaMinima = apuestaMinima;

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
