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
abstract public class Persona {

    protected String nombre;
    protected String cedula;

    public Persona() {
        nombre = " ";
        cedula = " ";
    }

    public Persona(String n, String c) {
        try {
            nombre = n;
            cedula = c;
        } catch (Exception e) {
            System.out.println("datos deben ser strings");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        try {
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Dato debe ser string");
        }
    }

    public void setCedula(String cedula) {
        try {
            this.cedula = cedula;
        } catch (Exception e) {
            System.out.println("Dato debe ser string");
        }
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", cedula: " + cedula + '\n';
    }

}
