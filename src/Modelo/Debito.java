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
public class Debito extends Tarjeta{
    private float saldo;

    public Debito(float saldo, int id, Date fechaApertura) {
        super(id, fechaApertura);
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
