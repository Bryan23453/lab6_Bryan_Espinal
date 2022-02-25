/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_bryan_espinal_.pkg12141139;

/**
 *
 * @author bryan
 */
public class cazadores extends aliens{
    int humanos;

    public cazadores() {
    }

    public cazadores(int humanos, String nombre, int edad, String raza, boolean amen) {
        super(nombre, edad, raza, amen);
        this.humanos = humanos;
    }

    public int getHumanos() {
        return humanos;
    }

    public void setHumanos(int humanos) {
        this.humanos = humanos;
    }

    @Override
    public String toString() {
        return super.toString()+" cazadores{" + "humanos=" + humanos + '}';
    }
    
    
}
