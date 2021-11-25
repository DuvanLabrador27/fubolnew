/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author duvan
 */
public class Equipo implements Serializable {
    private int codigo;
    private String nombre;
    private Date fecha;
    private String tecnico;

    public Equipo() {
        
    }
    
    public Equipo(String nombre,String tecnico) {
         this.nombre = nombre;
         this.tecnico = tecnico;
    }

    public Equipo(int codigo, String nombre, Date fecha, String tecnico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tecnico = tecnico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creacion() {
        return fecha;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha = fecha_creacion;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", tecnico=" + tecnico + '}';
    }
}
