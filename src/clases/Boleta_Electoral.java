/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Napo
 */
public class Boleta_Electoral {
    private int Id_Boleta;
    private int Id_Partido;
    private int Id_Junta;

    public Boleta_Electoral(int Id_Boleta, int Id_Partido, int Id_Junta) {
        this.Id_Boleta = Id_Boleta;
        this.Id_Partido = Id_Partido;
        this.Id_Junta = Id_Junta;
    }
    
    
    public Boleta_Electoral(){
    }

    public int getId_Boleta() {
        return Id_Boleta;
    }

    public void setId_Boleta(int Id_Boleta) {
        this.Id_Boleta = Id_Boleta;
    }

    public int getId_Partido() {
        return Id_Partido;
    }

    public void setId_Partido(int Id_Partido) {
        this.Id_Partido = Id_Partido;
    }

    public int getId_Junta() {
        return Id_Junta;
    }

    public void setId_Junta(int Id_Junta) {
        this.Id_Junta = Id_Junta;
    }
    
}
