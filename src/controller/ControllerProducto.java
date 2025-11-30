
package controller;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Producto;
import model.TipoProducto;
public class ControllerProducto{
   public List<Producto> listarProductos() {
        List<Producto> lista = new ArrayList<>();
        /*String sql = "SELECT p.codigo, p.nombre AS nombreProducto, p.precio, p.stock, "
                   + "t.idTipo, t.nombre AS nombreTipo"
                   + " FROM producto p "
                   + "INNER JOIN TipoProducto t ON p.idTipo = t.idTipo"; //CORREGIR AQUÍ: nombres reales de tabla/campos*/
        String sql = "SELECT p.codigo, p.nombre AS nombreProducto, p.precio, p.stock, "
                   + "t.idTipo, t.nombre AS nombreTipo "
                   + "FROM producto p "
                   + "INNER JOIN TipoProducto t ON p.tipo = t.idTipo";

        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producto p = new Producto();
                p.setCodigo(rs.getString("codigo"));  
                p.setNombre(rs.getString("nombreProducto"));    
                p.setPrecioCompra(rs.getDouble("precio"));    
                p.setStockActual(rs.getInt("stock"));          

                Categoria tp = new Categoria();
                tp.setIdCategoria(rs.getInt("idTipo"));      //CORREGIR AQUÍ
                tp.setNombre(rs.getString("nombreTipo"));   //CORREGIR AQUÍ

                p.setCategoria(tp);
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean registrarProducto(Producto p) {
        String sql = "INSERT INTO producto (nombre, precio, stock, tipo) "
                   + "VALUES (?, ?, ?, ?)"; //CORREGIR AQUÍ
        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecioCompra());
            ps.setInt(3, (int) p.getStockActual());
            ps.setInt(4, p.getCategoria().getIdCategoria());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace(); // podrías manejar mejor el error
        }
        return false;
    }

    public boolean actualizarProducto(Producto p) {
        String sql = "UPDATE producto "
                   + "SET nombre = ?, precio = ?, stock = ?, tipo = ? "
                   + "WHERE codigo = ?";  
        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecioCompra());
            ps.setInt(3, (int) p.getStockActual());
            ps.setInt(4, p.getCategoria().getIdCategoria());
            ps.setString(5, p.getCodigo());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean eliminarProducto(int idProducto) {
        String sql = "DELETE FROM producto WHERE codigo = ?"; //CORREGIR AQUÍ
        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idProducto);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

