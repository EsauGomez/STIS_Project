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
public class Database {
    private String driver;
    private String url;
    private String usuario;
    private String contraseña;
    
    public Database() {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/selectsalv";      
        this.usuario = "root";
        this.contraseña = "Itca+1234";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
}
