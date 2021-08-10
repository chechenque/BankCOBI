/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author luisangel
 */
public class Usuario {
    
    private String rfc;
    private String nombres;
    private String aPaterno;
    private String aMaterno;
    private String contrasenna;
    private int firma;
    //Domicilio

    public Usuario(String rfc, String nombres, String aPaterno, String aMaterno, String contrasenna, int firma) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.contrasenna = contrasenna;
        this.firma = firma;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public int getFirma() {
        return firma;
    }

    public void setFirma(int firma) {
        this.firma = firma;
    }

    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
