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
public class MejorLiga {
    public static ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    
    public static void rellenarDatos(){
        //Rellenamos 20 equipos de Primera División
        for (int i=0; i < 20; i++){
            Primeradiv e = new Primeradiv();
            e.setNombre("Equipo de Primera "+(i+1));
            e.setAnofund(((int) (Math.random()*2016)));
            e.setNomestadio("Estadio de "+e.getNombre());
            e.setCapacestadio((int) (Math.random()*60000));
            ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
            for (int j=0; j < 22; j++){
                Jugador jug = new Jugador();
                jug.setNombre("Jugador de Primera "+(j+1));
                jug.setEdad((int) (Math.random()*34));
                jug.setPeso((int) (Math.random()*90));
                jug.setAltura((int) (Math.random()*230));
                jugadores.add(jug);
            }
            Entrenador ent = new Entrenador();
            ent.setNombre("Entrenador de Primera "+(i+1));
            ent.setEdad((int) (Math.random()*70));
            ent.setNacionalidad("Nacionalidad Entrenador");
            e.setEnt(ent);
            Masajista mas = new Masajista();
            mas.setNombre("Masajista de Primera "+(i+1));
            mas.setEdad((int) (Math.random()*65));
            mas.setNum_colegiado((int) (Math.random()*10000));
            e.setMasaj(mas);
            e.setJug(jugadores);
            equipos.add(e);
        }
        //Rellenamos 80 equipos de Segunda División
        for (int i=0; i < 80; i++){
            Segundadiv e = new Segundadiv();
            e.setNombre("Equipos de Segunda "+(i+1));
            e.setAnofund((int) (Math.random()*2016));
            ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
            for (int j=0; j < 22; j++){
                Jugador jug = new Jugador();
                jug.setNombre("Jugador de Segunda "+(j+1));
                jug.setEdad((int) (Math.random()*34));
                jug.setPeso((int) (Math.random()*90));
                jug.setAltura((int) (Math.random()*230));
                jugadores.add(jug);
            }
            Entrenador ent = new Entrenador();
            ent.setNombre("Entrenador de Segunda "+(i+1));
            ent.setEdad((int) (Math.random()*70));
            ent.setNacionalidad("Nacionalidad Entrenador");
            e.setEnt(ent);
            Masajista mas = new Masajista();
            mas.setNombre("Masajista de Segunda "+(i+1));
            mas.setEdad((int) (Math.random()*65));
            mas.setNum_colegiado((int) (Math.random()*10000));
            e.setMasaj(mas);
            e.setJug(jugadores);
            equipos.add(e);
        }
    }
//----------------------------------------------------------------------------------------------------    
    public static void traspasarJugador(Equipo e1, Equipo e2, Jugador jug) {
        e2.añadirJugador(jug);
        e1.borrarJugador(jug);
    }
//----------------------------------------------------------------------------------------------------    
    public void altaJugador(){
        
    }
//----------------------------------------------------------------------------------------------------    
    public void bajaJugador(){
        
    }
//----------------------------------------------------------------------------------------------------    
    public void traspasarStaff(){
        
    }
//----------------------------------------------------------------------------------------------------    
    public void unirJugadores(){
        
    }
//----------------------------------------------------------------------------------------------------    
    
    public static void main(String[] args) {
        rellenarDatos();
        traspasarJugador(equipos.get(18), equipos.get(81), equipos.get(18).getJug().get(6));
    }
    
}
