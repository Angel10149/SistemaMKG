
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionBD {

    private static final String SERVIDOR = "localhost"; //
    private static String BD = "BDSistemaMKG";
    
    private static final String URL = "jdbc:sqlserver://"
            +SERVIDOR+ ";databaseName="+BD+
            ";integratedSecurity=true" +
            ";encrypt=true" + ";trustServerCertificate=true"; 
    private static Connection conexion = null;
    
    public static Connection getConnection(){
        /*if (conexion==null){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conexion = DriverManager.getConnection(url);
                System.out.println("Conexion exitosa a "+BD);
                //return conexion;
            } catch (ClassNotFoundException e) {
                System.out.println("No se encontro el driver de SQL Server "+e.getMessage());                
            } catch(SQLException e){
                System.out.println("Error al conectar a la BD"+e.getMessage());
            }
        }
        return conexion;*/
        try {
            if (conexion == null || conexion.isClosed()) {

                // Cargar el driver (solo la primera vez)
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                conexion = DriverManager.getConnection(URL);

                System.out.println("Conexión exitosa a " + BD);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver SQL Server: " + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Error al conectar a BD: " + e.getMessage());
        }

        return conexion;
        /////
        /*try {
            // Cargar el driver JDBC de SQL Server (necesario para Java)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Crear una nueva conexión a SQL Server
            Connection cn = DriverManager.getConnection(url);

            // Mensaje para confirmar que se conectó correctamente
            System.out.println("Conexión exitosa a " + BD);

            // Devolvemos la conexión lista para usar
            return cn;

        } catch (ClassNotFoundException e) {
            // Error cuando el driver JDBC no está instalado en el proyecto
            System.out.println("No se encontró el driver SQL Server: " + e.getMessage());

        } catch (SQLException e) {
            // Error cuando no se puede establecer conexión (credenciales, instancia, permisos)
            System.out.println("Error al conectar a BD: " + e.getMessage());
        }

        // Si hubo algún error, se devuelve null
        return null;*/
    }
}
