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
public class raza {
    planeta plat;
    String nom;

    public raza() {
    }

    public raza(planeta plat, String nom) {
        this.plat = plat;
        this.nom = nom;
    }

    public planeta getPlat() {
        return plat;
    }

    public void setPlat(planeta plat) {
        this.plat = plat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return  nom ;
    }
    
}
