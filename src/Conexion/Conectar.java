package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luisangel
 */
public class Conectar {
    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/bankcobi"+"?useTimezone=true&serverTimezone=UTC";
    
    public Conectar(){
        
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public void conecta(){
        con = null;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if(con != null) System.out.println("Conexion establecida...");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error al conectar "+ e);
        }
    }
    
    public void desconectar(){
        con = null;
        if(con == null) System.out.println("Conexion terminada...");
    }
}
