/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import java.util.Date;

/**
 *
 * @author ESCINF
 */
public class ReservaProfesores extends Reserva{

    private Profesor prof;

    public ReservaProfesores() {
         super();
         this.prof = new Profesor();
    }

    public ReservaProfesores(Profesor p ,int diasPrestamo, Date fechaReservacion, Libro libro) {
        super(diasPrestamo, fechaReservacion, libro);
        this.prof = p;
    }

    public Profesor getProf() {
        return prof;
    }

    public void setProf(Profesor prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return prof + " " + super.toString();
    }
    
    
  
}
