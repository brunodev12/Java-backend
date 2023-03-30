/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo.newpackage;

/**
 *
 * @author bruno
 */
public class Cuenta {

    private final String titular;
    private int saldo;

    public Cuenta(String _titular, int _saldo) {
        this.titular = _titular;
        this.saldo = _saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void ingresarDinero(int _dinero) {
        if (_dinero > 0) {
            this.saldo += _dinero;
            System.out.println("Depósito realizado");
            System.out.println("Su nuevo saldo es: $ " + this.getSaldo());
        }
    }

    public void retirarDinero(int _dinero) {
        if (saldo >= _dinero) {
            saldo -= _dinero;
            System.out.println("Se ha retirado con éxito: $ " + _dinero);
            System.out.println("Su nuevo saldo es: $ " + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
