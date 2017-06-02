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
public class Centro_Votacion {
    private int Id_centro;
    private int Id_mun;
    private String Nombre_Cv;

    public Centro_Votacion(int Id_centro, int Id_mun, String Nombre_Cv) {
        this.Id_centro = Id_centro;
        this.Id_mun = Id_mun;
        this.Nombre_Cv = Nombre_Cv;
    }
    
    public Centro_Votacion(){
    }

    public int getId_centro() {
        return Id_centro;
    }

    public void setId_centro(int Id_centro) {
        this.Id_centro = Id_centro;
    }

    public int getId_mun() {
        return Id_mun;
    }

    public void setId_mun(int Id_mun) {
        this.Id_mun = Id_mun;
    }

    public String getNombre_Cv() {
        return Nombre_Cv;
    }

    public void setNombre_Cv(String Nombre_Cv) {
        this.Nombre_Cv = Nombre_Cv;
    }
    
}
