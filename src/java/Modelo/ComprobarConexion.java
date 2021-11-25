/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ComprobarConexion {
     public static void main(String[] args) {
        Conexion c =new Conexion();
        
        if(c.conectar() !=null){
            System.out.println("La conexion es correcta");
        }else {
             System.out.println("La conexion es Incorrecta");
        }
    }
    
}
