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
public class Profesor extends Persona{
    private double salario;
    private String escuela; 
    
    public Profesor(){
        super();
        this.salario = 0;
        this.escuela = "";
    }
    
    public Profesor(double s, String e, String n, String c){
        super(n,c);
        this.salario = s;
        this.escuela = e;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "salario= " + salario + ", escuela= " + escuela + ", nombre= " + nombre + ", cedula= " + cedula;
    }
    
    
}
