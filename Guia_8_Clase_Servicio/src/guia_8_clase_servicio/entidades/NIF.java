/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.entidades;

/**
 *
 * @author bruno
 */
public class NIF {
    private final long DNI;
    private final char letra;

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }
    
    
}
