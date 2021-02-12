/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import java.util.Date;

/**
 *
 * @author Danny
 */
public class Reserva {

    int diasPrestamo;
    Date fechaReservacion;
    Libro libro;

    public Reserva() {
        this.diasPrestamo = 0;
        this.fechaReservacion = new Date();
        this.libro = new Libro();
    }

    public Reserva(int diasPrestamo, Date fechaReservacion, Libro libro) {
        this.diasPrestamo = diasPrestamo;
        this.fechaReservacion = fechaReservacion;
        this.libro = libro;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return  "diasPrestamo=" + diasPrestamo + ", fechaReservacion=" + fechaReservacion + ", libro=" + libro.getNombre();
    }

   
    
}
