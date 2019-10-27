package Modelo;

import Vista.AgregarPartida;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private final String base = "sistema_contable";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);

        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    //Devuelve un result set con todos los datos de la consulta que hallamos requerido
    public ResultSet Consulta(String query) {
                    //IMPORTANTE CERRAR RESULT SET LUEGO DE USAR ESTA FUNCION
        try {
            //Nueva conexion
            Connection conex = this.getConexion();

            //creamos un estado de conexion
            Statement st = conex.createStatement();
            //Con dicho estado ejectuamos un query y capturamos los resultados en rs
            ResultSet rs = st.executeQuery(query);

            //removemos todo del combo box
            return rs;
            //cerramos la conexion cerrando el resultado obtenido

        } catch (SQLException ex) {
            Logger.getLogger(AgregarPartida.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void Ejecutar(String query){ //Ejecuta una query (que no sea consulta) con el comando ingresado
    
        try {
            //Nueva conexion
            Connection cone = this.getConexion();
  
            //creamos un estado de conexion
            Statement st = cone.createStatement();
            
            //Guardamos los datos con la query requerida
            st.execute(query);
            
            st.close();
            cone.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}


