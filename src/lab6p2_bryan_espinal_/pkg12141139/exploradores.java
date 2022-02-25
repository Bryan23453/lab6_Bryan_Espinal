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
public class exploradores extends aliens{
    ArrayList <planeta> plan=new ArrayList();
    planeta plafav;

    public exploradores() {
    }

    public exploradores(planeta plafav, String nombre, int edad, String raza, boolean amen) {
        super(nombre, edad, raza, amen);
        this.plafav = plafav;
    }

    public ArrayList<planeta> getPlan() {
        return plan;
    }

    public void setPlan(ArrayList<planeta> plan) {
        this.plan = plan;
    }

    public planeta getPlafav() {
        return plafav;
    }

    public void setPlafav(planeta plafav) {
        this.plafav = plafav;
    }

    @Override
    public String toString() {
        return super.toString()+ " exploradores{" + "plan=" + plan + ", plafav=" + plafav + '}';
    }
    
}
