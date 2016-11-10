/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejorliga;

import java.util.ArrayList;

/**
 *
 * @author DaniL
 */
public abstract class Equipo {
    private String nombre;
    private int anofund;
    ArrayList<Jugador> jug = new ArrayList<Jugador>();
    private Entrenador ent;
    private Masajista masaj;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnofund() {
        return anofund;
    }

    public void setAnofund(int añofund) {
        this.anofund = añofund;
    }

    public Entrenador getEnt() {
        return ent;
    }

    public void setEnt(Entrenador ent) {
        this.ent = ent;
    }

    public Masajista getMasaj() {
        return masaj;
    }

    public ArrayList<Jugador> getJug() {
        return jug;
    }

    public void setJug(ArrayList<Jugador> jug) {
        this.jug = jug;
    }

    public void setMasaj(Masajista masaj) {
        this.masaj = masaj;
    }
    
    public void añadirJugador(Jugador jug){
        this.jug.add(jug);
    }
    
    public void borrarJugador(Jugador jug){
        this.jug.remove(jug);
    }
    
}
