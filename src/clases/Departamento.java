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
public class Departamento {
    
    private int Id_Depto;
    private String Nombre_Depto;
    private String Dpto;

    public Departamento(int Id_Depto, String Nombre_Depto, String Dpto) {
        this.Id_Depto = Id_Depto;
        this.Nombre_Depto = Nombre_Depto;
        this.Dpto = Dpto;
    }
    
    public Departamento(){
    }

    public int getId_Depto() {
        return Id_Depto;
    }

    public void setId_Depto(int Id_Depto) {
        this.Id_Depto = Id_Depto;
    }

    public String getNombre_Depto() {
        return Nombre_Depto;
    }

    public void setNombre_Depto(String Nombre_Depto) {
        this.Nombre_Depto = Nombre_Depto;
    }

    public String getDpto() {
        return Dpto;
    }

    public void setDpto(String Dpto) {
        this.Dpto = Dpto;
    }
}
