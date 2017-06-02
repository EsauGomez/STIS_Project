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
public class Candidatos {

    private int Id_Candidato;
    private String Nombre_Candidato;
    private String Apellido_Candidato;
    private int Edad;

    public Candidatos(int Id_Candidato, String Nombre_Candidato, String Apellido_Candidato, int Edad) {
        this.Id_Candidato = Id_Candidato;
        this.Nombre_Candidato = Nombre_Candidato;
        this.Apellido_Candidato = Apellido_Candidato;
        this.Edad = Edad;
    }
     
    
    public Candidatos(){
    }

    public int getId_Candidato() {
        return Id_Candidato;
    }

    public void setId_Candidato(int Id_Candidato) {
        this.Id_Candidato = Id_Candidato;
    }

    public String getNombre_Candidato() {
        return Nombre_Candidato;
    }

    public void setNombre_Candidato(String Nombre_Candidato) {
        this.Nombre_Candidato = Nombre_Candidato;
    }

    public String getApellido_Candidato() {
        return Apellido_Candidato;
    }

    public void setApellido_Candidato(String Apellido_Candidato) {
        this.Apellido_Candidato = Apellido_Candidato;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
}
