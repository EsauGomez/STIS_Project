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
public class Departamento {
    
    /* 
Id_Depto integer primary key,
Nombre_Depto varchar(50),
Zona_Dpto varchar(50)

    */

    private Integer id_depto;
    private String nombre_depto;
    private String zona;
    
    public Departamento(){
        
    }

    public Integer getId_depto() {
        return id_depto;
    }

    public void setId_depto(Integer id_depto) {
        this.id_depto = id_depto;
    }

    public String getNombre_depto() {
        return nombre_depto;
    }

    public void setNombre_depto(String nombre_depto) {
        this.nombre_depto = nombre_depto;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    
    
}
