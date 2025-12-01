
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
                   + "INNER JOIN TipoProducto t ON p.idTipo = t.idTipo"; //CORREGIR AQUÍ: nombres reales de tabla/campos
        String sql = "SELECT p.codigo, p.nombre AS nombreProducto, p.precio, p.stock, "
                   + "t.idTipo, t.nombre AS nombreTipo "
                   + "FROM producto p "
                   + "INNER JOIN TipoProducto t ON p.tipo = t.idTipo";*/
        String sql = "SELECT p.codigo, p.nombre AS nombreProducto, p.descripcion, "
        + "p.marca, p.precioCompra, p.precioVenta, p.margenGanancia, "
        + "p.stockActual, p.stockMinimo, p.stockMaximo, "
        + "c.idCategoria, c.nombre AS nombreCategoria "
        + "FROM Producto p "
        + "INNER JOIN Categoria c ON p.categ = c.idCategoria";

        try (Connection cn = ConexionBD.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producto p = new Producto();

                p.setCodigo(rs.getString("codigo"));
                p.setNombre(rs.getString("nombreProducto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setMarca(rs.getString("marca"));
                p.setPrecioCompra(rs.getDouble("precioCompra"));
                p.setPrecioVenta(rs.getDouble("precioVenta"));
                p.setMargenGanancia(rs.getDouble("margenGanancia"));
                p.setStockActual(rs.getInt("stockActual"));
                p.setStockMinimo(rs.getInt("stockMinimo"));
                p.setStockMaximo(rs.getInt("stockMaximo"));

                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNombre(rs.getString("nombreCategoria"));

                p.setCategoria(cat);

                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean registrarProducto(Producto p) {
         String sql = "INSERT INTO Producto "
               + "(codigo, nombre, descripcion, categ, marca, precioCompra, precioVenta, margenGanancia, stockActual, stockMinimo, stockMaximo) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDescripcion());
            ps.setInt(4, p.getCategoria().getIdCategoria());
            ps.setString(5, p.getMarca());
            ps.setDouble(6, p.getPrecioCompra());
            ps.setDouble(7, p.getPrecioVenta());
            ps.setDouble(8, p.getMargenGanancia());
            ps.setInt(9, p.getStockActual());
            ps.setInt(10, p.getStockMinimo());
            ps.setInt(11, p.getStockMaximo());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean actualizarProducto(Producto p) {
        String sql = "UPDATE Producto SET nombre=?, descripcion=?, categ=?, marca=?, "
               + "precioCompra=?, precioVenta=?, margenGanancia=?, "
               + "stockActual=?, stockMinimo=?, stockMaximo=? "
               + "WHERE codigo=?";

        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setInt(3, p.getCategoria().getIdCategoria());
            ps.setString(4, p.getMarca());
            ps.setDouble(5, p.getPrecioCompra());
            ps.setDouble(6, p.getPrecioVenta());
            ps.setDouble(7, p.getMargenGanancia());
            ps.setInt(8, p.getStockActual());
            ps.setInt(9, p.getStockMinimo());
            ps.setInt(10, p.getStockMaximo());
            ps.setString(11, p.getCodigo());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean eliminarProducto(String codigo) {
        String sql = "DELETE FROM Producto WHERE codigo = ?";

        try (Connection cn = ConexionBD.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, codigo);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}

