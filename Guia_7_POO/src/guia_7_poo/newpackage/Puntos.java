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
public class Puntos {
    
    private double x1,x2,y1,y2;

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double distancia(){
     double _distancia=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
     return _distancia;
    }
    
    
}
