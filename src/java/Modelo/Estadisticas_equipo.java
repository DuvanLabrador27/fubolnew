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
public class Estadisticas_equipo implements Serializable {
      private Equipo equipo;
    private int golesFavor;
    private int golesContra;
      private int diferenciaGoles;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int puntos;
    private double promedio;
  

    public Estadisticas_equipo() {
        
    }

    public Estadisticas_equipo(Equipo equipo, int golesFavor, int golesContra, int diferenciaGoles, int partidosJugados, int partidosGanados, int partidosPerdidos, int puntos, double promedio) {
        this.equipo = equipo;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGoles = diferenciaGoles;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.puntos = puntos;
        this.promedio = promedio;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.equipo);
        hash = 29 * hash + this.golesFavor;
        hash = 29 * hash + this.golesContra;
        hash = 29 * hash + this.diferenciaGoles;
        hash = 29 * hash + this.partidosJugados;
        hash = 29 * hash + this.partidosGanados;
        hash = 29 * hash + this.partidosPerdidos;
        hash = 29 * hash + this.puntos;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.promedio) ^ (Double.doubleToLongBits(this.promedio) >>> 32));
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
        final Estadisticas_equipo other = (Estadisticas_equipo) obj;
        if (this.golesFavor != other.golesFavor) {
            return false;
        }
        if (this.golesContra != other.golesContra) {
            return false;
        }
        if (this.diferenciaGoles != other.diferenciaGoles) {
            return false;
        }
        if (this.partidosJugados != other.partidosJugados) {
            return false;
        }
        if (this.partidosGanados != other.partidosGanados) {
            return false;
        }
        if (this.partidosPerdidos != other.partidosPerdidos) {
            return false;
        }
        if (this.puntos != other.puntos) {
            return false;
        }
        if (Double.doubleToLongBits(this.promedio) != Double.doubleToLongBits(other.promedio)) {
            return false;
        }
        if (!Objects.equals(this.equipo, other.equipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estadisticas_equipo{" + "equipo=" + equipo + ", golesFavor=" + golesFavor + ", golesContra=" + golesContra + ", diferenciaGoles=" + diferenciaGoles + ", partidosJugados=" + partidosJugados + ", partidosGanados=" + partidosGanados + ", partidosPerdidos=" + partidosPerdidos + ", puntos=" + puntos + ", promedio=" + promedio + '}';
    }

   

   
}
