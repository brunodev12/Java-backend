/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import java.io.Console;

/**
 *
 * @author bruno
 */
public class test {

    public void passwordExample() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }

        console.printf("Testing password%n");
        char[] passwordArray = console.readPassword("Enter your secret password: ");
        char[] secondPasswordArray = console.readPassword("Enter your secret password again: ");

        if ((new String(passwordArray)).equals(new String(secondPasswordArray))) {
            System.out.println("ingreso la contraseña de forma correcta");
        } else {
            System.err.println("error! debe coincidir las contraseñas");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new test().passwordExample();

    }

}
