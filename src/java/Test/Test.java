/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.Conexion;
import Modelo.Equipo;
import Modelo.EquipoDAO;

/**
 *
 * @author duvan
 */
public class Test {
    public static void main(String[] args) {
         Conexion cn = new Conexion();
         
         Equipo equipo = new Equipo("nombre", "tecnico");
         EquipoDAO e= new EquipoDAO();
         e.add(equipo);
         
    }
    
}
