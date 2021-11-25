/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Equipo;
import java.util.List;

/**
 *
 * @author duvan
 */
public interface CRUD {
    
    public List listar();
    public Equipo list(int id);
  
 
    public boolean add(Equipo equ);
    public boolean edit(Equipo equ);
    public boolean eliminar(int id);
        
}
