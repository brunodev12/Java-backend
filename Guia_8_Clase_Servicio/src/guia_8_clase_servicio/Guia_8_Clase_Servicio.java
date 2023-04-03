/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio;

import guia_8_clase_servicio.entidades.CuentaBancaria;
import guia_8_clase_servicio.servicio.CuentaBancariaServicio;

/**
 *
 * @author bruno
 */
public class Guia_8_Clase_Servicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = cbs.crearCuenta();
        
        System.out.println(cuenta1.toString());
        
        cbs.ingresar(cuenta1);
        
        System.out.println(cuenta1.toString());
        
        cbs.retirar(cuenta1);
        System.out.println(cuenta1.toString());
        cbs.extraccionRapida(cuenta1);
        cbs.consultarSaldo(cuenta1);
        cbs.consultarDatos(cuenta1);
    }
    
}
