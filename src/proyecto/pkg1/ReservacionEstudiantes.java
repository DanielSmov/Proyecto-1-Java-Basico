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
public class ReservacionEstudiantes extends Reserva{
    private Estudiante est;
   
    public ReservacionEstudiantes() {
        super();
        est = new Estudiante();
    }

    public ReservacionEstudiantes(Estudiante e ,int diasPrestamo, Date fechaReservacion, Libro libro) {
        super(diasPrestamo, fechaReservacion, libro);
        this.est = e;
    }

    public Estudiante getEst() {
        return est;
    }

    public void setEst(Estudiante est) {
        this.est = est;
    }

    @Override
    public String toString() {
        return  est + " " + super.toString();
    }
    
    
    
  
   
   
}
