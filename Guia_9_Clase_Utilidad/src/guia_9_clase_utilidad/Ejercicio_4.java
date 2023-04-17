/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import java.util.Date;
import servicio.FechaService;

/**
 *
 * @author bruno
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FechaService fechaServicio = new FechaService();
        
        Date fecha = fechaServicio.fechaNacimiento();
        Date fechaActual = fechaServicio.fechaActual();
        System.out.println("=========FECHA NACIMIENTO================");
        System.out.println(fecha.getDate()+ "/" + (fecha.getMonth()+1) + "/" + (fecha.getYear()+1900) );
        System.out.println("==========FECHA ACTUAL ====================");
        System.out.println(fechaActual.getDate()+ "/" + (fechaActual.getMonth()+1) + "/" + (fechaActual.getYear()+1900) );
        System.out.println(fechaActual.getHours() + ":" + fechaActual.getMinutes());
        
        Date edad = fechaServicio.diferencia(fecha, fechaActual);
        System.out.println("=============== EDAD ==================");
        System.out.println((edad.getYear()));
        
    }
    
}
