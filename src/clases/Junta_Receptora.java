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
public class Junta_Receptora {
    private int Id_Junta;
    private int Id_Candidato;
    private String Ape_in_junta;
    private String Ape_fin_junta;
    private int Id_Centro;

    public Junta_Receptora(int Id_Junta, int Id_Candidato, String Ape_in_junta, String Ape_fin_junta, int Id_Centro) {
        this.Id_Junta = Id_Junta;
        this.Id_Candidato = Id_Candidato;
        this.Ape_in_junta = Ape_in_junta;
        this.Ape_fin_junta = Ape_fin_junta;
        this.Id_Centro = Id_Centro;
    }
    
     
    public Junta_Receptora(){
    }

    public int getId_Junta() {
        return Id_Junta;
    }

    public void setId_Junta(int Id_Junta) {
        this.Id_Junta = Id_Junta;
    }

    public int getId_Candidato() {
        return Id_Candidato;
    }

    public void setId_Candidato(int Id_Candidato) {
        this.Id_Candidato = Id_Candidato;
    }

    public String getApe_in_junta() {
        return Ape_in_junta;
    }

    public void setApe_in_junta(String Ape_in_junta) {
        this.Ape_in_junta = Ape_in_junta;
    }

    public String getApe_fin_junta() {
        return Ape_fin_junta;
    }

    public void setApe_fin_junta(String Ape_fin_junta) {
        this.Ape_fin_junta = Ape_fin_junta;
    }

    public int getId_Centro() {
        return Id_Centro;
    }

    public void setId_Centro(int Id_Centro) {
        this.Id_Centro = Id_Centro;
    }
}
