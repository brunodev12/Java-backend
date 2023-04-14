/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cadena;

/**
 *
 * @author bruno
 */
public class CadenaServicio {

    public void mostrarVocales(Cadena _frase) {
        String frase = _frase.getFrase();
        int longitud = _frase.getLongitud();
        int cont = 0;

        for (int i = 0; i < longitud; i++) {
            String letra = frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales");
    }

    public void invertirFrase(Cadena _frase) {
        String frase = _frase.getFrase();
        int longitud = _frase.getLongitud();
        String nuevaFrase = "";

        for (int i = longitud; i > 0; i--) {
            String letra = frase.substring(i - 1, i);
            nuevaFrase = nuevaFrase.concat(letra);
        }
        System.out.println(nuevaFrase);
    }

    public void vecesRepetido(Cadena _frase, String _caracter) {
        String frase = _frase.getFrase();
        int longitud = _frase.getLongitud();
        String caracter = _caracter.substring(0, 1);
        int cont = 0;

        for (int i = 0; i < longitud; i++) {
            String letra = frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase(caracter)) {
                cont++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite " + cont + " veces");
    }

    public boolean compararLongitud(Cadena _frase, String _nuevaFrase) {
        Integer longitudFrase = _frase.getLongitud();
        Integer longitudNuevaFrase = _nuevaFrase.length();
        return longitudFrase.equals(longitudNuevaFrase);
    }

    public void unirFrases(Cadena _frase, String _nuevaFrase) {
        String frase = _frase.getFrase();
        frase = frase.concat(" ");
        frase = frase.concat(_nuevaFrase);
        System.out.println("La nueva frase es : " + frase);
    }

    public void reemplazar(Cadena _frase, String _caracter) {
        String frase = _frase.getFrase();
        int longitud = _frase.getLongitud();
        String caracter = _caracter.substring(0, 1);
        String nuevaFrase = "";

        for (int i = 0; i < longitud; i++) {
            String letra = frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a")) {
                nuevaFrase = nuevaFrase.concat(caracter);
            } else {
                nuevaFrase = nuevaFrase.concat(letra);
            }
        }
        System.out.println("La nueva frase es: " + nuevaFrase);
    }

    public boolean contiene(Cadena _frase, String _caracter) {
        String frase = _frase.getFrase();
        int longitud = _frase.getLongitud();
        String caracter = _caracter.substring(0, 1);

        for (int i = 0; i < longitud; i++) {
            String letra = frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase(caracter)) {
                return true;
            }
        }
        return false;
    }
}
