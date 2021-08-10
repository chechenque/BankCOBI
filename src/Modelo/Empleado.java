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
public class Empleado extends Usuario{
    private float sueldo;

    public Empleado(float sueldo, String rfc, String nombres, String aPaterno, String aMaterno, String contrasenna, int firma) {
        super(rfc, nombres, aPaterno, aMaterno, contrasenna, firma);
        this.sueldo = sueldo;
    }


    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
