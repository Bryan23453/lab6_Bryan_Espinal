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
public class aliens {
    String nombre;
    int edad;
    String raza;
    boolean amen;

    public aliens() {
    }

    public aliens(String nombre, int edad, String raza, boolean amen) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.amen = amen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isAmen() {
        return amen;
    }

    public void setAmen(boolean amen) {
        this.amen = amen;
    }

    @Override
    public String toString() {
        return "aliens{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", amen=" + amen + '}';
    }
    
    
}
