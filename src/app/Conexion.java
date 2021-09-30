
package app;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author erick
 */
public class Conexion {
    

    public static Connection getConexion(){
        
        String url ="jdbc:sqlserver://localhost:1433;"
                + "database=TrabajadoresPrueba;"
                + "user=DESKTOP-47S19K0\\erick;"
                +   "password=";
        
        try{
             
         
           Connection con = DriverManager.getConnection(url);
    
           CallableStatement csta= con.prepareCall("[usp_registrarpersonal(?,?,?,?)]");
        return con;
        }catch(SQLException e){
            System.out.println(e.toString());
              return null;
        }
      
        
    }
}
