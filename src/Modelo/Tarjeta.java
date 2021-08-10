/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author luisangel
 */
public class Tarjeta {
    private int id;
    private Date fechaApertura;

    public Tarjeta(int id, Date fechaApertura) {
        this.id = id;
        this.fechaApertura = fechaApertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
    
}
