/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author duvan
 */
public class Partido implements Serializable {

    private int numeroPartido;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String ciudad;
    private String estadio;
    private int golesLocal;
    private int golesVisitante;
    private String arbitro;

    public Partido() {

    }

    public Partido(int numeroPartido, Equipo equipoLocal, Equipo equipoVisitante, String ciudad, String estadio, int golesLocal, int golesVisitante, String arbitro) {
        this.numeroPartido = numeroPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.arbitro = arbitro;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numeroPartido;
        hash = 47 * hash + Objects.hashCode(this.equipoLocal);
        hash = 47 * hash + Objects.hashCode(this.equipoVisitante);
        hash = 47 * hash + Objects.hashCode(this.ciudad);
        hash = 47 * hash + Objects.hashCode(this.estadio);
        hash = 47 * hash + this.golesLocal;
        hash = 47 * hash + this.golesVisitante;
        hash = 47 * hash + Objects.hashCode(this.arbitro);
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
        final Partido other = (Partido) obj;
        if (this.numeroPartido != other.numeroPartido) {
            return false;
        }
        if (this.golesLocal != other.golesLocal) {
            return false;
        }
        if (this.golesVisitante != other.golesVisitante) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.estadio, other.estadio)) {
            return false;
        }
        if (!Objects.equals(this.arbitro, other.arbitro)) {
            return false;
        }
        if (!Objects.equals(this.equipoLocal, other.equipoLocal)) {
            return false;
        }
        if (!Objects.equals(this.equipoVisitante, other.equipoVisitante)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Partido{" + "numeroPartido=" + numeroPartido + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", ciudad=" + ciudad + ", estadio=" + estadio + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + ", arbitro=" + arbitro + '}';
    }

   

}
