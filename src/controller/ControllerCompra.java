package controller;

import conexion.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import model.Compra;
import model.DetalleCompra;
import model.Producto;
import model.Proveedor;

public class ControllerCompra {

    public boolean registrarCompra(Compra compra) {
        String sqlCompra = "INSERT INTO compra(fecha, total, estado) VALUES (?,?,?)";
        String sqlDetalle = "INSERT INTO detalleCompra(idCompra, idProducto, cantidad, precioUnitario, subtotal) VALUES (?,?,?,?,?)";

        try (Connection con = ConexionBD.getConnection()) {

            con.setAutoCommit(false);

            PreparedStatement psCompra = con.prepareStatement(sqlCompra, Statement.RETURN_GENERATED_KEYS);
            psCompra.setDate(1, new java.sql.Date(compra.getFecha().getTime()));
            psCompra.setDouble(2, compra.getTotal());
            psCompra.setString(3, compra.getEstado());
            psCompra.executeUpdate();

            ResultSet rs = psCompra.getGeneratedKeys();
            int idCompra = 0;
            if (rs.next()) idCompra = rs.getInt(1);

            PreparedStatement psDetalle = con.prepareStatement(sqlDetalle);

            for (DetalleCompra d : compra.getDetalles()) {
                psDetalle.setInt(1, idCompra);
                psDetalle.setInt(2, Integer.parseInt(d.getProducto().getCodigo()));
                psDetalle.setInt(3, d.getCantidad());
                psDetalle.setDouble(4, d.getPrecioUnitario());
                psDetalle.setDouble(5, d.Subtotal());
                psDetalle.addBatch();
            }

            psDetalle.executeBatch();
            con.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Compra> listarCompras() {
        ArrayList<Compra> lista = new ArrayList<>();
        String sql = "SELECT * FROM compra ORDER BY idCompra DESC";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Compra c = new Compra();
                c.setIdCompra(rs.getInt("idCompra"));
                c.setFecha(rs.getDate("fecha"));
                c.setTotal(rs.getDouble("total"));
                c.setEstado(rs.getString("estado"));

                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
