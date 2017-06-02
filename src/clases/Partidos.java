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
public class Partidos {
    private int Id_Partido;
    private String Nom_Partido;
    private int Cant_Votos;
 
    public Partidos(int Id_Partido, String Nom_Partido, int Cant_Votos) {
        this.Id_Partido = Id_Partido;
        this.Nom_Partido = Nom_Partido;
        this.Cant_Votos = Cant_Votos;
    }
    
    public Partidos(){
    }

    public int getId_Partido() {
        return Id_Partido;
    }

    public void setId_Partido(int Id_Partido) {
        this.Id_Partido = Id_Partido;
    }

    public String getNom_Partido() {
        return Nom_Partido;
    }

    public void setNom_Partido(String Nom_Partido) {
        this.Nom_Partido = Nom_Partido;
    }

    public int getCant_Votos() {
        return Cant_Votos;
    }

    public void setCant_Votos(int Cant_Votos) {
        this.Cant_Votos = Cant_Votos;
    }
    
}
