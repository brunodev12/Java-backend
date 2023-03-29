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
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int _base, int _altura) {
        this.base = _base;
        this.altura = _altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int superficie() {
        int _superficie = this.base * this.altura;
        return _superficie;
    }

    public int perimetro() {
        int _perimetro = (this.base + this.altura) * 2;
        return _perimetro;
    }
    
    public void dibujar(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i==0 || i==this.altura-1 || j==0 || j==this.base-1) {
                    System.out.print(" * ");
                } else{ 
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
