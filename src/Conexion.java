


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author alumno
 */
public class Conexion {
    
    public static Connection getConexion (){
        
        String conexionUrl = "jdbc:sqlserver://LABSERVER\\SQLEXPRESS:1433;"
                + "database=crudjava;"
                + "user = usuarioSQL;"
                + "password = Juan12345;"
                + "loginTimeout=30";
        
        try{
           Connection con = DriverManager.getConnection(conexionUrl);
           return con;
        }catch (SQLException ex){
            System.out.println(ex.toString());   
            return null;
        }
    }
    
}
