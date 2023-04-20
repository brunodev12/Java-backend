/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class AhorcadoService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Ahorcado crearJuego() {
        System.out.print("Ingrese la palabra: ");
        String palabra = leer.next();
        int cantidadJugadas;

        do {
            System.out.print("Ingrese la cantidad máxima de jugadas: ");
            cantidadJugadas = leer.nextInt();

            if (cantidadJugadas < 1) {
                System.out.println("La cantidad máxima de jugadas debe ser mayor o igual a 1");
            }
        } while (cantidadJugadas < 1);

        return new Ahorcado(palabra, cantidadJugadas);
    }

    private void longitud(Ahorcado _ahorcado) {
        System.out.println("La longitud de la palabra es: " + _ahorcado.getPalabra().length);
    }

    private void buscar(String[] _palabra, String letra) {
        int cont = 0;
        for (String elemento : _palabra) {
            if (elemento.equalsIgnoreCase(letra)) {
                cont++;
                break;
            }
        }
        if (cont > 0) {
            System.out.println("La letra " + letra + " está en la palabra");
        } else {
            System.out.println("La letra " + letra + " no está en la palabra");
        }
    }

    private boolean encontradas(Ahorcado _ahorcado, String letra) {
        String[] palabra = _ahorcado.getPalabra();
        int longitudLetra = palabra.length;
        this.buscar(palabra, letra);
        int cont = 0;

        for (int i = 0; i < longitudLetra; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                _ahorcado.setNuevaLetra(letra, i);
                cont++;
            }
        }

        if (cont > 0) {
            int cantidadLetras = _ahorcado.getCantidadLetrasEncontradas();
            int nuevaCantidadLetras = cont + cantidadLetras;
            _ahorcado.setCantidadLetrasEncontradas(nuevaCantidadLetras);
            System.out.println("Se han encontrado: " + nuevaCantidadLetras + " letras, faltan " + (longitudLetra - nuevaCantidadLetras) + " letras");
            return true;
        } else {
            int cantidadLetras = _ahorcado.getCantidadLetrasEncontradas();
            System.out.println("Se han encontrado: " + cantidadLetras + " letras, faltan " + (_ahorcado.getPalabra().length - cantidadLetras));
            return false;
        }
    }

    private void intentos(Ahorcado _ahorcado, int _jugadasRealizadas) {
        System.out.println("La cantidad restante de intentos es: " + (_ahorcado.getCantidadJugadas() - _jugadasRealizadas));
    }

    private String checkLetraRepetida(String _palabrasIngresadas) {
        boolean check = false;
        int longitudLetra = _palabrasIngresadas.length();
        String letra;
        
        do {
            System.out.println("Ingrese una letra: ");
            letra = leer.next().substring(0, 1);
            for (int i = 0; i < longitudLetra; i++) {
                if (letra.equalsIgnoreCase(_palabrasIngresadas.substring(i, i+1))) {
                    System.out.println("Ya se ha ingresado esa letra");
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            
        } while (check==true);
        
        return letra;
    }

    public boolean juego() {
        Ahorcado ahorcado = this.crearJuego();
        int jugadasRealizadas = 0;
        int intentosMaximos = ahorcado.getCantidadJugadas();
        int longitudLetra = ahorcado.getPalabra().length;
        String palabrasIngresadas = "";

        do {
            String letra = checkLetraRepetida(palabrasIngresadas);
            palabrasIngresadas = palabrasIngresadas.concat(letra);
            longitud(ahorcado);
            if (encontradas(ahorcado, letra) == false) {
                jugadasRealizadas++;
            }
            intentos(ahorcado, jugadasRealizadas);
            ahorcado.mostrarNuevaPalabra();
        } while (jugadasRealizadas < intentosMaximos && ahorcado.getCantidadLetrasEncontradas() < longitudLetra);

        return ahorcado.getCantidadLetrasEncontradas() == longitudLetra;
    }
}
