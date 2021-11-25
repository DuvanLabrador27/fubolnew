/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duvan
 */
public class EquipoDAO extends Conexion implements CRUD {

    @Override
    public List listar() {
        ArrayList<Equipo> equipos = new ArrayList<>();
        String sql = "SELECT U.codigo, U.nombre, U.tecnico FROM equipo U";
        Conexion cn = new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        

        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setCodigo(rs.getInt("codigo"));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setTecnico(rs.getString("tecnico"));
                equipos.add(equipo);

            }

        } catch (Exception e) {
            System.out.println("Listar // EquipoDAO: ERROR " + e.getMessage());
        }
        return equipos;
    }

    @Override
    public Equipo list(int id) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param equ
     * @return
     * @throws Exception
     */
    @Override
    public boolean add(Modelo.Equipo equ) {

        Conexion cn = new Conexion();
        Connection con;
        PreparedStatement ps;

        String sql = "insert into equipo(codigo,nombre,fecha,tecnico)values(NULL,?,NULL,?)";

        try {

            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, equ.getNombre());
            ps.setString(2, equ.getTecnico());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Listar // EmpleadoDAO: ERROR " + e.getMessage());
            return false;
        }

    }

    @Override
    public boolean edit(Equipo equ) {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
