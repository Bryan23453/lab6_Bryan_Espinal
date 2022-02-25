/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_bryan_espinal_.pkg12141139;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class conquistadores extends aliens{
    ArrayList <planeta> plan=new ArrayList();

    public conquistadores() {
    }

    public conquistadores(String nombre, int edad, raza raza, boolean amen) {
        super(nombre, edad, raza, amen);
    }

    public ArrayList<planeta> getPlan() {
        return plan;
    }

    public void setPlan(ArrayList<planeta> plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
