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
public class planeta {
    String nombre;
    boolean agua;
    int tamanio;
    int temperatura;
    ArrayList <aliens> alie= new ArrayList();

    public planeta(String nombre, boolean agua, int tamanio, int temperatura) {
        this.nombre = nombre;
        this.agua = agua;
        this.tamanio = tamanio;
        this.temperatura = temperatura;
    }

    public planeta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<aliens> getAlie() {
        return alie;
    }

    public void setAlie(aliens alie) {
        this.alie.add(alie);
    }

    @Override
    public String toString() {
        return    nombre ;
    }
    

}
