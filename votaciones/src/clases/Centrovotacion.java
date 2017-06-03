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
public class Centrovotacion {
    /*
    Id_centro integer primary key,
    Id_mun integer,
    Nombre_Cv varchar(50),
    */
    
    private Integer id_centro;
    private Integer id_mun;
    private String nombre_cv;
    
    
    public Centrovotacion(){
        
    }

    public Integer getId_centro() {
        return id_centro;
    }

    public void setId_centro(Integer id_centro) {
        this.id_centro = id_centro;
    }

    public Integer getId_mun() {
        return id_mun;
    }

    public void setId_mun(Integer id_mun) {
        this.id_mun = id_mun;
    }

    public String getNombre_cv() {
        return nombre_cv;
    }

    public void setNombre_cv(String nombre_cv) {
        this.nombre_cv = nombre_cv;
    }
    
    
    
    
    
}
