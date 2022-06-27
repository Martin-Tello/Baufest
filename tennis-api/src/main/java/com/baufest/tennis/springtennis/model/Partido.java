package com.baufest.tennis.springtennis.model;

import java.util.Date;

public class Partido {
    private int id;
    private Date fechaComienzo;
    private String estado;
    private Jugador jugadorLocal;
    private Jugador jugadorVisitante;
    private int scoreLocal;
    private int puntosGameActualLocal;
    private int cantidadGamesLocal;
    private int scoreVisitante;
    private int puntosGameActualVisitante;
    private int cantidadGamesVisitante;

    public Partido(){

    }

    public Partido(int id, Date fechaComienzo, String estado, Jugador jugadorLocal, Jugador jugadorVisitante, int scoreLocal, int puntosGameActualLocal, int cantidadGamesLocal, int scoreVisitante, int puntosGameActualVisitante, int cantidadGamesVisitante) {
        this.id = id;
        this.fechaComienzo = fechaComienzo;
        this.estado = estado;
        this.jugadorLocal = jugadorLocal;
        this.jugadorVisitante = jugadorVisitante;
        this.scoreLocal = scoreLocal;
        this.puntosGameActualLocal = puntosGameActualLocal;
        this.cantidadGamesLocal = cantidadGamesLocal;
        this.scoreVisitante = scoreVisitante;
        this.puntosGameActualVisitante = puntosGameActualVisitante;
        this.cantidadGamesVisitante = cantidadGamesVisitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Jugador getJugadorLocal() {
        return jugadorLocal;
    }

    public void setJugadorLocal(Jugador jugadorLocal) {
        this.jugadorLocal = jugadorLocal;
    }

    public Jugador getJugadorVisitante() {
        return jugadorVisitante;
    }

    public void setJugadorVisitante(Jugador jugadorVisitante) {
        this.jugadorVisitante = jugadorVisitante;
    }

    public int getScoreLocal() {
        return scoreLocal;
    }

    public void setScoreLocal(int scoreLocal) {
        this.scoreLocal = scoreLocal;
    }

    public int getPuntosGameActualLocal() {
        return puntosGameActualLocal;
    }

    public void setPuntosGameActualLocal(int puntosGameActualLocal) {
        this.puntosGameActualLocal = puntosGameActualLocal;
    }

    public int getCantidadGamesLocal() {
        return cantidadGamesLocal;
    }

    public void setCantidadGamesLocal(int cantidadGamesLocal) {
        this.cantidadGamesLocal = cantidadGamesLocal;
    }

    public int getScoreVisitante() {
        return scoreVisitante;
    }

    public void setScoreVisitante(int scoreVisitante) {
        this.scoreVisitante = scoreVisitante;
    }

    public int getPuntosGameActualVisitante() {
        return puntosGameActualVisitante;
    }

    public void setPuntosGameActualVisitante(int puntosGameActualVisitante) {
        this.puntosGameActualVisitante = puntosGameActualVisitante;
    }

    public int getCantidadGamesVisitante() {
        return cantidadGamesVisitante;
    }

    public void setCantidadGamesVisitante(int cantidadGamesVisitante) {
        this.cantidadGamesVisitante = cantidadGamesVisitante;
    }
}
