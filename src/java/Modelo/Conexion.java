/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author duvan
 */
public class Conexion {
    private final String baseDatos = "jspqcrcu1w5tx9c0";
    private final String servidor = "jdbc:mysql://yjo6uubt3u5c16az.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/" + baseDatos;
    private final String usuario = "bz8j87eygttna258";
    private final String clave = "fp1fzobkar7x2vpm";
    
    public Connection conectar(){
        Connection cn = null;
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(servidor, usuario, clave);
        }catch(Exception e){
            System.out.println("Error al conectar" + e.getMessage());
        }
        return cn;
    }
            
}
/**
 public class Conexion {

    private final String baseDatos = "futbol";
    private final String servidor = "jdbc:mysql://localhost:3306/" + baseDatos;
    private final String usuario = "root";
    private final String clave = "";

    public Connection conectar() {
        Connection cn = null;
        
        try{
    
        Class.forName("com.mysql.cj.jdbc.Driver");
       cn = (Connection) DriverManager.getConnection(servidor, usuario, clave);
        
    }catch(Exception e){
    
    System.out.println("Error al conectar" + e.getMessage());
    }
        return cn;
    }
}


**/