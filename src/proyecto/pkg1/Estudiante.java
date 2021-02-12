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
public class Estudiante extends Persona {

    public String carrera;
    public String carnet;

    public Estudiante() {
        super();
        this.carnet = "";
        this.carrera = "";
    }

    public Estudiante(String carn, String carr, String n, String c) {
        super(n, c);
        this.carnet = carn;
        this.carrera = carr;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "carrera= " + carrera + ", carnet= " + carnet + ", nombre= " + nombre + ", cedula= " + cedula;
    }
    
}
