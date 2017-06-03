/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author EsauGomez
 */
public class Municipio {
    /*
        Id_mun integer primary key,
	Nom_Mun varchar(50),
	Id_Depto integer,
    */
    
    private Integer id_mun;
    private String nom_mun;
    private Integer id_depto;
    
    public Municipio(){
        
    }

    public Integer getId_mun() {
        return id_mun;
    }

    public void setId_mun(Integer id_mun) {
        this.id_mun = id_mun;
    }

    public String getNom_mun() {
        return nom_mun;
    }

    public void setNom_mun(String nom_mun) {
        this.nom_mun = nom_mun;
    }

    public Integer getId_depto() {
        return id_depto;
    }

    public void setId_depto(Integer id_depto) {
        this.id_depto = id_depto;
    }
    
    
}
