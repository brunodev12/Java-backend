/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.servicio;

import guia_8_clase_servicio.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class CuentaBancariaServicio {

    private final Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.print("Ingrese el numero de cuenta: ");
        int numCuenta = leer.nextInt();
        System.out.print("Ingrese el dni: ");
        int dni = leer.nextInt();
        System.out.print("Ingrese el saldo: ");
        int saldo = leer.nextInt();
        System.out.println("Cuenta creada correctamente");
        return new CuentaBancaria(numCuenta, dni, saldo);
    }

    public void ingresar(CuentaBancaria _cuenta) {
        System.out.print("Ingrese la cantidad a depositar: ");
        int monto = leer.nextInt();
        if (monto > 0) {
            _cuenta.setSaldoActual(_cuenta.getSaldoActual() + monto);
            System.out.println("Usted a ingresado correctamente: $" + monto);
        } else {
            System.out.println("El monto a ingresar debe ser mayor a 0");
        }

    }

    public void retirar(CuentaBancaria _cuenta) {
        System.out.println("Ingrese el monto a retirar: ");
        int monto = leer.nextInt();
        int saldoActual = _cuenta.getSaldoActual();
        if (monto <= saldoActual) {
            _cuenta.setSaldoActual(saldoActual - monto);
            System.out.println("Usted a extraido correctamente: $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void extraccionRapida(CuentaBancaria _cuenta) {
        int saldoActual = _cuenta.getSaldoActual();
        int monto = (int) (_cuenta.getSaldoActual() * 0.2);
        if (saldoActual > 0 && monto > 0) {
            _cuenta.setSaldoActual(saldoActual - monto);
            System.out.println("Usted a extraido correctamente: $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(CuentaBancaria _cuenta) {
        System.out.println("Su saldo es: $" + _cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria _cuenta) {
        System.out.println("DNI: " + _cuenta.getDniCliente());
        System.out.println("Número de cuenta: " + _cuenta.getNumeroCuenta());
    }
}
