/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conectar;
import Modelo.Sucursal;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisangel
 */
public class SucursalDAO {
    
    private final String SQL_INSERT = "";
    private final String SQL_SELECT = "SELECT * FROM SUCURSAL";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private Conectar con;
    private ResultSet RS;
    
    public SucursalDAO(){
        PS=null;
        con = new Conectar();
    }
    
    public List<Sucursal> obtenerSucursales(){
        List<Sucursal> listaSucursales = new ArrayList<Sucursal>();
        
        try{
            con.conecta();
            PS = con.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Sucursal s;
            while(RS.next()){
                s = new Sucursal(RS.getInt("ID"),
                        RS.getString("Nombre"),
                        RS.getString("Calle"),
                        RS.getString("Colonia"),
                        RS.getString("CP"),
                        RS.getString("Estado"));
                listaSucursales.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SucursalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            PS = null;
            RS = null;
            con.desconectar();
        }
        return listaSucursales;
    }
    
    public static void main(String[] args){
        SucursalDAO sd= new SucursalDAO();
        List<Sucursal> s = sd.obtenerSucursales();
        
        System.out.println(s.get(0).getNombre());
    }
    
}
