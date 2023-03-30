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
public class Juego {

    private final int num1;

    public Juego(int num1) {
        this.num1 = num1;
    }

    public boolean iniciar_juego(int _num2) {
        if (num1 == _num2) {
            return true;
        } else if (num1 < _num2) {
            System.out.println("Pista: el número es menor");
        } else {
            System.out.println("Pista: el número es mayor");
        }
        return false;
    }

}
