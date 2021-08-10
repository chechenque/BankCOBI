package DAO;

import Conexion.Conectar;
import Modelo.Cliente;
import Modelo.Sucursal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisangel
 */
public class ClienteDAO {
    
    private final String SQL_INSERT = "";
    private final String SQL_SELECT = "SELECT * FROM SUCURSAL";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private Conectar con;
    private ResultSet RS;
    
    public ClienteDAO(){
        PS=null;
        con = new Conectar();
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        try{
            con.conecta();
            PS = con.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Cliente s;
            while(RS.next()){
                s = new Cliente(RS.getString("RFC"),
                        RS.getString("Nombres"),
                        RS.getString("APaterno"),
                        RS.getString("AMaterno"),
                        RS.getString("Contrasenna"),
                        RS.getInt("Firma"));
                listaCliente.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SucursalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            PS = null;
            RS = null;
            con.desconectar();
        }
        return listaCliente;
    }
}
