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
public class abduzcan extends aliens{
    int animabdu;

    public abduzcan() {
    }

    public abduzcan(int animabdu, String nombre, int edad, raza raza, boolean amen) {
        super(nombre, edad, raza, amen);
        this.animabdu = animabdu;
    }

    public int getAnimabdu() {
        return animabdu;
    }

    public void setAnimabdu(int animabdu) {
        this.animabdu = animabdu;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
