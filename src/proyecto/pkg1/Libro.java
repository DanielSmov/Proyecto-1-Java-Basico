/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * @author ESCINF
 */
public class Libro {
    private String codigo;
    private String nombre;
    private String autor;
    private int anno;
    private double precio; 
    
    
    public Libro() {
        this.codigo = "";
        this.nombre = "";
        this.autor = "";
        this.anno = 0;
        this.precio = 0.0;
    }

    public Libro(String codigo, String nombre, String autor, int anno, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.anno = anno;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre + ", autor=" + autor + ", anno=" + anno + ", precio=" + precio;
    }
    
    
    
}
