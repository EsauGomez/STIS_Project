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
public class Padron_electoral {
    private int Id_votante;
    private String Nom_votante;
    private String Ape_In;
    private String Ape_Fi;
    private String Direccion;
    private int Id_centro;

    public Padron_electoral(int Id_votante, String Nom_votante, String Ape_In, String Ape_Fi, String Direccion, int Id_centro) {
        this.Id_votante = Id_votante;
        this.Nom_votante = Nom_votante;
        this.Ape_In = Ape_In;
        this.Ape_Fi = Ape_Fi;
        this.Direccion = Direccion;
        this.Id_centro = Id_centro;
    }
     
     
   public Padron_electoral(){
   }

    public int getId_votante() {
        return Id_votante;
    }

    public void setId_votante(int Id_votante) {
        this.Id_votante = Id_votante;
    }

    public String getNom_votante() {
        return Nom_votante;
    }

    public void setNom_votante(String Nom_votante) {
        this.Nom_votante = Nom_votante;
    }

    public String getApe_In() {
        return Ape_In;
    }

    public void setApe_In(String Ape_In) {
        this.Ape_In = Ape_In;
    }

    public String getApe_Fi() {
        return Ape_Fi;
    }

    public void setApe_Fi(String Ape_Fi) {
        this.Ape_Fi = Ape_Fi;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getId_centro() {
        return Id_centro;
    }

    public void setId_centro(int Id_centro) {
        this.Id_centro = Id_centro;
    }
   
}
