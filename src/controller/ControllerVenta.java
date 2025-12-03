package controller;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Venta;

public class ControllerVenta {
   public List<Venta> listarVentas() {
        List<Venta> lista = new ArrayList<>();
        String sql = "SELECT idVenta, idUsuario, tipoDocumento, numeroDocumento, documentoCliente, "
               + "nombreCliente, montoPago, montoCambio, montoTotal, fechaRegistro "
               + "FROM VENTA";

        try (Connection cn = ConexionBD.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Venta v = new Venta();

                v.setIdVenta(rs.getInt("idVenta"));
                v.setIdUsuario(rs.getInt("idUsuario"));
                v.setTipoDocumento(rs.getString("tipoDocumento"));
                v.setNumeroDocumento(rs.getString("numeroDocumento"));
                v.setDocumentoCliente(rs.getString("documentoCliente"));
                v.setNombreCliente(rs.getString("nombreCliente"));
                v.setMontoPago(rs.getDouble("montoPago"));
                v.setMontoCambio(rs.getDouble("montoCambio"));
                v.setMontoTotal(rs.getDouble("montoTotal"));
                v.setFechaRegistro(rs.getTimestamp("fechaRegistro"));

                lista.add(v);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
