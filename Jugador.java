/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duelo;

/**
 *
 * @author admin
 */
abstract class Jugador {

    private String nombre, alias;
    private Carta[] cartas;
    private double saldo, apuesta;
    private boolean activo;

    public Jugador() {

    }

    public Jugador(String nombre, String alias, Carta[] cartas,
            double saldo, double apuesta, boolean activo) {

        this.nombre = nombre;
        this.alias = alias;
        this.cartas = cartas;
        this.saldo = saldo;
        this.apuesta = apuesta;
        this.activo = activo;

    }

    public int GetNumcartasMano() {

        return 0;

    }

    public int sumarCartas() {

        return 0;

    }

    public void mostrarCartas() {

    }

    public void plantarse() {

    }

    public abstract boolean tieneManoPerdedora();

    public abstract boolean tieneManoGanadora();

    public abstract boolean alcanzaMinimo();

    public abstract double resolverApuesta();

    public abstract void obtenerResultados();

}
