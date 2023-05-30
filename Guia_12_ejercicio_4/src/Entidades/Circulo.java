package Entidades;

import Interface.calculosFormas;

/**
 *
 * @author bruno
 */
public class Circulo extends FormaGeometrica implements calculosFormas{
    
    private final double radio;
    private final double diametro;

    public Circulo(int radio) {
        this.radio = radio;
        this.diametro = radio * 2;
    }
    
    
    @Override
    public void calcularArea() {
        area = pi * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = pi * diametro;
    }
    
}
