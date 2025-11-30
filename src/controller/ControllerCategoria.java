package controller;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;

public class ControllerCategoria{
    public List<Categoria> listarTipos() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT idCategoria, nombre FROM Categoria"; 

        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Categoria tp = new Categoria();
                tp.setIdCategoria(rs.getInt("idCategoria"));         
                tp.setNombre(rs.getString("nombre"));  
                lista.add(tp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
