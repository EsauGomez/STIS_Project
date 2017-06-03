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
public class Juntareceptora {
    /*
    Id_Junta integer primary key,
    Id_Candidato integer,
    Ape_in_junta varchar(50),
    Ape_fin_junta varchar(50),
    Id_Centro integer,

    */
    //id candidato no se agrego porque no deberia estar en la tabla
    
    private Integer id_junta;
    private Integer id_centro;

    public Integer getId_junta() {
        return id_junta;
    }

    public void setId_junta(Integer id_junta) {
        this.id_junta = id_junta;
    }

    public Integer getId_centro() {
        return id_centro;
    }

    public void setId_centro(Integer id_centro) {
        this.id_centro = id_centro;
    }
    
    
    
}
