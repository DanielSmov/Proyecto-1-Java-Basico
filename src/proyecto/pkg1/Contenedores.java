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
public class Contenedores {

    private Estudiante listaEstudiante[];
    private Profesor listaProfesores[];
    private Libro listaLibros[];
    private ReservaProfesores listaReservacionProf[];
    private ReservacionEstudiantes listaReservacionEst[];
    private int cantidadEstudiantes;
    private int cantidadProfesores;
    private int cantidadResProf;
    private int cantidadResEst;
    private int cantidadLibros;

    public Contenedores() {
        this.listaEstudiante = new Estudiante[5];
        this.listaProfesores = new Profesor[5];
        this.listaLibros = new Libro[10];
        this.listaReservacionProf = new ReservaProfesores[10];
        this.listaReservacionEst = new ReservacionEstudiantes[10];
        this.cantidadEstudiantes = 0;
        this.cantidadProfesores = 0;
        this.cantidadResEst = 0;
        this.cantidadResProf = 0;
        this.cantidadLibros = 0;
    }

    double sumaPreciosLibros(){
        double suma = 0;
        double suma1 = 0;
        
        for(int i = 0 ; i< cantidadResEst; i++){
            suma = listaReservacionEst[i].getLibro().getPrecio() + suma;
        }
        
        for(int i = 0; i< cantidadResProf; i++){
            suma1 = listaReservacionProf[i].getLibro().getPrecio() + suma1;
        }
        
        return suma + suma1; 
    }
    
    Libro obtieneLibrosReservadosEst(String ced){
        for(int i = 0 ; i < this.cantidadResEst; i++){
            if(listaReservacionEst[i].getEst().getCedula().equals(ced)){
                return listaReservacionEst[i].getLibro();
            }
        }
        return null;
    }
    
    boolean buscaEstudiante(String ced) {
        for (int i = 0; i < this.cantidadEstudiantes; i++) {
            if (listaEstudiante[i].getCedula().equals(ced)) {
                return true;
            }
        }
        return false;
    }

    Estudiante obtieneEstudiante(String ced) {
        for (int i = 0; i < this.cantidadEstudiantes; i++) {
            if (listaEstudiante[i].getCedula().equals(ced)) {
                return listaEstudiante[i];
            }
        }
        return null;
    }

    boolean buscaProfesor(String ced) {
        for (int i = 0; i < this.cantidadProfesores; i++) {
            if (listaProfesores[i].getCedula().equals(ced)) {
                return true;
            }
        }
        return false;
    }

    Profesor obtieneProfesor(String ced) {
        for (int i = 0; i < this.cantidadProfesores; i++) {
            if (listaProfesores[i].getCedula().equals(ced)) {
                return listaProfesores[i];
            }
        }
        return null;
    }

    boolean buscaLibro(String codigo) {
        for (int i = 0; i < this.cantidadLibros; i++) {
            if (listaLibros[i].getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    Libro obtieneLibro(String codigo) {
        for (int i = 0; i < this.cantidadLibros; i++) {
            if (listaLibros[i].getCodigo().equals(codigo)) {
                return listaLibros[i];
            }
        }
        return null;
    }

    void anadirEstudiante(Estudiante est) {
        if (cantidadEstudiantes < 5) {
            listaEstudiante[cantidadEstudiantes++] = est;
        }
    }

    void anadirProfesor(Profesor prof) {
        if (cantidadProfesores < 5) {
            listaProfesores[cantidadProfesores++] = prof;
        }
    }

    void anadirLibro(Libro lib) {
        if (this.cantidadLibros < 10) {
            listaLibros[cantidadLibros++] = lib;
        }
    }

    void anadirReservacionProf(ReservaProfesores resProf) {
        if (cantidadResProf < 10) {
            listaReservacionProf[cantidadResProf++] = resProf;
        }
    }

    void anadirReservacionEst(ReservacionEstudiantes resEst) {
        if (this.cantidadResEst < 10) {
            listaReservacionEst[cantidadResEst++] = resEst;
        }
    }

    String imprimeListaEstudiantes() {
        String datos = " ";
        for (int i = 0; i < this.cantidadEstudiantes; i++) {
            datos = this.listaEstudiante[i].toString() + "\n" + datos;
        }
        return datos;
    }

    String imprimeListaProfesores() {
        String datos = " ";
        for (int i = 0; i < this.cantidadProfesores; i++) {
            datos = this.listaProfesores[i].toString() + "\n" + datos;
        }
        return datos;
    }

    String imprimeListaLibros() {
        String datos = " ";
        for (int i = 0; i < this.cantidadLibros; i++) {
            datos = this.listaLibros[i].toString() + "\n" + datos;
        }
        return datos;
    }

    String imprimeListaReservacionesProf() {
        String datos = " ";
        for (int i = 0; i < this.cantidadResProf; i++) {
            datos = this.listaReservacionProf[i].toString() + "\n" + datos;
        }
        return datos;
    }

    String imprimeListaReservacionesEst() {
        String datos = " ";
        for (int i = 0; i < this.cantidadResEst; i++) {
            datos = this.listaReservacionEst[i].toString() + "\n" + datos;
        }
        return datos;
    }
}
