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
public class Municipio {
    private int Id_mun;
    private String Nom_Mun;
    private int Id_Depto;

    public Municipio(int Id_mun, String Nom_Mun, int Id_Depto) {
        this.Id_mun = Id_mun;
        this.Nom_Mun = Nom_Mun;
        this.Id_Depto = Id_Depto;
    }
     
    public Municipio(){
    }

    public int getId_mun() {
        return Id_mun;
    }

    public void setId_mun(int Id_mun) {
        this.Id_mun = Id_mun;
    }

    public String getNom_Mun() {
        return Nom_Mun;
    }

    public void setNom_Mun(String Nom_Mun) {
        this.Nom_Mun = Nom_Mun;
    }

    public int getId_Depto() {
        return Id_Depto;
    }

    public void setId_Depto(int Id_Depto) {
        this.Id_Depto = Id_Depto;
    }
}
