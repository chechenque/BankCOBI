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
public class Credito extends Tarjeta{
    private float credito;

    public Credito(float credito, int id, Date fechaApertura) {
        super(id, fechaApertura);
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}
