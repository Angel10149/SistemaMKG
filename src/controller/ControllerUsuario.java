package controller;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Rol;
import model.Usuario;

public class ControllerUsuario {
    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT p.idPersona, p.nombre, p.apellidoPaterno, p.apellidoMaterno, p.dni, "
                   + "u.codigoUsuario, u.password, u.estado, "
                   + "r.idRol, r.nombre AS nombreRol, r.descripcion "
                   + "FROM Persona p "
                   + "INNER JOIN usuario u ON p.idPersona = u.idPersona "
                   + "INNER JOIN rol r ON u.idRol = r.idRol";

        try (Connection cn = ConexionBD.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdPersona(rs.getInt("idPersona"));
                u.setNombre(rs.getString("nombre"));
                u.setApellidoPaterno(rs.getString("apellidoPaterno"));
                u.setApellidoMaterno(rs.getString("apellidoMaterno"));
                u.setDni(rs.getString("dni"));
                u.setCodigoUsuario(rs.getString("codigoUsuario"));
                u.setPassword(rs.getString("password"));
                u.setEstado(rs.getString("estado"));
                Rol rol = new Rol();
                rol.setIdRol(rs.getInt("idRol"));
                rol.setNombreRol(rs.getString("nombreRol"));
                rol.setDescripcion(rs.getString("descripcion"));
                u.setRol(rol);
                lista.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    public boolean agregarUsuario(Usuario usuario) {
        String sqlPersona = "INSERT INTO Persona (nombre, apellidoPaterno, apellidoMaterno, dni) VALUES (?, ?, ?, ?)";
        String sqlUsuario = "INSERT INTO usuario (idPersona, codigoUsuario, password, idRol, estado) VALUES (?, ?, ?, ?, ?)";
        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement psPersona = cn.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement psUsuario = cn.prepareStatement(sqlUsuario)) {
            
            psPersona.setString(1, usuario.getNombre());
            psPersona.setString(2, usuario.getApellidoPaterno());
            psPersona.setString(3, usuario.getApellidoMaterno());
            psPersona.setString(4, usuario.getDni());
            psPersona.executeUpdate();
        
            ResultSet rs = psPersona.getGeneratedKeys();
            if (rs.next()) {
                int idPersona = rs.getInt(1);
                
                psUsuario.setInt(1, idPersona);
                psUsuario.setString(2, usuario.getCodigoUsuario());
                psUsuario.setString(3, usuario.getPassword());  // Hashea en producción
                psUsuario.setInt(4, usuario.getRol().getIdRol());
                psUsuario.setString(5, usuario.getEstado());
                psUsuario.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    public boolean editarUsuario(Usuario usuario) {
    String sqlPersona = "UPDATE Persona SET nombre=?, apellidoPaterno=?, apellidoMaterno=?, dni=? WHERE idPersona=?";
    String sqlUsuario = "UPDATE usuario SET codigoUsuario=?, password=?, idRol=?, estado=? WHERE idPersona=?";
    try (Connection cn = ConexionBD.getConnection();
         PreparedStatement psPersona = cn.prepareStatement(sqlPersona);
         PreparedStatement psUsuario = cn.prepareStatement(sqlUsuario)) {
        
        psPersona.setString(1, usuario.getNombre());
        psPersona.setString(2, usuario.getApellidoPaterno());
        psPersona.setString(3, usuario.getApellidoMaterno());
        psPersona.setString(4, usuario.getDni());
        psPersona.setInt(5, usuario.getIdPersona());
        psPersona.executeUpdate();
        
        psUsuario.setString(1, usuario.getCodigoUsuario());
        psUsuario.setString(2, usuario.getPassword());
        psUsuario.setInt(3, usuario.getRol().getIdRol());
        psUsuario.setString(4, usuario.getEstado());
        psUsuario.setInt(5, usuario.getIdPersona());
        psUsuario.executeUpdate();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al editar usuario: " + e.getMessage());
        e.printStackTrace();
    }
        return false;
    }
}
