package controller;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Rol;

public class ControllerRol {
    public List<Rol> listarRoles() {
        List<Rol> lista = new ArrayList<>();
        String sql = "SELECT idRol, nombre FROM rol"; 

        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Rol tp = new Rol();
                tp.setIdRol(rs.getInt("idRol"));         
                tp.setNombreRol(rs.getString("nombre"));  
                lista.add(tp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
