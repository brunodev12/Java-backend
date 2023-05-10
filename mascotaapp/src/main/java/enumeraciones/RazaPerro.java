/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author bruno
 */
public enum RazaPerro {
    SALCHICHA(4362, "Salchicha"), DOBERMAN(45968, "Doberman"), PICHICHU(78942, "Pichichu"), POWPOW(2163, "Powpow");
    
    private Integer codigo;
    private String valor;
    
    private RazaPerro(Integer codigo, String valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
}
