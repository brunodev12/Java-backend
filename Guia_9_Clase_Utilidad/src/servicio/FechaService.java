/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class FechaService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();

        return new Date(anio-1900, mes-1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public Date diferencia(Date _fechaNacimiento, Date _fechaActual) {
        int añoActual = _fechaActual.getYear();
        int mesActual = _fechaActual.getMonth();
        int diaActual = _fechaActual.getDay();
        int añoNacimiento = _fechaNacimiento.getYear();
        int mesNacimiento = _fechaNacimiento.getMonth();
        int diaNacimiento = _fechaNacimiento.getDay();
        return new Date(añoActual - añoNacimiento, mesActual - mesNacimiento, diaActual - diaNacimiento);
    }
}
