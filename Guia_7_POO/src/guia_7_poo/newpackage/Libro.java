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
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;
    
    /*
    public Libro(){}
    */
    
    public Libro(int _ISBN, String _titulo, String _autor, int _paginas){
        this.ISBN = _ISBN;
        this.titulo = _titulo;
        this.autor = _autor;
        this.paginas = _paginas;
    }
    
}
